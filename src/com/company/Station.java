package com.company;

public class Station {
    int station_money;
    public void send_money (int money)
    {
        station_money = station_money + money;
        System.out.println("Деньги в размере "+ money + " рублей получены.");
    }

    public void check_maintenance (String station, String area)
    {

        if (station_money<=0) {
            System.out.println("Станция не функционирует. Примечание: дайте деняк!");

        }

    }


}
