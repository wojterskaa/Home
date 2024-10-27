package nawiedzone.klasy.miejsca;

import nawiedzone.klasy.ludzie.Gosc;
import nawiedzone.klasy.ludzie.Stan;

public class OpuszczonySzpital extends Budynek{

    public OpuszczonySzpital() {
        super();
    }

    @Override
    public void nawiedz(Gosc gosc) {
        Straszydlak straszydlak = new Straszydlak() {
            private final int moc = 15; // Moc straszenia

            @Override
            public void nastraszKogos(Gosc gosc) {
                // Sprawdzanie stanu strachu gościa
                if (gosc.getStan() == Stan.NORMALNY) {
                    gosc.nastraszMnie(moc); // Wywołanie metody na gościu
                }
            }

        };

        straszydlak.nastraszKogos(gosc);

    }
}
