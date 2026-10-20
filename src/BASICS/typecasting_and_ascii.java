package BASICS;

public class typecasting_and_ascii {
    static void main(String[] args) {
        /*_*************************************TYPE CASTING********************************************************_*/
        //ascii values
        //a-z = 97-122
        // A- Z = 65-90
        // 0 - 9 = 48-57

        char ch = 'A';
        int x = ch; //implicit typecasting
        System.out.println(x); // WILL PRINT ASCII VALUE OF 'A'

        char f = 'a';
        int y = (int)f; //explicit typecasting
        System.out.println(y);

        char q = '3';
        System.out.println((int)q);

        char w = 'Q';
        System.out.println(w+0);
        System.out.println(w*1);
        System.out.println(w+w+ch); //sum of ascii values


//INTER TO CHARACTER
        int abc = 142;
        System.out.println((char)abc);
        int qw = 39;
        System.out.println((char)qw);

        int we = 65;
        System.out.println((char)we);

        int er = 41;

        System.out.println((char)er);

        System.out.println((char)32); // 32 is ascii value of space



    }
}
