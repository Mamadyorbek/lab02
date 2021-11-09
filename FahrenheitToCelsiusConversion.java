package fahrenheit.to.celsius.conversion;
import java.util.Scanner;
public class FahrenheitToCelsiusConversion {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Temperature in degrees Fahrenheit? ");
        int fahrenheit = inp.nextInt();
        double celsius = (fahrenheit - 32)*5.0/9;
        System.out.println("The temperature in degrees Celsius is " + celsius);
    }
    
}
