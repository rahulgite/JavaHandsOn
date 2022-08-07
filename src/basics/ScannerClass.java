package basics;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter character-");
        char c = s.next().charAt(0);
        System.out.println("Character is '" + c + "'");

        System.out.println("Enter integer-");
        int i = s.nextInt();
        System.out.println("Integer is " + i);

        System.out.println("Enter long-");
        long l = s.nextLong();
        System.out.println("Long is " + l);

        System.out.println("Enter float-");
        float f = s.nextFloat();
        System.out.println("Float is " + f);

        System.out.println("Enter double-");
        double d = s.nextDouble();
        System.out.println("Double is " + d);

        System.out.println("Enter word-");
        String w = s.next();
        System.out.println("Word is " +w);

    }
}

/*
OUTPUT:
Enter character-
a
Character is 'a'
Enter integer-
5
Integer is 5
Enter long-
5555555555555555555
Long is 5555555555555555555
Enter float-
5.5
Float is 5.5
Enter double-
5.5555555555555555555555555555
Double is 5.555555555555555
Enter word-
rg
Word is rg
 */