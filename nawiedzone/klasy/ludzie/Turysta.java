package nawiedzone.klasy.ludzie;

public class Turysta extends Gosc{

    public Turysta() {
        super();
    }

    @Override
    public void nastraszMnie(int moc) {
        if (moc > this.getOdpornosc()){
            if (this.getStan() == Stan.NORMALNY){
                this.setStan(Stan.PRZERAZONY);
            } else if (this.getStan()  == Stan.PRZERAZONY) {
                this.setStan(Stan.PANIKA);
            }
        }

        if (moc < this.getOdpornosc()){
            if (this.getStan()  == Stan.PANIKA){
                this.setStan(Stan.NORMALNY);
            } else if (this.getStan()  == Stan.PRZERAZONY) {
                this.setStan(Stan.NORMALNY);
            }
        }

        System.out.println("Stan turysty: " + this.getStan());
    }

}
