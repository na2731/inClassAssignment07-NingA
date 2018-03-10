package com.example.android.chinesecuisine;

import android.widget.TextView;

import java.io.Serializable;

/**
 * Created by anning on 2018/3/9.
 */

public class OrderSumm implements Serializable {
    private String Address;
    private int Tel;
    private boolean Wrap;
    private double totalprice;



    public  OrderSumm(String Address,int Tel,boolean Wrap, double totalprice){
        this.Address=Address;
        this.Tel=Tel;
        this.Wrap=Wrap;
        this.totalprice = totalprice;
    }

    public String getAddress(){return Address;}
    public int getTel(){return Tel;}
    public boolean getWrap(){return Wrap;}
    public double getPrice(){return totalprice;}

}
