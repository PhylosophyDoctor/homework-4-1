package com.company;

public class Train {
private int wagonsquantity;
    private String state;

public Train(Object Loco)
{

}

    public void state(String state)
    {
        switch (state) {
            case "хреновое" :  System.out.println("Высокие расходы на амортизацию"); break;
            case "нормальное" :  System.out.println("Средние расходы на амортизацию"); break;
            case "отличное" :  System.out.println("Расходов на амортизацию нет, поезда как новенькие! Партия гордится вами! "); break;
    }
    }
    }

