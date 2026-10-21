package IF_ELSE;

import java.util.Scanner;

public class integer_or_not {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a real number : ");
        double y = sc.nextDouble();
        int n = (int)y;

        if(y>0)
        {
            if((y-n)>0)
            {
                System.out.println("Not INTEGER");
            }
            else {
                System.out.println("integer");
            }

        }
        else if(y<0)
        {
            if((n-y)>0)
            {
                System.out.println("not integer");
            }
            else{
                System.out.println("integer");
            }
        }

    }
}
