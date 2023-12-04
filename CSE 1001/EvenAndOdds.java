/**************************************************************************

 * @By: Panipal Isaac

 * @Lab: 17

 * @CSE 1001 Fund Software, Fall 2023
 
 * @Date: 10/24/2023

 * @Description: Average from array + odd number checker
 * **************************************************************************/
import java.util.*;

public class EvenAndOdds
{
	public static void main (String[] args)
	{
		 int[] myArray = { 97, 9, 52, 56, 50, 57, 52, 83, 31, 11, 93, 63, 31, 72, 52, 86, 28, 97, 70, 29, 97, 100, 99,
                68, 77, 41, 29, 90, 85, 88, 62, 43, 19, 49, 29, 77, 89, 31, 51, 53, 2, 28, 26, 95, 77, 53, 37, 35, 12,
                95, 58, 48, 15, 47, 64, 2, 34, 28, 91, 48, 49, 52, 64, 50, 19, 96, 10, 3, 63, 24, 15, 69, 29, 34, 85,
                67, 48, 19, 74, 8, 93, 62, 15, 49, 36, 91, 81, 37, 17, 88, 27, 68, 63 };
		int evenTotal = 0;
		int oddTotal = 0;
		int evenCount = 0;
		int oddCount = 0;
				
		for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) 
			{
                System.out.println(myArray[i] + " is at position " + i);
                evenTotal += myArray[i];
                evenCount++;
            }
        }
		 double evenAv = (double)(evenTotal) / (double) (evenCount);

        System.out.println("The Average of the even values is: " + evenAv);
		
		for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 != 0) 
			{
                System.out.println(myArray[i] + " is at position " + i);
                oddTotal += myArray[i];
                oddCount++;
            }
        }
		double oddAv = (double)(oddTotal) / (double) (oddCount);

        System.out.println("The Average of the odd values is: " + oddAv);
		
	}
	
}
