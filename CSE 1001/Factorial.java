/**************************************************************************

 * @By: Panipal Isaac

 * @Lab: 15

 * @CSE 1001 Fund Software, Fall 2023

 * @Date: 10/17/2023

 * @Description: Checks even or odd on Factorials
 * **************************************************************************/
import java.util.*;

public class Factorial
{
	public static void main (String[] args)
	{
		int num;

		Scanner numScan = new Scanner(System.in);
		System.out.print("Enter a postive number: ");
		num = numScan.nextInt();
					int y = 1;

			for(int i = num; i > 0;i--)
			{		
			y = y*i;
			}
			
			if (y%2 == 0)
			{
			System.out.println(num + "! is " + y + " which is even!");
			}
			else
			{
							System.out.println(num + "! is " + y + " which is odd!");

			}
			
	}
	
}
