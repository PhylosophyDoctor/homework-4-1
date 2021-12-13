package com.company.Assets;

public class Depo extends Facility{

    @Override
    public void terminate () {
        if (existence) {
            existence = false;
            System.out.println("\nВы успешно снесли государственную собственность - депо");
        } else { System.out.println("\nУничтожить депо, которое вы продали? Гениально!");

        }
    }
    @Override
    public void sell() {
        if (existence) {
            existence=false;
            System.out.println("\nВы успешно продали депо, правда теперь не понятно, куда мы будем ставить вагоны и локомотивы!");
        } else { System.out.println("\nДепо разрушено или уже продано");

        }
    }
}
