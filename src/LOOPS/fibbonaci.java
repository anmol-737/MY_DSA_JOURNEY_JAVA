package LOOPS;

import java.util.Scanner;

public class fibbonaci {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the umber of elements of series you want");
        int n  = sc.nextInt();
        int p= 0;
        int q = 1;
        System.out.print(p+ " , ");
        System.out.print(q + " , ");
        for(int i = 1; i<=n-2 ; i++)
        {
            int sum =p+ q;
            System.out.print(sum + " , ");
            p = q;
            q=sum;

        }
    }
}
