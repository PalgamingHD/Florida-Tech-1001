/**************************************************************************

 * @By: Panipal Isaac

 * @Lab: 15

 * @CSE 1001 Fund Software, Fall 2023

 * @Date: 10/17/2023

 * @Description: Vowel Checker
 * **************************************************************************/
import java.util.*;

public class Vowel
{
	public static boolean isVowel(char c) 
	{
		return "aeiou".indexOf(c) != -1;
	}
	public static boolean isConsonant(char c) 
	{
		return "bcdfghjklmnpqrstvwxyz".indexOf(c) != -1;
	}
		
	public static void main (String[] args)
	{
		
		
		String phrase;
		Scanner stringScan = new Scanner(System.in);
		System.out.print("Enter a line of text: ");
		phrase = stringScan.nextLine();

		for(int i = 0; i < phrase.length(); i++) 
		{
		String placeholder = phrase.toLowerCase().substring(i,i+1);
		char toChar = placeholder.charAt(0);
		if (isVowel(toChar))
		{
		System.out.println(phrase.charAt(i) + " is a vowel!");
		}
		else if(isConsonant(toChar))
		{
		System.out.println(phrase.charAt(i) + " is a Consonant!");
		}
		else
		{
		System.out.println(phrase.charAt(i) + " is a different character!");
		}
	}
}
}
