package NumberSystem;
import java.util.Scanner;

public class AutomorphicNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp = n;

        int square = n * n;
        System.out.println("Square is:"+square);

        int count = 0;

        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        int div = 1;
        for (int i = 1; i <= count; i++) {
            div = div * 10;
        }

        int right = square % div;

        if (right == n) {
            System.out.println("Automorphic Number");
        } else {
            System.out.println("Not an Automorphic Number");
        }

        sc.close();
    }
}