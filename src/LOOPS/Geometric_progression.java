package LOOPS;

import java.util.*;

public class Geometric_progression {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a , r ;
        int n ;
        System.out.println("enter the first term");
         a = sc.nextDouble();
        System.out.println("enter common ratio");
        r = sc.nextDouble();
        System.out.println("enter number of terms you want of gp");
        n = sc.nextInt();
        for(int i = 1; i<=n ;i++)
        {
            System.out.println(a*(Math.pow(r, (i-1))));
        }



    }
}
