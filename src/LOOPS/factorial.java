package LOOPS;

import java.util.Scanner;

public class factorial {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();

        long fact = 1;
        for(int i =1 ; i<=n ; i++)
        {
            fact = fact*i;
        }
        System.out.println("factorial of number = " +fact);
    }

}
