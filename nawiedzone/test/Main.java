package nawiedzone.test;

import nawiedzone.klasy.ludzie.Student;
import nawiedzone.klasy.ludzie.Turysta;
import nawiedzone.klasy.miejsca.OpuszczonySzpital;
import nawiedzone.klasy.miejsca.StaryZamek;
import nawiedzone.klasy.miejsca.ZadluzoneMieszkanieZNiesplacanymKredytem;
import nawiedzone.klasy.miejsca.ZadluzoneMieszkanieZZaleglosciamiZaWode;

public class Main {

    public static void main(String[] args) {

        StaryZamek staryZamek = new StaryZamek();
        OpuszczonySzpital szpital = new OpuszczonySzpital();
        ZadluzoneMieszkanieZZaleglosciamiZaWode mieszkanieWoda = new ZadluzoneMieszkanieZZaleglosciamiZaWode();
        ZadluzoneMieszkanieZNiesplacanymKredytem mieszkanieKredyt = new ZadluzoneMieszkanieZNiesplacanymKredytem();

        Turysta[] turysci = new Turysta[5];
        Student[] studenci = new Student[5];

        // Pętla do tworzenia turystów
        for (int i = 0; i < 5; i++) {
            turysci[i] = new Turysta();
            studenci[i] = new Student();
        }

        for (Student student : studenci){
            System.out.println("\n" + student);
            staryZamek.nawiedz(student);
            szpital.nawiedz(student);
            mieszkanieKredyt.nawiedz(student);
            mieszkanieWoda.nawiedz(student);
        }

        for (Turysta turysta : turysci){
            System.out.println("\n" + turysta);
            staryZamek.nawiedz(turysta);
            szpital.nawiedz(turysta);
            mieszkanieKredyt.nawiedz(turysta);
            mieszkanieWoda.nawiedz(turysta);
        }



    }


}
