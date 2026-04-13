package zadaci_interface;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        ArrayList<Pregledljivo> materijali = new ArrayList<>();

        materijali.add(new PDF("Java Effective sec. edit.", 1024));
        materijali.add(new Video("Superman",1241241512));
        materijali.add(new PPT("Predavanje strukture podataka", 12313));
        int velicina =  AUX_CLS.ukupnaVelicinaKBMAterijala(materijali);
        System.out.println("Ukupna velicna "+ velicina);
        AUX_CLS.otvoriSve(materijali);
        Pregledljivo najveci = AUX_CLS.nadjiNajveciKapacitetKB(materijali);
        System.out.println(najveci.velicinaKB());
        System.out.println(najveci.naziv());
    }
}
