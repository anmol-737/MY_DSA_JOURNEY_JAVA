package IF_ELSE;

import java.util.Scanner;

public class location_of_point {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;
        System.out.print("enter X coordinate : ");
        x = sc.nextInt();
        System.out.print("enter Y coordinate : ");
        y = sc.nextInt();

        if(x>0&& y>0)
        {
            System.out.println("first quadrant");
        }
        else if(x<00&& y>0)
        {
            System.out.println("Second quadrant");
        }
        else if(x<0&& y<0)
        {
            System.out.println("Third quadrant");
        }
        else if(x>0&& y<0)
        {
            System.out.println("fourth quadrant");
        }
        else if(x==0&& y==0)
        {
            System.out.println("origin");
        }


    }
}
