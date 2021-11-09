package programming.exercises.pkg2.pkg7;
import java.util.Scanner;
public class ProgrammingExercises27 {
    public static void main(String[] args) {
       Scanner inp = new Scanner(System.in);
       System.out.print("Enter the number of minutes: ");
       int minutes = inp.nextInt();
       int years = minutes / 525600;
       int days = (minutes % 525600) / 1440;
       System.out.println(+ minutes + " minutes is approximately " + years + " years and " + days + " days");
       
    }
    
}
