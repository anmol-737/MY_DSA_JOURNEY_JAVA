package LOOPS;

import java.util.Scanner;

public class composite_number_with_minimum_iterations {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int count = 0;

        for (int i = 2; i <= (n - 1); i++) // not checking for 1 and number itself , the  loop ends as soon we find the first factor apart from 1 and number itself
        {
            if (n % i == 0) {
                count++;
                System.out.println("composite number");
                break;
            }
            else
            {
                continue;
            }
        }
        if (count == 0 && n!= 1) {
            System.out.println("number is not composite");
        }
        else if(n==1)
        {
            System.out.println("neither prime nor composite");
        }

    }
}
