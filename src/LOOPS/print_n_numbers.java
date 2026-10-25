package LOOPS;
import java.util.Scanner;

public class print_n_numbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n");
        int n = sc.nextInt();

        for(int i = 1 ; i<=n ; i++)
        {
            System.out.println(i);
        }

    }
}
