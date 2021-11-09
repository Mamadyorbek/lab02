package sum.of.digits;
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("four-digits:");
        int a = inp.nextInt();
        int b = a % 10;
        a = a / 10;
        int c = a % 10;
        a = a / 10;
        int d = a % 10;
        a = a / 10;
        int f = a % 10;
        int sum = b + c + d + f;
        System.out.println("The sum of all digits is " + sum);
    }
    
}
