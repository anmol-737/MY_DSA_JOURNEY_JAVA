package ternary_operator;

import java.util.Scanner;

public class greatestof3_replacing_nested_with_ternary {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b,c;
        System.out.print("enter first number : ");
        a= sc.nextInt();
        System.out.print("enter second number : ");
        b= sc.nextInt();
        System.out.print("enter third number: ");
        c= sc.nextInt();

        int greatest = (a>b)? ((a>c? a:c)) : ((b>c)? b:c);
        System.out.println(greatest + " is greatest");

    }
}
