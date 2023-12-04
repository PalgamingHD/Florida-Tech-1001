/**************************************************************************

 * @By: Panipal Isaac

 * @Lab: 13

 * @CSE 1001 Fund Software, Fall 2023

 * @Date: 10/5/2023

 * @Description: Even/Odd Checker pt. 2
 * **************************************************************************/
import java.util.*;

public class Odd
{
	public static void main (String[] args)
	{
		int num;

		Scanner numScan = new Scanner(System.in);
		System.out.print("Enter a non negative integer: ");
		num = numScan.nextInt();
		    System.out.println("Start loop");
    while (num > -1) {

		if (num % 2 == 0)
		{
		System.out.println(num + " is even!");
		}
		else
		{
				System.out.println(num + " is odd!");
}
System.out.println("Enter another non-negative integer: ");
        num = numScan.nextInt();  
	}
	System.out.println("End Loop");
	}
}
