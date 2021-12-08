package com.company;

public class Restaurant extends Wagon{
    static final int spots = 45;
    static final double Length = 23.6;
    static final int Valuemln = 35;
    public Restaurant ()
    {   super(Length,Valuemln);
    }

    public void getmenu()
    {
        System.out.println("       МЕНЮ \nХлеб с колбасой - 420р \nСолёный огурец - 50р \nСтакан водки - 250р");
    }

}
