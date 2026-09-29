package BASICS;

public class Arithmetic_Operation_INT {
    static void main(String[] args) {
        int a , b;
        a=30;
        b = 7;
        int x= 15 , y = 10;
        System.out.println(x+y); /* works on original values of x and y  , original values do not change*/
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x%y);
        System.out.println( " *****************************************************************************");
        x = 100; // there would  be an error if I would've written int again
        System.out.println(x);
        x= x+10; // value of x changes each time an d the new operation works on updated value
        System.out.println(x);
        x= x-20;
        System.out.println(x);
        x= x*10;
        System.out.println(x);
        x= x/10;
        System.out.println(x);
        x= x%7; // to find remainder
        System.out.println(x);
        System.out.println( " *****************************************************************************");
        System.out.println(a/y); // ans should be 3.9 but output is 3 coz data type used is int which removes the decimal part ROUND OFF NHI HOGA
    }
}



