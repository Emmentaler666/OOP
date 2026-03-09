package Student;

public class Student {
    private String name;

    private String surname;

    private int id;

    public Student(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public void_subscribeToStudentService(){
        System.out.println("Studentt's id: " + id);
        System.out.println(name + " - " + surname + " is subscrubed to student service.");
    }
}
