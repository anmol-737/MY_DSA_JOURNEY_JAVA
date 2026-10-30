package LOOPS;

import java.util.Scanner;

public class extract_digits_of_number_left2right {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int c = 0;
        int k =n;
        int quo =1;

        while(n!=0)
        {
            n = n/10;
            c++;
        }

        System.out.println("number of digits = " +c);

        int divisor = (int)(Math.pow(10,(c-1.0)));

        while(divisor!=0)
        {
            quo = k/divisor;
            System.out.println(quo);
            k = k%divisor;
            divisor=divisor/10;
        }
    }
}
