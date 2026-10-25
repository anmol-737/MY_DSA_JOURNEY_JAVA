package LOOPS;

import java.util.Scanner;

public class odd_no_divisible_by_7 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        int i;
        for(i = 1;i<=a;i++)
        {
            if((i%2)!=0 && i%7==0)
            {
                System.out.print(i + " , ");
            }
        }
    }
}
