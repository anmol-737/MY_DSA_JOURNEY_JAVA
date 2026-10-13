package BASICS;

import java.util.Scanner;

public class area_of_circle {
    static void main(String[] args) {
        System.out.print("enter the radius of circle ");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double area = 3.1415*r*r;

        System.out.println(area);
    }
}
