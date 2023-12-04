/**************************************************************************

 * @By: Panipal Isaac

 * @Lab: 19

 * @CSE 1001 Fund Software, Fall 2023
 
 * @Date: 10/31/2023

 * @Description: Draw Cards
 * **************************************************************************/
import java.util.*;

public class randomThing
{
	
	
	public static void main (String[] args)
	{
		Scanner kb = new Scanner(System.in);

System.out.print("Enter n:");
int n = kb.nextInt();

for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++)
        System.out.print(j + "     ");
    System.out.println();
}  System.out.println();

	}
	
	
}
