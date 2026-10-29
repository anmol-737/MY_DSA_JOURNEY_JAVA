package LOOPS;

import java.util.Scanner;

/* take 'n' from user and print
 1
 n
 2
 n-1
 3
 n-2
 ...
  */
public class print_given_sequence_gp {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int i;
        int k = n;
        int j = 1;

        for (i = 1; i <=2*n; i++)
        {
            if (i % 2 != 0) {
                System.out.println(j);
                j += 1;
            }
            else if (i % 2 == 0) {
                System.out.println(k);
                k-=1;
            }
        }
    }
}
