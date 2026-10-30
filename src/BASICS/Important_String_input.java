package BASICS;

import java.util.Scanner;

public class Important_String_input {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        double n = Integer.parseInt(sc.nextLine());
        System.out.println("enter name");
        String s = sc.nextLine();

        System.out.println("dear user " +s);
        for(int i = 1; i<=n ;i++)
        {
            System.out.println(i);
        }

        System.out.println("@@@@@@@@@");
        System.out.println("enter another number");
        int c = sc.nextInt();
        sc.nextLine();
        System.out.println("enter name");
        String z = sc.nextLine();

        System.out.println(c);
        System.out.println(z);

    }
}
