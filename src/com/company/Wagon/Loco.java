package com.company.Wagon;

public class Loco extends Wagon {


    static final double LENGTH = 18.1;
    static final int VALUE_MLN = 50;

    public Loco ()
    {   super(LENGTH,VALUE_MLN);
    }

    public void whatisloco ()
    {
        System.out.println("Локомотив это вагон, который возит другие вагоны!");
    }

    @Override
    public void sell() {
        if (existence) {
            existence = false;
            System.out.println("\nВы успешно продали локомотив,осталось дождаться того дня, когда вагоны научатся возить себя самостоятельно!");
        } else {
            System.out.println("\nЛокомотив уничтожен или уже продан ");
        }
    }
    @Override
    public void terminate () {
        if (existence) {
            existence = false;
            System.out.println("\nВы успешно уничтожили локомотив");
        } else {
            System.out.println("\nУничтожить локомотив, который вы продали? Хм, да вы настоящий злодей!");
        }
    }
}
