/**************************************************************************

 * @By: Panipal Isaac

 * @Lab: 17

 * @CSE 1001 Fund Software, Fall 2023
 
 * @Date: 10/24/2023

 * @Description: Average Distance
 * **************************************************************************/
import java.util.*;

public class Numbers
{
	public static void main (String[] args)
	{
		int amountValues;
		int[] numArray;;

		Scanner numScan = new Scanner(System.in);
		System.out.println("How many values: ");
		amountValues = numScan.nextInt();
		numArray = new int[amountValues];
		System.out.println("Enter Values: ");

		for(int i = 0; i < amountValues ;i++)
		{
			numArray[i] = numScan.nextInt();
		}
		System.out.print("Your values are: ");
		for(int i = 0; i < amountValues;i++)
		{
		System.out.print(numArray[i] + " ");
		}
		System.out.println("");
		System.out.print("The Sum is: ");
		int sum = 0;
		for (int i = 0; i < numArray.length; i++) {
            sum += numArray[i];
        }
		System.out.println(sum);
		System.out.println("The Mean is: " + ((double)sum/(double)(numArray.length)));
		
		double differenceSum = 0;
		for (int i = 0; i < numArray.length; i++) 
		{
            double differnce = Math.abs(numArray[i] - ((double)sum/(double)(numArray.length)));
            differenceSum += differnce;
        }
        double averageDistance = differenceSum / numArray.length;

        System.out.println("Average Distance from the mean: " + averageDistance);
  
	}
	
}
