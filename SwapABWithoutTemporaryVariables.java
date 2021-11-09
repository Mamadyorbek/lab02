package swap.a.b.without.temporary.variables;
import java.util.Scanner;
public class SwapABWithoutTemporaryVariables {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("1st value?");
        int a = inp.nextInt();
        System.out.println("2st value?");
        int b = inp.nextInt();        
        System.out.println("Before swapping: a = " + a + "; b = " + b);
        b = a + b;
        a = b - a;
        b = b - a;
        System.out.println("After swapping: a = " + a + "; b = " + b);
    }
    
}
