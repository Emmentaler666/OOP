import java.util.Scanner;

public class Robot {

    private int id;
    private String name;

    private int[][] arr = new int[5][4];   // 2D niz
    private int count = 0;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void walk() {
        System.out.println("I roboti znaju hodati.");
    }

    public long factJel(int n) {

        if (n <= 1) {
            return 1;
        } else {
            return n * factJel(n - 1);
        }
    }

    public long binomialCoef_jel(int n, int k) {
        if (n > +k && k >= 0) {
        return factJel(n) / (factJel(k) * factJel(n - k));
        } else {

            return 0;
            }
        }

    public void fillArr() {

        Scanner sc = new Scanner(System.in);

        if (count >= 20) {
            System.out.println("Niz je već popunjen.");
            return;
        }

        int i = count / 4;
        int j = count % 4;

        System.out.print("Unesite broj: ");
        arr[i][j] = sc.nextInt();

        count++;
    }


    public void printArr() {

        System.out.println("Sadržaj 2D niza:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
