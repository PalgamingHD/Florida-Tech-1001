/**************************************************************************

 * @By: Panipal Isaac

 * @Lab: 13

 * @CSE 1001 Fund Software, Fall 2023

 * @Date: 10/5/2023

 * @Description: Even/Odd Checker
 * **************************************************************************/
import java.util.*;

public class Even
{
	public static void main (String[] args)
	{
		int num;

		Scanner numScan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num = numScan.nextInt();
		if (num % 2 == 0)
		{
		System.out.println(num + " is even!");
		}
		else
		{
				System.out.println(num + " is odd!");
}
	}
}
