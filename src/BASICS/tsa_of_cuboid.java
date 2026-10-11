package BASICS;

import java.util.*;
public class tsa_of_cuboid {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of  cuboid: ");
        double l = sc.nextInt();
        System.out.println("enter breadth of  cuboid: ");
        double b = sc.nextInt();
        System.out.println("enter height of  cuboid: ");
        double h = sc.nextInt();
        double tsa = 2*(l*b + b*h + l*h);
        System.out.println(tsa);

    }

}
