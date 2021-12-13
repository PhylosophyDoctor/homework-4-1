package com.company.Assets;

public class Station extends Facility{
    int station_money;
    final static int PER_MONTH = 150000;
    public void send_money (int money)
    {
        station_money = station_money + money*1000;
        System.out.println("Деньги в размере "+ money*1000 + "  рублей получены.");
    }

    public void check_maintenance (String station, String area)
    {

        if (station_money<=0) {
            System.out.println("\nСтанция не функционирует. Примечание: дайте деняк!");

        }
        else {
            System.out.printf("\nСпасибо,босс, ещё %s месяца(ев) протянем", station_money/PER_MONTH);
        }

    }
    @Override
    public void terminate ()
    { if (existence) { existence = false;
        System.out.println("\nВы успешно снесли государственную собственность - станцию");
    } else {  System.out.println("\nСнести станцию, которую вы продали? Гениально!");
    }

    }





    @Override
    public void sell() {
        if (existence) {
            existence = false;
            System.out.println("\nК СОЖАЛЕНИЮ, в этой стране вы являетесь монополистом, поэтому станцию продать просто некому!");
        } else {   System.out.println("\nСтанция разрушена или уже продана");

        }
    }

}
