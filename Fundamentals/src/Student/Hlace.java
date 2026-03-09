package Student;

public class Hlace {
    private String model;

    public boolean ciste;

    public Hlace(String model) {
        this.model = model;
        this.ciste = true;

    }

    public boolean getCiste(){
        return ciste;
    }

    public boolean isCiste() {
        return ciste;
    }

    public void setCiste(boolean ciste){
        this.ciste = false;

    }


    public Hlace nekakoOciscene(Student student) {


        return student.operiMe(this);
    }


    public void koristeneHlace() {
        this.ciste = false;
    }
}
