package BASICS;
import java.util.*;
public class compound_interest {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount : ");
        double p = sc.nextDouble();
        System.out.print("Enter rate of interest : ");
        double r = sc.nextDouble();
        System.out.print("Enter time in years : ");
        double t = sc.nextDouble();
        System.out.print("Enter number of times interest is compounded per year : ");
        double n = sc.nextDouble();


        double amt = p*Math.pow((1+(r/100)),(n*t));
        double ci = amt-p;
        System.out.print("Amount  = ");
        System.out.println(amt);
        System.out.print("Compound Interest = ");
        System.out.println(ci);

    }
}
