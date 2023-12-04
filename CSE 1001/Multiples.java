/**************************************************************************

 * @By: Panipal Isaac

 * @Lab: 13

 * @CSE 1001 Fund Software, Fall 2023

 * @Date: 10/5/2023

 * @Description: outputs the multiples
 * **************************************************************************/
import java.util.*;

public class Multiples
{
	public static void main (String[] args)
	{
		int num;
		int computeRange;
		
		Scanner numScan = new Scanner(System.in);
		System.out.print("Enter a postive number: ");
		num = numScan.nextInt();
		System.out.print("Enter a bound to compute: ");
		computeRange = numScan.nextInt();
		
		if (num >= 1)
		{
				
			for(int i = 1; i<= computeRange;i++)
			{
			System.out.println(num + " x " + i + " = " + (num*i));
				
			}
		}
	}
}
