package nawiedzone.klasy.miejsca;

import nawiedzone.klasy.ludzie.*;

public abstract class Budynek {

    public Budynek() {
    }

    protected abstract static class Straszydlak{

        public abstract void nastraszKogos(Gosc gosc);
    }

    public abstract void nawiedz(Gosc gosc);
}
