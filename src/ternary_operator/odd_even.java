package ternary_operator;

import java.util.Scanner;

public class odd_even {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a positive number : ");
        int n = sc.nextInt();

        System.out.println((n%2==0)? "even" : "odd");


    }
}