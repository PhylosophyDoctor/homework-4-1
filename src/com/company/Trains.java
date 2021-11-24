package com.company;

public class Trains {
private int quantity;
    private String state;

public void maintenance(int quantity)
    {
        int pertrain = 2500;
int maintenance = quantity*pertrain;
        System.out.println("Годовое содержание" + quantity + " поездов - " + maintenance);
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

