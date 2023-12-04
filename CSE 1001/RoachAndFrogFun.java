		import java.util.*;
		
		public class RoachAndFrogFun
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
			
			double frogs;
			double frogsize;
			double frograte;
			double frogfood;
			double totalFrogVolume;
			double frogpopulation;

			System.out.println("How many frogs are there: ");
			frogs = keyboard.nextDouble();
			System.out.println("What is the size of the frogs: ");
			frogsize = keyboard.nextDouble();
			System.out.println("What is the growth rate of the frogs: ");
			frograte = keyboard.nextDouble();
			System.out.println("How many bugs can one frog eat per week: ");
			frogfood = keyboard.nextDouble();
					
			
			
			
			System.out.println();
			System.out.println("House volume:" + houseVolume + " cubic feet");
			System.out.println("Initial population:" + population);
			System.out.println();
			totalBugVolume = population * ONE_BUG_VOLUME;
			int countWeeks = 0;
			totalBugVolume = population * ONE_BUG_VOLUME;
			totalFrogVolume = frogs * frogsize;
			frogfood = frogs * frogfood; 
			
			while (totalBugVolume + totalFrogVolume < houseVolume) 
			{
			
			frogs = (frogs + (frograte * frogs));
			if (population < 0) {
			population = 0;
			}
			else
			{ 
			population = population - frogfood;
			population = (population + (GROWTH_RATE * population));
			}
			frogs = (frogs + (frograte * frogs));

			totalBugVolume = population * ONE_BUG_VOLUME;
			totalFrogVolume = frogs * frogsize;



			countWeeks = countWeeks + 1;
			System.out.println("week " + countWeeks + ":");
			System.out.println("The Roach Population is: " + population);
			System.out.println("The total Roach volume is: " + totalBugVolume);
			System.out.println("The Frog Population is: " + population);
			System.out.println("The total Frog volume is: " + totalFrogVolume);
			}
			System.out.println("The house will be filled in " + countWeeks + " weeks.");
			System.out.println("There will be " + (int)population + " roaches.");
			System.out.println("There will be " + (int)frogs + " frogs.");
			System.out.println("They will fill " + (totalBugVolume + totalFrogVolume) + " cubic feet.");
}
}


