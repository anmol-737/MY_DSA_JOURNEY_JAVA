package BASICS;

import java.util.*;
public class sphere_volume {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter radius of Sphere: ");
        double r = sc.nextDouble();
        double vol = (4/3)*3.141592*r*r*r;

        System.out.print("volume is : ");
        System.out.println(vol);

    }
}
