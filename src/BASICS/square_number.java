package BASICS;

import java.util.Scanner;

public class square_number {
    static void main(String []args){

        Scanner sc = new Scanner(System.in);
        System.out.println("*********************************");
        System.out.print("enter a number : ");
        int a= sc.nextInt();
        int sq = a*a;
        System.out.print("square of number = ");
        System.out.println(sq);
    }
}
