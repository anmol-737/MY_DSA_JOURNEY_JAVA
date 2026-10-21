package IF_ELSE;
import java.util.Scanner;
public class divisible_by_5_or_not {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int a = sc.nextInt();

        if(a%5 ==0)
        {
            System.out.println(a + " is divisible by 5");
        }
        else{
            System.out.println(a + " is not divisible by 5");
        }
    }

}
