package LOOPS;

import java.util.Scanner;

public class A_powerwed_B_usingLOOP {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b , result = 1;
        System.out.println("enter a");
        a = sc.nextInt();
        System.out.println("enter the power you want ");
        b = sc.nextInt();
        for(int i =1; i<=b ; i++)
        {
            result = result*a;
        }
        System.out.println(result);
    }
}
