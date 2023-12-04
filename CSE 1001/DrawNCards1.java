/**************************************************************************

 * @By: Panipal Isaac

 * @Lab: 19

 * @CSE 1001 Fund Software, Fall 2023
 
 * @Date: 10/31/2023

 * @Description: Draw Cards
 * **************************************************************************/
import java.util.*;

public class DrawNCards1
{
	
	
	public static void main (String[] args)
	{
	System.out.println("How many Cards would you like?");
	Scanner numScan = new Scanner(System.in);
	int amountValues = numScan.nextInt();
	
	for(int i = 0; i<amountValues; i++)
	{
		drawCards();
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void drawCards()
	{
		
		
		Random randomNum = new Random();

		int randomSuite = randomNum.nextInt(4);
		int randomNumber = randomNum.nextInt(13);
		
		String[] suites = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] numbers = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

		String selectSuite = suites[randomSuite];
        String selectNumber = numbers[randomNumber];
		
		 System.out.println(selectNumber + " of " + selectSuite);

		
	}
	
	
	
}
