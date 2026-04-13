package zadaci_interface;

import java.util.ArrayList;

public class AUX_CLS {

    public static void otvoriSve(ArrayList<Pregledljivo> pregledljiviMaterijali) {
        if (pregledljiviMaterijali.isEmpty()) {
            System.out.println("Nema nista za pregled");

        } else {
            for (Pregledljivo materijal : pregledljiviMaterijali) {
                materijal.otvori();
            }

        }
    }



    public static int ukupnaVelicinaKBMAterijala(ArrayList<Pregledljivo> pregledljiviMaterijali){
        int ukupno = 0;
        if(pregledljiviMaterijali.isEmpty()){
            System.out.println(("Nema materijala"));
        }else {

            for (Pregledljivo materijal : pregledljiviMaterijali) {
                ukupno += materijal.velicinaKB();
            }
        }
        return ukupno;
    }

    public static Pregledljivo nadjiNajveciKapacitetKB(ArrayList<Pregledljivo> pregledljiviMaterijali){
        Pregledljivo najveci = pregledljiviMaterijali.get(0);
        if(pregledljiviMaterijali.isEmpty()){
            System.out.println("NEma");
        }else {
            for (int k = 1; k < pregledljiviMaterijali.size(); k++) {
                if (najveci.velicinaKB() < pregledljiviMaterijali.get(k).velicinaKB()) {
                    najveci = pregledljiviMaterijali.get(k);
                }
            }
        }
        return najveci;
    }
}
