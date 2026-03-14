import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Unesi broj: ");
        int n = sc.nextInt();
        Robot r1 = new Robot();

        r1.setId(1);
        r1.setName("Robo");

        System.out.println("Robot ID: " + r1.getId());
        System.out.println("Robot name: " + r1.getName());

        r1.walk();
        for (int i = 0; i < 20; i++) {
            r1.fillArr();
        }
        r1.printArr();




        long fakt = r1.factJel(n);

        System.out.println("Faktorijela broja " + n + " je: " + fakt);

        int a = 5;
        int b = 2;

        long bin = r1.binomialCoef_jel(a, b);

        System.out.println("Binomni koeficijent C(" + a + "," + b + ") = " + bin);
    }
}