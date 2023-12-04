/**************************************************************************

 * @By: Panipal Isaac

 * @Lab: 16

 * @CSE 1001 Fund Software, Fall 2023
 
 * @Date: 10/19/2023

 * @Description: Factors of numbers
 * **************************************************************************/
import java.util.*;

public class Factor
{
	public static void main (String[] args)
	{
		int num;

		Scanner numScan = new Scanner(System.in);
		System.out.println("Enter a postive number: ");
		num = numScan.nextInt();
		System.out.println("Factors of " + num + " are: ");

		for(int i = num; i > 0;i--)
			if (num%i==0)
			{
			System.out.println(i);
			}
			
	}
	
}
