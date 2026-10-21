package IF_ELSE;
import java.util.Scanner;
public class print_absolute_value {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number :");
        int a= sc.nextInt();

        if(a>=0)
        {
            System.out.println("absolute value of " +a +" is " + a);
        }
        else
        {
            System.out.println("absolute value of " +a +" is " + (-a));
        }

        if(a<0){      //method 2 using single if only
            a = -a;
        }
        System.out.println("absolute value is " + a);

    }

}
