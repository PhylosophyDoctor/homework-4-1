package com.company.Wagon;

public class Plazkart extends Wagon {
static final int SPOTS = 54;
static final double LENGTH = 23.6;
static final int VALUE_MLN = 15;
public int passquantity;
public Plazkart ()
{   super(LENGTH,VALUE_MLN);
}

public void fill (int newcomers)
{
    passquantity= passquantity+newcomers;
    if (passquantity > SPOTS) {


        System.out.printf("\nСлишком много бюджетников, засуньте %s бюджетника(ов) в другой вагон", passquantity-SPOTS);
        passquantity = 54;
    }
    else {

        System.out.printf("\nВы успешно продали %s билетов. Вагон заполнен бюджетниками на %.2f процентов, осталось %s мест(а)",newcomers, (double)passquantity/SPOTS*100, SPOTS-passquantity );
    }
}

    @Override
    public void sell() {
        if (existence) {
            existence = false;
            System.out.println("\nВы успешно продали плацкартный вагон, поразительно, что его кто-то купил!");
        } else {
            System.out.println("\nПлацкартный вагон  уничтожен или уже продан ");
        }
    }
    @Override
    public void terminate () {
        if (existence) {
            existence = false;
            System.out.println("\nВы успешно уничтожили плацкартный вагон");
        } else {
            System.out.println("\nУничтожить плацкартный вагон, который вы продали? Хм, да вы настоящий злодей!");
        }
    }

}
