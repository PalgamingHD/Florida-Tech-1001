/**************************************************************************

 * @By: Panipal Isaac

 * @Lab: 26

 * @CSE 1001 Fund Software, Fall 2023
 
 * @Date: 11/30/2023

 * @Description: Fib with recursion
 * **************************************************************************/
import java.util.Scanner;

public class rFibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int count = in.nextInt();

        System.out.println(fib(count+1));
		
    }

    public static int fib (int n) {
if (n==1)
return 0;
else if (n==2)
return 1;
else
return fib(n-1) + fib(n-2);
}



}