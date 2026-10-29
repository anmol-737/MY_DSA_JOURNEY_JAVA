package LOOPS;
import java.util.*;
// SERIES = 99, 95,91,87....UPTO ALL TERMS WHICH ARE POSITIVE
public class print_positive_terms_of_give_series {
    static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int c = 99 , k = -4;
        for(int i = 1  ; i<= 25 ; i++)  //25 calculate krkr nikala
        {
            System.out.print(c+(i-1)*k + " , ");
        }


        System.out.println(" ");


        for(int j = 99 ; j > 0 ; j+=k) {
            System.out.print(j + " , ");
        }
    }
}
