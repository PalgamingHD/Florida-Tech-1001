/**************************************************************************

 * @By: Panipal Isaac

 * @Lab: 23

 * @CSE 1001 Fund Software, Fall 2023
 
 * @Date: 11/16/2023

 * @Description: Grid of char
 * **************************************************************************/
 
 import java.util.*;
public class Grid {
    public static void main(String[] args) {
		
        // Two dimensional array:
		System.out.println("How many rows/coloumns would you like?");
		Scanner numScan = new Scanner(System.in);
		int amountInput = numScan.nextInt();
		
        char[][] myArray = new char[amountInput][amountInput];

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = '*';
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