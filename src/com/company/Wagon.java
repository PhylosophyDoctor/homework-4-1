package com.company;

public class Wagon {
   double length;
    int value;


public Wagon (double length, int value)
{
    this.length=length;
    this.value=value;

}

public void transfer (String cityfrom,String cityto, int number )
{
    System.out.printf("Вагон номер %s перевезён из города %s в город %s", number, cityfrom, cityto);
}


//public int calculate_wagon_cost(String status)
//{ switch (status) {
//    case "эконом": cost = spot_cost1*spots; break;
//    case  "бизнес": cost = spot_cost2*spots; break;
//    case  "вип": cost = spot_cost3*spots; break;
//}
//    return(cost);
//}

}
