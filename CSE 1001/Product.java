/**************************************************************************

 * @By: Panipal Isaac

 * @Lab: 16

 * @CSE 1001 Fund Software, Fall 2023
 
 * @Date: 10/19/2023

 * @Description: Repeated Addition
 * **************************************************************************/
import java.util.*;

public class Product
{
	public static void main (String[] args)
	{
		int num1;
		int num2;
		String answer;

		Scanner wordScan = new Scanner(System.in);
		System.out.println("Would you like to multiply?");
		while(true)
		{
		 int num3 = 0; 

		answer = wordScan.nextLine();
		if(answer.equals("yes"))
		{
			System.out.println("Enter an Integer");
			num1 = wordScan.nextInt();
			wordScan.nextLine();

			System.out.println("Enter an Integer");
			num2 = wordScan.nextInt();
            wordScan.nextLine();

			for (int i = num2; i >= 1; i--)
			{
			num3 = num3+num1;
			}
			System.out.println(num1 + " x " + num2 + " = " + num3);
			System.out.println("Would you like to multiply?");

		}
		else
		{
				System.exit(0);
		}
		}
	}
	
}
