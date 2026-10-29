package LOOPS;

import java.util.Scanner;

public class prime_number {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int count = 0;

        for(int i = 1; i<=n ;i++)
        {
            if(n%i == 0)
            {
                System.out.print(i+ " , ");
                count++;
            }
            else
            {
                continue;
            }
        }
        if(count==2)
        {
            System.out.println("\n" + n + " is prime");
        }
        else if(count>2) {
            System.out.println("\nnot prime \nnumber of factors =  " + count);
        }
        else if(count==1)
        {
            System.out.println( " 1 is neither prime nor composite");
        }


    }
}
