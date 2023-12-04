/**************************************************************************

 * @By: Panipal Isaac

 * @Lab: 10

 * @CSE 1001 Fund Software, Spring 2021

 * @Date: 9/27/2023

 * @Description: Modified Leap Year checker
 * **************************************************************************/
public class LeapYear
{
	public static void main (String[] args)
	{
		int year = Integer.parseInt(args[0]);
		
		if (year % 100 == 0) 
		{
		
			if (year % 400 == 0) 
			{
			System.out.println("Leap year.");
			} else {
			System.out.println("Not a leap year.");
			}
		} 
		else if (year % 4 == 0) 
			{
			System.out.println("Leap Year.");
			} 
		else if (year % 11 == 0) 
			{
			System.out.println("Leap Year.");
			} 
		else if (year % 13 == 0) 
			{
			System.out.println("Leap Year.");
			} 
			else 
		{
		System.out.println("Not a leap year.");
		}
	}
}
