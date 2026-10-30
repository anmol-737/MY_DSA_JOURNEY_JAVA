package LOOPS;

import java.util.Scanner;

public class extract_digits_of_number {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int rem;

        while(n!=0)
        {
            rem = n%10;
            System.out.println(rem);
            n = n/10;
        }
    }
}
