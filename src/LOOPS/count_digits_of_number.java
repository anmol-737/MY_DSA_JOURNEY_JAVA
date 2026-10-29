package LOOPS;

import java.util.Scanner;

public class count_digits_of_number {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the number");
        int n = sc.nextInt();
        int count = 0;
        int rem;
        if(n == 0)
        {
            System.out.println("1 digit number");
        }
        else
        {
            while(n!=0)
            {
                n = n/10;
                count++;



            }
        }
        System.out.println("number of dogits in number = " +count);
    }
}
