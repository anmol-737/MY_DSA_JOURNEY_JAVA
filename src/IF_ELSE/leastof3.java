package IF_ELSE;

import java.util.Scanner;

public class leastof3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("enter first number : ");
        a = sc.nextInt();
        System.out.print("enter second number : ");
        b = sc.nextInt();
        System.out.print("enter third number: ");
        c = sc.nextInt();

        if (a < b && a < c)
        {
            System.out.println(a + " is least");
        }
        else if (b < a && b<c)
        {
            System.out.println(b + " is least");
        }
        else
        {
            System.out.println(c + " is least");
        }
    }
}
