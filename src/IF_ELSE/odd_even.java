package IF_ELSE;
import java.util.*;
public class odd_even {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter a positive number : ");
        int n = sc.nextInt();

        if(n%2 == 0)
        {
            System.out.println("number entered by user " + n +" is even");
        }
        else
        {
            System.out.println("number entered by user " + n +" is odd");
        }
    }

}
