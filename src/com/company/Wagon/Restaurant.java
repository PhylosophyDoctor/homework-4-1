package com.company.Wagon;

public class Restaurant extends Wagon{
    static final int SPOTS = 45;
    static final double LENGTH = 23.6;
    static final int VALUE_MLN = 35;
    public Restaurant ()
    {   super(LENGTH,VALUE_MLN);
    }

    public void getmenu()
    {
        System.out.println("\n       МЕНЮ ВАГОНА-РЕСТОРАНА\nХлеб с колбасой - 420р \nСолёный огурец - 50р \nСтакан водки - 250р");
    }

    @Override
    public void sell() {
        if (existence) {
            existence = false;
            System.out.println("\nВы успешно продали вагон-ресторан, единственный вагон, который приносил прибыль, поздравляю!");
        } else {
            System.out.println("\nВагон-ресторан уничтожен или уже продан ");
        }
    }
    @Override
    public void terminate () {
        if (existence) {
            existence = false;
            System.out.println("\nВы успешно уничтожили плацкартный вагон-ресторан");
            System.out.println("\nУничтожить вагон-ресторан, который вы продали? Хм, да вы настоящий злодей!");
        }
    }
}
