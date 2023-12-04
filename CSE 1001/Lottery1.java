/**************************************************************************

 * @By: Panipal Isaac

 * @Lab: 20

 * @CSE 1001 Fund Software, Fall 2023
 
 * @Date: 11/2/2023

 * @Description: Draw Lottery
 * **************************************************************************/
 
import java.util.*;

public class Lottery1 {
    public static void main(String[] args) {
		

		
        Scanner numScan = new Scanner(System.in);
        System.out.print("Enter number of tickets: ");
		
		
		int numTix = numScan.nextInt();

		int[][] tix = new int[numTix][5];

        for (int i = 0; i < numTix; i++) 
		{
            System.out.print("Enter ticket # " + (i + 1) + " (5 numbers, range 1 - 99): ");
			for (int j = 0; j < 5; j++) {
                System.out.print("Number " + (j + 1) + ": ");
                tix[i][j] = numScan.nextInt();
                while (tix[i][j] < 1 || tix[i][j] > 99) {
                    System.out.println("Please enter numbers in the range!");
					                tix[i][j] = numScan.nextInt();

                }
            }
        }

        System.out.println("Your tickets are:");

        for (int i = 0; i < numTix; i++) 
		{
            System.out.print("Ticket " + (i + 1) + ": ");
            for (int j = 0; j < 5; j++) {
                System.out.print(tix[i][j] + " ");
            }
            System.out.println();
        }

		int total = numTix * 2;
        System.out.println("Total cost: $" + total);
	
    }
}
