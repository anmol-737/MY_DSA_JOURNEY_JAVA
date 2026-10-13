package BASICS;
import java.util.Scanner;
public class sum_taking_input {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number :");
        double a = sc.nextDouble();
        System.out.print("enter Second number :");
        double b = sc.nextDouble();
        System.out.print("enter Third number :");
        double c = sc.nextDouble();
        System.out.print("SUM OF NUMBERS = ");
        System.out.println(a+b+c);


    }
}
