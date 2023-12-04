import java.util.Scanner;
public class Store {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Setting up scanner
        
        System.out.println("Select a product to purchase:");
        System.out.println("    1 - book $15");
        System.out.println("    2 - bag  $5");
        System.out.println("    3 - ball $10");
        System.out.println("    4 - cancel");
        System.out.print("Select an option: ");
        
        int option = in.nextInt();
        in.close(); // Close scanner when done using it

        int total = 0;
		
		switch(option)
		{
			case 1: total += 15;
			break;
			case 2: total += 5;
			break;
			case 3: total += 10;
			break;
			case 4: System.exit(0);
			break;
			default: System.out.println("Unkown option: " + option);
			System.exit(0);
			break;
		}
        System.out.print("Your total is: $" + total);
    }
}