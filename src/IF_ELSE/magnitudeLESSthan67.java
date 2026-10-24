package IF_ELSE;

import java.util.Scanner;

public class magnitudeLESSthan67 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a no. : ");
        int n = sc.nextInt();
        if((n>0  && n>67) || (n<0 && (-n)>67) )
        {
            System.out.println("yes magnitude of number is greater than 67");
        }
        else
        {
            System.out.println("nope magnitude is not greater than 67");
        }
    }
}
