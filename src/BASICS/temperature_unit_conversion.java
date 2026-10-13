package BASICS;
import java.util.*;
public class temperature_unit_conversion {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celcius : ");
        double temp_celcius = sc.nextDouble();
        double temp_farheneit = ((9/5)*temp_celcius)+32;
        System.out.print("Temperature in FARHENEIT : ");
        System.out.println(temp_farheneit);

        System.out.print("temperature in KELVIN : ");
        double temp_kelvin = temp_celcius + 273.15;
        System.out.println(temp_kelvin);


    }
}
