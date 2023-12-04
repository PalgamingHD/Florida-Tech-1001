/**************************************************************************

 * @By: Panipal Isaac

 * @Lab: 9

 * @CSE 1001 Fund Software, Spring 2021

 * @Date: 9/21/2023

 * @Description: Check Micky Mouse's birthday
 * **************************************************************************/
import java.util.*;
public class Birthday {
	public static void main(String[] args) {
		if (args[0].equals("November"))
		{
		System.out.println("Yes! November is the month Micky Mouse was born!");
		}
		else
		{
			System.out.println(args[0] + " is not the month MIcky Mouse was born");
		}
		if (args[1].equals("18"))
		{
		System.out.println("Yes! the 18th is the day Micky Mouse was born!");
		}
		else
		{
			System.out.println(args[1] + " is not the day MIcky Mouse was born");
		}
		if (args[2].equals("1928"))
		{
		System.out.println("Yes! 1928 is the year Micky Mouse was born!");
		}
		else
		{
			System.out.println(args[2] + " is not the year MIcky Mouse was born");
		}
		
	}
}
	