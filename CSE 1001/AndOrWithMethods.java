/**************************************************************************

 * @By: Panipal Isaac

 * @Lab: 23

 * @CSE 1001 Fund Software, Fall 2023
 
 * @Date: 11/28/2023

 * @Description: And Or WITH METHODS
 * **************************************************************************/
 
 import java.util.*;
 
public class AndOrWithMethods {
    public static void main(String[] args) {
		Scanner numScan = new Scanner(System.in);
		System.out.println("enter n");
		int n = numScan.nextInt();

		System.out.println("enter m");
		int m = numScan.nextInt();

		
        int[][] myArray = new int[m][n];

        for (int i = 0; i < myArray.length; i++) 
		{
			
            for (int j = 0; j < myArray[i].length; j++) {
				myArray[i][j] = (int) (Math.random() * 2);
         
			}
        }
		  int[][] myArray2 = new int[m][n];

        for (int i = 0; i < myArray2.length; i++) 
		{
			
            for (int j = 0; j < myArray2[i].length; j++) {
				myArray2[i][j] = (int) (Math.random() * 2);
         
			}
        }
		
		int[][] andResultArray = AndArrays(myArray,myArray2);
		
		int[][] orResultArray = OrArrays(myArray,myArray2);
		

		System.out.println("");

		System.out.println("First 2D Array:");
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j]);
            }
						System.out.println("");

        }

		System.out.println("Second 2D Array:");
        for (int i = 0; i < myArray2.length; i++) {
            for (int j = 0; j < myArray2[i].length; j++) {
                System.out.print(myArray2[i][j]);
            }
						System.out.println("");

        }
		
		System.out.println("And of the Array:");
        for (int i = 0; i < andResultArray.length; i++) {
            for (int j = 0; j < andResultArray[i].length; j++) {
                System.out.print(andResultArray[i][j]);
            }
						System.out.println("");

        }
		System.out.println("Or of the Array:");
        for (int i = 0; i < orResultArray.length; i++) {
            for (int j = 0; j < orResultArray[i].length; j++) {
                System.out.print(orResultArray[i][j]);
            }
						System.out.println("");

        }
		
		
		
		
		
		int[][] negateArray1 = NegateArray(myArray);
		
				System.out.println("Negation of Array1:");
				for (int i = 0; i < negateArray1.length; i++) {
				for (int j = 0; j < negateArray1[i].length; j++) {
                System.out.print(negateArray1[i][j]);
				}
						System.out.println("");

				}


		int[][] negateArray2 = NegateArray(myArray2);
		
				System.out.println("Negation of Array2:");
				for (int i = 0; i < negateArray2.length; i++) {
				for (int j = 0; j < negateArray2[i].length; j++) {
                System.out.print(negateArray2[i][j]);
				}
						System.out.println("");

				}
		
		
		
				System.out.println("(A1 and A2) or (~A1 and A2) of the arrays:");
				
				
				int[][] weirdArray = OrArrays(AndArrays(myArray, myArray2),AndArrays(NegateArray(myArray), myArray2));				
				for (int i = 0; i < weirdArray.length; i++) {
				for (int j = 0; j < weirdArray[i].length; j++) {
                System.out.print(weirdArray[i][j]);
				}
						System.out.println("");

				}
		
		
    }
	
	
	
	public static int[][] AndArrays (int[][] a, int[][] b)
	{
		int c = a[0].length;
		int r = a.length;
				
		int[][] andResultArray = new int[r][c];
		for (int i = 0; i < andResultArray.length; i++) {
            for (int j = 0; j < andResultArray[i].length; j++) {
                andResultArray[i][j] = a[i][j] & b[i][j];
            }
        }

		return andResultArray;
	
	
	}	

		public static int[][] OrArrays (int[][] a, int[][] b)
	{
		int c = a[0].length;
		int r = a.length;
				
		int[][] orResultArray = new int[r][c];
		for (int i = 0; i < orResultArray.length; i++) {
            for (int j = 0; j < orResultArray[i].length; j++) {
                orResultArray[i][j] = a[i][j] | b[i][j];
            }
        }
		
		return orResultArray;
	
	
	}
		public static int[][] NegateArray (int[][] a)
	{
		int c = a[0].length;
		int r = a.length;
				
		int[][] negateArray = new int[r][c];
		for (int i = 0; i < negateArray.length; i++) {
            for (int j = 0; j < negateArray[i].length; j++) {
				if(a[i][j] == 1)
				{
				negateArray[i][j] = 0;

				}
				else
				{
				negateArray[i][j] =1;

				}
            }
        }
		
		return negateArray;
	
	
	}			
	
	
	
	
	
	
	
}