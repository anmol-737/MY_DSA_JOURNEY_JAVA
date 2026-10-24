package IF_ELSE;

import java.util.Scanner;

public class greatest_using_nested_conditionals {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("enter first number : ");
        a = sc.nextInt();
        System.out.print("enter second number : ");
        b = sc.nextInt();
        System.out.print("enter third number: ");
        c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println(a + " is greatest");
            }
        } else if (b > a) {
            if (b > c) {
                System.out.println(b + " is greatest");
            }
        } else {
            System.out.println(c + " is greatest");
        }
    }
}
