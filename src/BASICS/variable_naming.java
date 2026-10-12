package BASICS;

public class variable_naming {
    static void main(String[] args){
        int anmol = 100;
        System.out.println(anmol);

        String $kr$na = "CAN START WITH DOLLAR , UNDERSORE OR ANY ALPHABET";
        System.out.println($kr$na);

        String _hi = "CAN'T START WITH number , can contain numbers in between";
        System.out.println(_hi);

        String abc = "no spaces allowed , no special character s except $ and _ allowed , CAN't use keywords as variables";
        System.out.println(abc);
    }
}
