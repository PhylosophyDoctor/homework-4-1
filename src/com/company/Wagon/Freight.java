package com.company.Wagon;

public class Freight extends Wagon{
        static final int TONNAGE = 220;
        static final double LENGTH = 15.7;
        static final int VALUE_MLN = 7;
        int actualloading;
        public Freight ()
        {   super(LENGTH,VALUE_MLN);
        }

        public void load ( int mass) {
            if (actualloading + mass > TONNAGE) {
                System.out.printf("\nЛеееее куда перегружаем,осторожней, вагон так то %s лямов стоит", VALUE_MLN);

            } else
            { actualloading= actualloading+mass;
                System.out.printf("\nУспешно загружено %s тонн груза, можно загрузить ещё %s тонн",mass, TONNAGE-actualloading);

            }
        }
    @Override
    public void sell() {
        if (existence) {
            existence = false;
            System.out.println("\nВы успешно продали товарный вагон и обидели этим директора УралВагонЗавода, он больше с вами не играет!");
        } else {
            System.out.println("\nТоварный вагон уничтожен или уже продан ");
        }
    }
    @Override
    public void terminate ()
    { if (existence) { existence = false;
        System.out.println("\nВы успешно уничтожили товарный вагон");
    } else {  System.out.println("\nУничтожить товарный вагон, который вы продали? Хм, да вы настоящий злодей!");
    }

    }

}
