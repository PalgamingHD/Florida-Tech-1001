
 
import java.util.*;

public class Modulo {
	
	public static int mod(int a, int b)
	{
		int g = a/b;
		return a-b*g;
	}
    public static void main (String[] args)
	{
	System.out.println("Input two numbers");
	Scanner numScan = new Scanner(System.in);
	int a = numScan.nextInt();
		int b = numScan.nextInt();
	System.out.println(mod(a,b));
	}
}
