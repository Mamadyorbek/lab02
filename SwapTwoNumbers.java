package swap.two.numbers;
import java.util.Scanner;
public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("1st value?");
        int a = inp.nextInt();
        System.out.println("2st value?");
        int b = inp.nextInt();        
        System.out.println("Before swapping: a = " + a + "; b = " + b);
        int c=a;
        a=b; b=c;
        System.out.println("After wapping: a = " + a + "; b = " + b);

    }
    
}
