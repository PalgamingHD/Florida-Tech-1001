/**************************************************************************

 * @By: Panipal Isaac

 * @Lab: 21

 * @CSE 1001 Fund Software, Fall 2023
 
 * @Date: 11/9/2023

 * @Description: Send message n amount of times
 * **************************************************************************/
 
import java.util.*;

public class Message {
	
	public static void mod(String s, int n)
	{
	
		for(int i=0;i<n;i++)
		{
		System.out.println(s);
		}
	}
    public static void main (String[] args)
	{
	System.out.println("Input a line");
	Scanner numScan = new Scanner(System.in);
	String a = numScan.nextLine();
		System.out.println("Input an amount of times");
		int b = numScan.nextInt();
		mod(a,b);
		}
}
