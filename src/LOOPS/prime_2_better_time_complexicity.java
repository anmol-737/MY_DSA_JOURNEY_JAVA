package LOOPS;

import java.util.Scanner;
//BETTER TIME COMPLEXICITY AS NUMBER OF ITERATIONS ARE LESS

public class prime_2_better_time_complexicity {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many numbers you want to check");
        int n = sc.nextInt();
        boolean f =  true; // means prime here
//FACTORS OCCUR IN  PAIRS
        for(int j = 1 ; j<=n ; j++)
        {
            System.out.println("enter number");
            int  a = sc.nextInt();
            int count = 0 ;
            for(int i = 2; i<=Math.sqrt(a) ; i++) // taking sqrt as we can't have a entirely new factor pair after it NUMBER'S square root
            {
                if(a%i == 0) {
                    count++; // means composite
                    break;
                }// as soon as we find the first factor we stop the loop which helps to reduce the iteratio
            }
            if(a ==1 )
            {
                System.out.println("neiher prime nor composite");
            }

            else if(count == 0) System.out.println("prime");
            else System.out.println("not prime");
        }
    }
}
