package LOOPS;

import java.util.Scanner;

public class print_all_prime_inRange {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter starting element");
        int a= sc.nextInt();
        System.out.println("enter ending element");
        int b = sc.nextInt();
        boolean f = true;// true means prime


        for(int i = a;i<=b ; i++)
        {
            for(int j  = 2; j<=Math.sqrt(i) ; j++)
            {
                if(i%j == 0)
                {
                    f = false;// composite number
                    break;
                }
                else
                {
                    f= true;
                }
            }

            if( f == true)
            {

                System.out.print(i + " , ");
            }
        }

    }
}
