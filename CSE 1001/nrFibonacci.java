/**************************************************************************

 * @By: Panipal Isaac

 * @Lab: 26

 * @CSE 1001 Fund Software, Fall 2023
 
 * @Date: 11/30/2023

 * @Description: Fib without recursion
 * **************************************************************************/
import java.util.Scanner;

public class nrFibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int count = in.nextInt();

        System.out.println(nonRecursiveFib(count+1));
		
    }

    public static int nonRecursiveFib(int n) {
        if (n == 1)
           return 0;
        else if (n == 2)
           return 1;
        else {
           int a, b, c = 0;
           a = 0;
           b = 1;
           for (int i=3; i<=n; i++) {
               c = a+b;
               a = b;
               b = c;
           }
           return c;
        }
    }
}