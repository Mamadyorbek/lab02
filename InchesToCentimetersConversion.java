package inches.to.centimeters.conversion;
import java.util.Scanner;
public class InchesToCentimetersConversion {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Length in inches? ");
        int inch = inp.nextInt();
        double cm = inch * 2.54;
        System.out.println(+ inch + " in. " + "= " + cm + " cm." );
    }
    
}
