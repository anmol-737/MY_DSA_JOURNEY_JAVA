package IF_ELSE;

import java.util.Scanner;

public class FOURdigit_or_not {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();

        if(n/1000>0)
        {
            System.out.println("4 digit number");

        }
        else
        {
            System.out.println("not a 4 digit number");
        }

        System.out.println("**********************************************");
        if(n>999 && n<10000)
        {
            System.out.println("4 digit number");

        }
        else
        {
            System.out.println("not a 4 digit number");
        }


    }
}
