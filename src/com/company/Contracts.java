package com.company;

public class Contracts {
    private int startage; //начало действия договора
    private int endage; //окончание действия договора
    private String organization;
    int currentyear; //текущий год
    int quantity;

    public Contracts(int startage, int endage) {
        if (startage > currentyear) {
            System.out.println("Пока можно не париться");
        } else {
            if (endage < currentyear) {
                System.out.println("Уже можно забить");
            }

        }
    }

}