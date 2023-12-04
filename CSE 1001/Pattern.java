/**************************************************************************

 * @By: Panipal Isaac

 * @Lab: 23

 * @CSE 1001 Fund Software, Fall 2023
 
 * @Date: 11/16/2023

 * @Description: Grid of patterns
 * **************************************************************************/
 
 import java.util.*;
 
public class Pattern {
    public static void main(String[] args) {
		
        // Two dimensional array:
		System.out.println("How many rows/coloumns would you like?");
		Scanner numScan = new Scanner(System.in);
		int amountInput = numScan.nextInt();
		
        char[][] myArray = new char[amountInput][amountInput];

        for (int i = 0; i < myArray.length; i++) 
		{
			if ( i % 2 != 0)
			{
            for (int j = 0; j < myArray[i].length; j = j+2) {
                myArray[i][j] = '-';
            }
			for (int j = 1; j < myArray[i].length; j = j+2) {
                myArray[i][j] = '0';
            }
			}
			else
			{
				for (int j = 0; j < myArray[i].length; j = j+2) {
                myArray[i][j] = '0';
            }
			for (int j = 1; j < myArray[i].length; j = j+2) {
                myArray[i][j] = '-';
            }
				
			}
        }
		

        // Add two for loops here:

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j]);
            }
						System.out.println("");

        }
    }
}