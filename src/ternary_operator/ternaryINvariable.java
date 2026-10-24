package ternary_operator;

import java.util.Scanner;

public class ternaryINvariable{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a positive number : ");
        int n = sc.nextInt();

        String grade = (n>33)? "pass" : "fail";
        System.out.println(grade);

        /*
        equivalent of = if(n>33) sopln("pass");
                        else sopln("fail");
         */
    }
}
