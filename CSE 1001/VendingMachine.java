/**************************************************************************

 * @By: Panipal Isaac

 * @Lab: 8

 * @CSE 1001 Fund Software, Spring 2021

 * @Date: 9/19/2023

 * @Description: Minimize a given piece of code

 * **************************************************************************/
import java.util.Scanner;
public class VendingMachine {
	public static void main(String[] args) {
		int amount;
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter an integer between 1 and 99:");
		amount = kb.nextInt();
		System.out.println(amount + " cents in coins is:");

		System.out.println((amount/25) + " quarters"); // Determine the number of quarters
		amount = amount%25; // Extract the quarters
		System.out.println((amount/10) + " dimes");  // Determine the number of dimes
		amount = amount%10; // Extract the dimes
		System.out.println((amount/5) + " nickles"); ; // Determine the number of nickles
		amount = amount%5;
		System.out.println((amount%5) + " pennies"); ; // Extract the nickles; leftover is pennies
	}
}
