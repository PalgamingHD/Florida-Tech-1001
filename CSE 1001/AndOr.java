/**************************************************************************

 * @By: Panipal Isaac

 * @Lab: 23

 * @CSE 1001 Fund Software, Fall 2023
 
 * @Date: 11/16/2023

 * @Description: Grid of patterns
 * **************************************************************************/
 
 import java.util.*;
 
public class AndOr {
    public static void main(String[] args) {
		Scanner numScan = new Scanner(System.in);
		System.out.println("enter n");
		int n = numScan.nextInt();

		System.out.println("enter m");
		int m = numScan.nextInt();

		
        int[][] myArray = new int[m][n];

        for (int i = 0; i < myArray.length; i++) 
		{
			
            for (int j = 0; j < myArray[i].length; j++) {
				myArray[i][j] = (int) (Math.random() * 2);
         
			}
        }
		  int[][] myArray2 = new int[m][n];

        for (int i = 0; i < myArray2.length; i++) 
		{
			
            for (int j = 0; j < myArray2[i].length; j++) {
				myArray2[i][j] = (int) (Math.random() * 2);
         
			}
        }
		int[][] andResultArray = new int[m][n];
		for (int i = 0; i < andResultArray.length; i++) {
            for (int j = 0; j < andResultArray[i].length; j++) {
                andResultArray[i][j] = myArray[i][j] & myArray2[i][j];
            }
        }
		
		int[][] orResultArray = new int[m][n];
		for (int i = 0; i < orResultArray.length; i++) {
            for (int j = 0; j < orResultArray[i].length; j++) {
                orResultArray[i][j] = myArray[i][j] | myArray2[i][j];
            }
        }
		

								System.out.println("");

		System.out.println("First 2D Array:");
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j]);
            }
						System.out.println("");

        }
								System.out.println("");

		System.out.println("Second 2D Array:");
        for (int i = 0; i < myArray2.length; i++) {
            for (int j = 0; j < myArray2[i].length; j++) {
                System.out.print(myArray2[i][j]);
            }
						System.out.println("");

        }
		System.out.println("And of the Array:");
        for (int i = 0; i < andResultArray.length; i++) {
            for (int j = 0; j < andResultArray[i].length; j++) {
                System.out.print(andResultArray[i][j]);
            }
						System.out.println("");

        }
		System.out.println("Or of the Array:");
        for (int i = 0; i < orResultArray.length; i++) {
            for (int j = 0; j < orResultArray[i].length; j++) {
                System.out.print(orResultArray[i][j]);
            }
						System.out.println("");

        }
    }
}