package LOOPS;

import java.util.Scanner;
//BETTER TIME COMPLEXICITY AS NUMBER OF ITERATIONS ARE LESS

public class prime_number2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        boolean f =  true; // means prime here

        for(int i = 1; i<=Math.sqrt(n) ; i++)
        {
            if(n%i == 0)
            {
                f= false; // means composite
                System.out.print(i + ", " + n/i + " ,");
            }
            else
            {
                continue;
            }
        }
        if(n ==1 )
        {
            System.out.println("neiher prime nor composite");
        }

        else if(f==true) System.out.println("prime");
        else if (f== false) System.out.println("not prime");
    }
}
