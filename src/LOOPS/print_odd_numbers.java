package LOOPS;

import java.util.Scanner;

public class print_odd_numbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        int i;
        for(i = 1;i<=a;i++) //a-1+1 baar chal rha h code
        {
            if((i%2)!=0)
            {
                System.out.print(i + " , ");
            }
        }
        System.out.println("\n");

        for(i = 0; i<=((a/2)-1) ; i++) //(a/2-1)-0+1 baar chalega loop
        {
            System.out.print( (2*i)+1 +" , ");
        }
    }
}
