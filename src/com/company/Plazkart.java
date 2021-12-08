package com.company;

public class Plazkart extends Wagon {
static final int spots = 54;
static final double Length = 23.6;
static final int Valuemln = 15;
int passquantity;
public Plazkart ()
{   super(Length,Valuemln);
}

public void fill (int newcomers)
{
    passquantity= passquantity+newcomers;
    if (passquantity > spots) {


        System.out.printf("\nСлишком много бюджетников, засуньте %s бюджетника(ов) в другой вагон", passquantity-spots);
        passquantity = 54;
    }
    else {

        System.out.printf("\nВагон заполнен бюджетниками на %.2f процентов, осталось %s мест(а)", (double)passquantity/spots*100, spots-passquantity );
    }
}


}
