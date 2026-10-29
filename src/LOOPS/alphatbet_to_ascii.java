package LOOPS;

import java.util.Scanner;

public class alphatbet_to_ascii {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         char s;
        for(int i = 65 ; i<=90; i++)
        {
            s = (char)i;
            System.out.println("Ascii value of " + s + " = "  + i);
        }

        System.out.println("***********");
        for(int i = 97 ; i<=122; i++)
        {
            s = (char)i;
            System.out.println("Ascii value of " + s + " = "  + i);
        }

    }
}
