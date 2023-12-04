/**************************************************************************

 * @By: Panipal Isaac

 * @Lab: 12

 * @CSE 1001 Fund Software, Spring 2021

 * @Date: 10/3/2023

 * @Description: TrafficLight Checker
 * **************************************************************************/
import java.util.*;

public class TrafficLight1
{
	public static void main (String[] args)
	{
		String colorinput;

		Scanner colorScan = new Scanner(System.in);
		System.out.print("Enter light color: ");
		colorinput = colorScan.nextLine();
		if (colorinput.equals("red")) 
		{
			System.out.println("Stop");
		} 
		 else if (colorinput.equals("green")) 
		{
			System.out.println("Go!");
		} 
		else if (colorinput.equals("yellow"))  
		{
			System.out.println("Slow");
		} else
		{
		System.out.println("Unknown");
		}
	}
}
