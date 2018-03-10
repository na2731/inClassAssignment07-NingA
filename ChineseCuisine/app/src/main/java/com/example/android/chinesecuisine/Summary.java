package com.example.android.chinesecuisine;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Summary extends AppCompatActivity implements Keys{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
        setTitle("Summary");

        Intent i = getIntent();
        OrderSumm a = (OrderSumm) i.getSerializableExtra("MyClass");
        display(a);
    }



    public void display(OrderSumm a) {
        TextView TextView1 = (TextView) findViewById(R.id.textview);
        TextView1.setText(Keys.ADDRESS + a.getAddress() + '\n' + Keys.TEL + a.getTel()  + '\n' + Keys.W+ a.getWrap() + '\n' + Keys.PRICE + a.getPrice());

    }

    public void exitclick(View v){
        finish();
    }
}