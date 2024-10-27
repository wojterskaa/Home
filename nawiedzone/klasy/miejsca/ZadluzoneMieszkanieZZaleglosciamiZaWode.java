package nawiedzone.klasy.miejsca;

import nawiedzone.klasy.ludzie.Gosc;

import java.util.Random;

public class ZadluzoneMieszkanieZZaleglosciamiZaWode extends Mieszkanie{

    public ZadluzoneMieszkanieZZaleglosciamiZaWode() {
        super();
    }

    private class DuchPlywaka extends Straszydlak{

        Random random = new Random();
        int los = 10 + random.nextInt(21);

        private final int moc = los;

        @Override
        public void nastraszKogos(Gosc gosc) {
            gosc.nastraszMnie(moc);
        }
    }

    @Override
    protected void nawiedzPralnie(Gosc gosc) {
        DuchKomornika duch1 = new DuchKomornika();

        duch1.nastraszKogos(gosc);
    }

    @Override
    protected void nawiedzLazienke(Gosc gosc) {
        DuchPlywaka duch1 = new DuchPlywaka();
        DuchPlywaka duch2 = new DuchPlywaka();

        duch1.nastraszKogos(gosc);
        duch2.nastraszKogos(gosc);
    }

    @Override
    public void nawiedz(Gosc gosc) {
        Random random = new Random();
        int i = random.nextInt(2); // losuje 0 lub 1

        if (i == 0){
            nawiedzLazienke(gosc);
        } else if (i == 1){
            nawiedzPralnie(gosc);
        }

    }


}
