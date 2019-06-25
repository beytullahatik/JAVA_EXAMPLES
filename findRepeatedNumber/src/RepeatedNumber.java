import java.util.Scanner;
public class RepeatedNumber
	{
		static Scanner input = new Scanner(System.in);
		public static void main(String[] args)
			{
			    printMessage("How many digits :");   //
				int arrayLength = input.nextInt();
				int [] Array = new int [arrayLength];
			 	try 
					{
						getNumbers(Array);
						findRepatedNumbers( Array.length, Array);
					}
				catch(NumberFormatException e)
					{
						printMessage("Unexpected error. Please enter a number. Try again.");
					}
				finally 
					{
						input.close();
					}
			}
		private static void findRepatedNumbers( int arrayLength, int[] Array) //
			{
				int counter=0;
				for(int i=0; i<Array.length; i++)
				{
					for(int j=i+1; j<Array.length; j++)
					{
						if(Array[i]==Array[j]) 
						{
							counter++;
							printMessage(Array[i]+" is repeated.");
						}	
					}
				}
				if(counter==0)
					printMessage("There is no repeated number.");
			}
		private static void getNumbers(int[] Array) 
			{
			printMessage("Enter numbers : ");
			for(int i=0; i<Array.length; i++)
				{
					Array[i]=input.nextInt();
				}
			}
		private static void printMessage(String message)
			{
				System.out.println(message);
			}
}
