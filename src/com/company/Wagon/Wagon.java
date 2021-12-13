package com.company.Wagon;

import com.company.Interfaces.SELL;
import com.company.Interfaces.TERMINATE;

public abstract class Wagon implements SELL, TERMINATE {
 double length;
    int value;
    boolean existence = true;


public Wagon (double length, int value)
{
    this.length=length;
    this.value=value;

}

public void transfer (String cityfrom,String cityto, int number )
{
    System.out.printf("\nВагон номер %s перевезён из города %s в город %s", number, cityfrom, cityto);
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
