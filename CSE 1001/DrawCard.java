/**************************************************************************

 * @By: Panipal Isaac

 * @Lab: 19

 * @CSE 1001 Fund Software, Fall 2023
 
 * @Date: 10/31/2023

 * @Description: Draw Cards
 * **************************************************************************/
import java.util.*;

public class DrawCard
{
	public static void main (String[] args)
	{
		Random randomNum = new Random();

		int randomSuite = randomNum.nextInt(4);
		int randomNumber = randomNum.nextInt(13);
		
		String suite;
		
		if (randomSuite == 0) 
			{
				suite = "Clubs";
			} 
			else if (randomSuite == 1)
			{
				suite = "Diamonds";
			} 
			else if (randomSuite == 2)
			{
				suite = "Hearts";
			} 
			else {
				suite = "Spades";
			}
			
		String numName = "";
		
		if (randomNumber == 0)
		{
			numName = "Ace";
		}
		else if (randomNumber == 1)
		{
			numName = "Two";
		}
				else if (randomNumber == 2)
		{
			numName = "Three";
		}
				else if (randomNumber == 3)
		{
			numName = "Four";
		}
				else if (randomNumber == 4)
		{
			numName = "Five";
		}
				else if (randomNumber == 5)
		{
			numName = "Six";
		}
				else if (randomNumber == 6)
		{
			numName = "Seven";
		}
				else if (randomNumber == 7)
		{
			numName = "Eight";
		}
				else if (randomNumber == 8)
		{
			numName = "Nine";
		}
				else if (randomNumber == 9)
		{
			numName = "Ten";
		}
				else if (randomNumber == 10)
		{
			numName = "Jack";
		}
				else if (randomNumber == 11)
		{
			numName = "Queen";
		}
				else if (randomNumber == 12)
		{
			numName = "King";
		}
		
		System.out.println(numName + " of " + suite);


	}
	
}
