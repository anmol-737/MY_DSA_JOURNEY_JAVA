package LOOPS;

import java.util.Scanner;

public class sum_of_digits_of_no {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();

        int rem,sum = 0;
        while(n!=0)
        {
            rem = n%10;
            sum = sum + rem;
            n = n/10;
        }
        System.out.println((sum>0)? sum : -sum);
    }
}
