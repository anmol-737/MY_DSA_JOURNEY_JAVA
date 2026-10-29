package LOOPS;

import java.util.Scanner;

public class arithmetic_progression {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter starting element");
        int a= sc.nextInt();
        System.out.println("enter common difference");
        int d= sc.nextInt();
        System.out.println("enter number of elements of ap you want");
        int n  = sc.nextInt();
        int i;
        for(i=1 ; i <=n ; i++)
        {
            System.out.print(a+(i-1)*d + "  , "); //formula for nth term of ap
        }

        for(i=a ; i <=a+(n-1)*d ; i+=d)
        {
            System.out.print(i + "  , "); //formula for nth term of ap
        }

    }
}
