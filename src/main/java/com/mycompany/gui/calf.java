package com.mycompany.gui;


public class calf {
    private float no1,no2;
    
    public void setVal(float a,float b){
        this.no1=a;
        this.no2=b;
    }
    
    public float sum(){
        float x=no1+no2;
        return x;
    }
     public float sub(){
        float y=no1-no2;
        return y;
    }
     public float mul(){
        float z=no1*no2;
        return z;
    }
      public float div(){
        float k=no1/no2;
        return k;
    }
}
