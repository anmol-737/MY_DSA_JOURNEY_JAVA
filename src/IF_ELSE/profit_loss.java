package IF_ELSE;

import java.util.Scanner;

public class profit_loss {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cp,sp;
        System.out.print("enter the cost prize : ");
        cp = sc.nextDouble();
        System.out.print("enter the selling prize : ");
        sp = sc.nextDouble();

        if(cp>sp)
        {
            System.out.println("your incurred a loss of " + (cp-sp));
            System.out.println("loss percentage  = " +((cp-sp)/cp)*100);
        }
        else if(sp>cp)
        {
            System.out.println("your made a profit of " + (sp -cp));
            System.out.println("profit percentage  = " +((sp-cp)/cp)*100);
        }
        else if(cp==sp)
        {
            System.out.println("no profit ,  no loss");
        }

    }
}
