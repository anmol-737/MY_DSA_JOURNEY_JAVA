package LOOPS;

import java.util.Scanner;

public class print_n_to_1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        int i;
        for (i = a; i >= 1; i--){
            System.out.print(i + " , ");
        }
    }
}