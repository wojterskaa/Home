package nawiedzone.klasy.ludzie;

import java.util.Random;

public abstract class Gosc {

    private int odpornosc;

    private Stan stan;

    public Gosc() {

        Random random = new Random();
        int odpornosc = 10 + random.nextInt(11); // nextInt(11) zwraca liczby od 0 do 10
        this.stan = Stan.NORMALNY;
        this.odpornosc = odpornosc;
    }

    public abstract void nastraszMnie(int moc);

    @Override
    public String toString() {
        return "Aktualny stan człowieka: " +
                 stan +
                '.';
    }

    public Stan getStan() {
        return stan;
    }

    public void setStan(Stan stan) {
        this.stan = stan;
    }

    public int getOdpornosc() {
        return odpornosc;
    }
}
