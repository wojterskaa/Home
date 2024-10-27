package nawiedzone.klasy.miejsca;

import nawiedzone.klasy.ludzie.Gosc;

public class StaryZamek extends Budynek{

    private static int mocBialychDam = 20;

    public StaryZamek() {
        super();
    }

    public class BialaDama extends Straszydlak {

        @Override
        public void nastraszKogos(Gosc gosc) {
            gosc.nastraszMnie(mocBialychDam); // Wywołanie metody na gościu
        }
    }

    @Override
    public void nawiedz(Gosc gosc) {

        class DuchWlasciciela extends Straszydlak{
            private final int moc = 0; // Moc Ducha, siła zerowa

            public void nastraszKogos(Gosc gosc) {
                gosc.nastraszMnie(moc); // Wywołanie metody na gościu
            }
        }

        // Tworzenie dwóch instancji Ducha
        DuchWlasciciela duch1 = new DuchWlasciciela();
        DuchWlasciciela duch2 = new DuchWlasciciela();
        BialaDama bialaDama = new BialaDama();
        // Straszenie gościa

        bialaDama.nastraszKogos(gosc);
        duch1.nastraszKogos(gosc);
        duch2.nastraszKogos(gosc);
    }


}
