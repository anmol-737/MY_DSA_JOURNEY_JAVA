package IF_ELSE;

import java.util.Scanner;

public class sideoftraingle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.print("enter first side o triangle : ");
        a= sc.nextInt();
        System.out.print("enter second side o triangle : ");
        b= sc.nextInt();
        System.out.print("enter third side o triangle : ");
        c= sc.nextInt();

        if((a+b>c)||(b+c>a)||(a+c>b))
        {
            System.out.println("triangle is possible with given sides");
        }
        else
        {
            System.out.println("triangle is not possible with given sides");
        }

    }
}
