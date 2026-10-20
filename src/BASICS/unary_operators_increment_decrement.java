package BASICS;

public class unary_operators_increment_decrement {
    static void main(String[] args) {
        int x= 10;
        System.out.println(x);

        System.out.println(x++); //first use then inc
        System.out.println(x);

        System.out.println(++x); //first increase then use
        System.out.println(x);

        System.out.println(x--); // first use then dec
        System.out.println(x);

        System.out.println(--x); // first dec then use
        System.out.println(x);
        /*these operators can change the original value even if they are given in print statements
        unlike normal arithmetic operators which donot interere with original value if given in print statements*/

        int z = 20;
        int y = z++;
        System.out.println(z);
        System.out.println(y);

    }
}
