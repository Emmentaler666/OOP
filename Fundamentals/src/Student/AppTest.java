package Student;

public class AppTest {
    public static void main(String[] args) {
      Student s1 = new Student(name: "Petar", surname: "Petrić", id: 12);
      Student s2 = new Student(name: "Franka", surname: "Franć", id: 43);
      s1.subscribeToStudentService();
      s2.subscribeToStudentService();

    }
}
