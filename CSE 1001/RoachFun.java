		import java.util.*;
		
		public class RoachFun
		{
		
			public static void main(String[] args) {
			Scanner keyboard = new Scanner(System.in);
			double GROWTH_RATE;
			double ONE_BUG_VOLUME;
			double houseVolume, population, totalBugVolume;
			System.out.print("Enter total house volume (cubic feet):");
			houseVolume = keyboard.nextDouble();
			System.out.print("Enter initial number of roaches:");
			population = keyboard.nextDouble();
			System.out.print("Enter total growth rate:");
			GROWTH_RATE = keyboard.nextDouble();
			System.out.print("Enter bug volume:");
			ONE_BUG_VOLUME = keyboard.nextDouble();
			System.out.println();
			System.out.println("House volume:" + houseVolume + " cubic feet");
			System.out.println("Initial population:" + population);
			System.out.println();
			totalBugVolume = population * ONE_BUG_VOLUME;
			int countWeeks = 0;
			totalBugVolume = population * ONE_BUG_VOLUME;
			while (totalBugVolume < houseVolume) {
			population = population + (GROWTH_RATE * population);
			totalBugVolume = population * ONE_BUG_VOLUME;
			countWeeks++;
			System.out.println("week " + countWeeks + ":");
			System.out.println("The Population is: " + population);
			System.out.println("The total volume is: " + totalBugVolume);

			}
			System.out.println("The house will be filled in " + countWeeks + " weeks.");
			System.out.println("There will be " + (int)population + " roaches.");
			System.out.println("They will fill " + totalBugVolume + " cubic feet.");
}
}


