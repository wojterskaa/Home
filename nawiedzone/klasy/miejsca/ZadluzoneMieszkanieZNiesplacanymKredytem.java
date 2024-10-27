package nawiedzone.klasy.miejsca;

import nawiedzone.klasy.ludzie.Gosc;

public class ZadluzoneMieszkanieZNiesplacanymKredytem extends Mieszkanie{

    public ZadluzoneMieszkanieZNiesplacanymKredytem() {
        super();
    }

    @Override
    public void nawiedz(Gosc gosc) {
        nawiedzLazienke(gosc);
        nawiedzPralnie(gosc);

    }

    @Override
    protected void nawiedzPralnie(Gosc gosc) {
        DuchKomornika duch1 = new DuchKomornika();
        DuchKomornika duch2 = new DuchKomornika();

        duch1.nastraszKogos(gosc);
        duch2.nastraszKogos(gosc);
    }

    @Override
    protected void nawiedzLazienke(Gosc gosc) {
        DuchKomornika duch1 = new DuchKomornika();

        duch1.nastraszKogos(gosc);
    }
}
