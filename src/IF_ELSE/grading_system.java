package IF_ELSE;
import java.util.Scanner;

public class grading_system {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double eng,maths ,phy,chem,cs ,max , total , percentage;
        System.out.println("enter english marks");
        eng = sc.nextDouble();
        System.out.println("enter maths marks");
        maths = sc.nextDouble();
        System.out.println("enter physics marks");
        phy = sc.nextDouble();
        System.out.println("enter chemistry marks");
        chem = sc.nextDouble();
        System.out.println("enter cse marks");
        cs = sc.nextDouble();
        System.out.println("enter MAXIMUM marks");
        max = sc.nextDouble();

        total = eng+maths+phy+chem+cs;
        percentage = (total*100)/max;

        if(percentage>=95)
        {
            System.out.println("A+");
        }
        else if (percentage>=90 && percentage<95)
        {
            System.out.println("A");
        }
        else if (percentage>=85 && percentage<90)
        {
            System.out.println("B+");
        }
        else if (percentage>=80 && percentage<85)
        {
            System.out.println("B");
        }
        else if (percentage>=70 && percentage<80)
        {
            System.out.println("C+");
        }
        else if (percentage>=60 && percentage<70)
        {
            System.out.println("C");
        }
        else if (percentage>=50 && percentage<60)
        {
            System.out.println("D+");
        }
        else if (percentage>=40 && percentage<50)
        {
            System.out.println("D");
        }
        else if (percentage>=33 && percentage<40)
        {
            System.out.println("F+");
        }
        else if (percentage<33)
        {
            System.out.println("F");
        }
    }
}
