package programming.exercises.pkg2.pkg4;
import java.util.Scanner;
public class ProgrammingExercises24 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number in pounds: ");
        double pounds = inp.nextDouble();
        double kg = pounds * 0.454;
        System.out.println(+ pounds + " pounds is " + kg + " kilograms" );
    }
    
}
