package com.company;

import com.company.Assets.Depo;
import com.company.Assets.Station;
import com.company.Interfaces.SELL;
import com.company.Wagon.Freight;
import com.company.Wagon.Loco;
import com.company.Wagon.Plazkart;
import com.company.Wagon.Restaurant;

public class Main {

    public static void main(String[] args) {
        // write your code here




        Plazkart s1 = new Plazkart();
        s1.transfer("Саратов", "Магадан", 15);
        s1.passquantity = 40;
        s1.fill(5);
        s1.fill(15);
        s1.sell();


        Freight s2 = new Freight();
        s2.load(150);
        s2.load(150);
        s2.sell();


        Loco s3 = new Loco();
        s3.whatisloco();
        s3.sell();


        Restaurant s4 = new Restaurant();
        s4.getmenu();
        s4.sell();


        Depo s5 = new Depo();
        s5.terminate();
        s5.sell();


        Station s6 = new Station();
        s6.check_maintenance("Зажопинская","СФО");
        s6.send_money(5000);
        s6.check_maintenance("Зажопинская","СФО");
        s6.sell();
        s6.terminate();




    }




}
