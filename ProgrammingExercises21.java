package programming.exercises.pkg2.pkg1;
import java.util.Scanner;
public class ProgrammingExercises21 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius: ");
        double celsius = inp.nextDouble();
        double fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.println(+ celsius + "Celsius is " + fahrenheit + " Fahrenheit");
        
    }
    
}
