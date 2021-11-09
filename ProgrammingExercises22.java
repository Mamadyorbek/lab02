package programming.exercises.pkg2.pkg2;
import java.util.Scanner;
public class ProgrammingExercises22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius and length of cylinder: ");
        double radius = input.nextDouble(); 
        double length = input.nextDouble();
        final double п = 3.14159;
        double area = radius * radius * п;
        double volume = area *length;
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }
    
}
