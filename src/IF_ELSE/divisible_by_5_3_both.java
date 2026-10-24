package IF_ELSE;

import java.util.Scanner;

public class divisible_by_5_3_both {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();

        if(n%5==0)  //not using logical operators
        {
            if(n%3==0)
            {
                System.out.println("divisible by both 3 and 5");
            }
            else
            {
                System.out.println("divisible by only 5");
            }
        }
        else if(n%3==0) {
            if (n % 5 == 0) {
                System.out.println("divisible by both 3 and 5");
            } else {
                System.out.println("divisible by only 3");
            }
        }
        else

        {
            System.out.println("not divisible by either 3 or 5");
        }

        //using logical operators

        if(n%5==0 && n%3==0)
        {
            System.out.println("divisible by both 3 and 5");
        }
        else if(n%5==0 && n%3!=0) //no need to write 2nd condition
        {
            System.out.println("divisible by only 5");
        }
        else if(n%5!=0 && n%3==0) //no need to write 2nd condition
        {
            System.out.println("divisible by only 3");
        }
        else
        {
            System.out.println("not divisible ny either 5 or 3");
        }



    }
}
