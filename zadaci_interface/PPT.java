package zadaci_interface;

public class PPT implements Pregledljivo{

    private String naziv;

    private int velicinaKB;

    public PPT(String naziv, int velicinaKB){
        this.naziv = naziv;
        this.velicinaKB = velicinaKB;
    }
    @Override
    public String naziv() {
        return this.naziv;
    }

    @Override
    public int velicinaKB() {
        return this.velicinaKB;
    }

    @Override
    public void otvori() {
        System.out.println(this.getClass().getSimpleName() + " naziva: " +this.naziv + " je otvorena!");

    }
}
