package LOOPS;

import java.util.Scanner;

public class reverse_a_number {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();

        int rem,new_number= 0;
        while(n!=0)
        {
            rem = n%10;
            new_number = (new_number*10) + rem;
            n = n/10;
        }
        System.out.println("reversed number = " + new_number);

    }
}
