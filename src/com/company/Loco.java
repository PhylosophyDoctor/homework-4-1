package com.company;

public class Loco extends Wagon {

    static final int spots = 2;
    static final double Length = 18.1;
    static final int Valuemln = 50;

    public Loco ()
    {   super(Length,Valuemln);
    }

    public void whatisloco ()
    {
        System.out.println("Локомотив это вагон, который возит другие вагоны!");
    }
}
