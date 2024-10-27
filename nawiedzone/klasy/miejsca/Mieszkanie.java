package nawiedzone.klasy.miejsca;

import nawiedzone.klasy.ludzie.*;

import java.util.Random;

public abstract class Mieszkanie extends Budynek{

    private final int kwotaZaleglosci;

    public Mieszkanie() {

        super();
        Random random = new Random();
        this.kwotaZaleglosci = 1 + random.nextInt(100); // nextInt(11) zwraca liczby od 0 do 10

    }

    protected class DuchKomornika extends Straszydlak{

        final int moc = (int) Math.round(kwotaZaleglosci / 500.0);

        @Override
        public void nastraszKogos(Gosc gosc) {
            gosc.nastraszMnie(moc);
        }
    }

    protected abstract void nawiedzLazienke(Gosc gosc);

    protected abstract void nawiedzPralnie(Gosc gosc);
}
