/**************************************************************************

 * @By: Panipal Isaac

 * @Lab: 21

 * @CSE 1001 Fund Software, Fall 2023
 
 * @Date: 11/9/2023

 * @Description: Area Checker
 * **************************************************************************/
 
import java.util.*;

public class Area {
	
    public static void main (String[] args)
	{
	System.out.println("Enter a type of figure(circle,triangle, rectangle:");
	Scanner numScan = new Scanner(System.in);
	String a = numScan.nextLine().toLowerCase();
	if (a.equals("circle"))
	{
		System.out.println("Enter a radius");
		int b = numScan.nextInt();
		System.out.println("The area of the Circle is: " + CircleArea(b));
	} else if(a.equals("rectangle"))
	{
		System.out.println("Enter a length");
		int l = numScan.nextInt();
		System.out.println("Enter a width");
		int w = numScan.nextInt();
		System.out.println("The area of the Rectangle is: " + RectangleArea(l,w));
	} else if(a.equals("triangle"))
	{
			System.out.println("Enter a height");
		int h = numScan.nextInt();
		System.out.println("Enter a base");
		int b = numScan.nextInt();
		System.out.println("The area of the Triangle is: " + TriangleArea(h,b));
	}
	else{
	System.out.println("Not a valid shape!");
	}
	
	}
	
	
	
	
	
	
	
	
	
	
	public static double CircleArea(int r) 
	{
		return(Math.PI * (double)(r*r));
	}
	public static int RectangleArea(int l, int w)
	{
				return(l*w);
	}
	public static int TriangleArea(int h, int b)
	{
		return((h*b)/2);
	}
	
}
