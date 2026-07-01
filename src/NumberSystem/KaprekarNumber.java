package NumberSystem;

import java.util.Scanner;

public class KaprekarNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sqr = n * n;
        System.out.println("The square of a number is:"+sqr);
        int temp = n;

        int count = 0;

        // Count digits in n
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }
        System.out.println("The Count is:"+count);
        int div = 1;

        // Calculate 10^count
        for (int i = 1; i <= count; i++) {
            div = div * 10;
        }
        System.out.println("The divisor is:"+div);
        int left = sqr / div;
        int right = sqr % div;

        if (left + right == n) {
            System.out.println("Kaprekar Number");
        } else {
            System.out.println("Not a Kaprekar Number");
        }

        
    }
}