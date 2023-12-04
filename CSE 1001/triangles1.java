/**************************************************************************

 * @By: Panipal Isaac

 * @Lab: 10

 * @CSE 1001 Fund Software, Spring 2021

 * @Date: 9/27/2023

 * @Description: Decreasing Order checker
 * **************************************************************************/
import java.util.*;

public class triangles1
{
	public static void main (String[] args)
	{
		int i1;
		int i2;
		int i3;

		Scanner integerScan = new Scanner(System.in);
		System.out.print("Input First Integer: ");
		i1 = integerScan.nextInt();
		System.out.print("Input Second Integer: ");
		i2 = integerScan.nextInt();
		System.out.print("Input Third Integer: ");
		i3 = integerScan.nextInt();		
		
		if (i1<=i2 && i2 <= i3) 
		{
			System.out.println("The integers are in a non-decreasing order.");
		} 
		else
		{
			System.out.println("The integers are not in a non-decreasing order.");
		} 
	}
}
