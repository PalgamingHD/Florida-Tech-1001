/**************************************************************************

 * @By: Panipal Isaac

 * @Lab: 21

 * @CSE 1001 Fund Software, Fall 2023
 
 * @Date: 11/9/2023

 * @Description: Area Checker + Added
 * **************************************************************************/
 
import java.util.*;

public class LotsOfArea {
	
    public static void main (String[] args)
	{
		double totalArea = 0;
		Scanner numScan = new Scanner(System.in);
	 	String answer = "";

	
	while(!answer.equals("no"))
	{
	System.out.println("Would you like to calculate the area of a figure: ");
	answer = numScan.nextLine().toLowerCase();
	
	if (answer.equals("yes")) 
	{

	System.out.println("Enter a type of figure(circle,triangle, rectangle:");
	String a = numScan.nextLine().toLowerCase();
	
	if (a.equals("circle"))
	{
		System.out.println("Enter a radius");
		double b = numScan.nextDouble();
		System.out.println("The area of the Circle is: " + CircleArea(b));
		totalArea += CircleArea(b);

	} else if(a.equals("rectangle"))
	{
		System.out.println("Enter a length");
		double l = numScan.nextDouble();
		System.out.println("Enter a width");
		double w = numScan.nextDouble();
		System.out.println("The area of the Rectangle is: " + RectangleArea(l,w));
		totalArea += RectangleArea(l, w);

	} else if(a.equals("triangle"))
	{
			System.out.println("Enter a height");
		double h = numScan.nextDouble();
		System.out.println("Enter a base");
		double b = numScan.nextDouble();
		System.out.println("The area of the Triangle is: " + TriangleArea(h,b));
		totalArea += TriangleArea(h, b);

	}else
	{
	System.out.println("Sorry, input must be circle, triangle, or rectangle");
	}
	  numScan.nextLine(); //this is the only way it works 
	}
	
	else if (!answer.equals("no")) 
	{
                System.out.println("Please enter yes or no");
    }
	}
			System.out.println("Area of All Figures: " + totalArea);

	}
	
	
	
	
	
	
	
	
	
	
	public static double CircleArea(double r) 
	{
		return(Math.PI * (double)(r*r));
	}
	public static double RectangleArea(double l, double w)
	{
				return((double)(l*w));
	}
	public static double TriangleArea(double h, double b)
	{
		return((double)((h*b)/2));
	}
	
}
