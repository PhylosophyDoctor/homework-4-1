package com.company;

public class Wagon {
    private int length;
    private int spots = 225;
    private String status; //эконом, бизнес, вип
    private int spotcost1 = 1500;
    private int spotcost2 = 3000;
    private int spotcost3 = 6000;
    int cost;


public int calculatewagoncost(String status)
{ switch (status) {
    case "эконом": cost = spotcost1*spots; break;
    case  "бизнес": cost = spotcost2*spots; break;
    case  "вип": cost = spotcost3*spots; break;
}
    return(cost);
}

}
