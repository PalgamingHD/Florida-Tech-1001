/**************************************************************************

 * @By: Panipal Isaac

 * @Lab: 26

 * @CSE 1001 Fund Software, Fall 2023
 
 * @Date: 11/30/2023

 * @Description: Fib with recursion
 * **************************************************************************/



import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = in.nextInt();

        System.out.print("Enter a number: ");
        int b = in.nextInt();

        int result = recursiveMultiply(a, b);

        System.out.print(a + " x " + b + " = " + result);

    }

    public static int recursiveMultiply(int a, int b) {
        if (b == 0 || a == 0)
            return 0;
		return a + recursiveMultiply(a, b - 1);
    }
}