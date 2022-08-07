package basics;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no. -");
        int no = s.nextInt();

        for (int i = 2; i < Math.sqrt(no); i++) {
            if (no % i == 0) {
                System.out.println("It's not prime");
                System.exit(0);
            }
        }
        System.out.println("It's prime");
    }
}
/*
Enter no. -
7
It's prime

Enter no. -
8
It's not prime
 */