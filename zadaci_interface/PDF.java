package zadaci_interface;

public class PDF implements Pregledljivo{
    private String naziv;

    private int velicinaKB;

    public PDF(String naziv, int velicinaKB){
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
        System.out.println("Otvorio sam: "+ this.getClass().getSimpleName() + " naziva:" + this.naziv);

    }
}
