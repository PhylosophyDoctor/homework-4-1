package com.company;

public class Freight extends Wagon{
        static final int tonnage = 220;
        static final double Length = 15.7;
        static final int Valuemln = 7;
        int actualloading;
        public Freight ()
        {   super(Length,Valuemln);
        }

        public void load ( int mass) {
            if (actualloading + mass > tonnage) {
                System.out.printf("\nЛеееее куда перегружаем,осторожней, вагон так то %s лямов стоит", Valuemln);

            } else
            { actualloading= actualloading+mass;
                System.out.printf("\nУспешно загружено %s тонн груза, можно загрузить ещё %s тонн",mass, tonnage-actualloading);

            }
        }
}
