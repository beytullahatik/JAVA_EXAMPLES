import java.util.Scanner;

public class PrimeNumbers 
	{
		static int counter=0;
		static Scanner input = new Scanner(System.in);
		public static void main(String[] args)
		{	
		 	  printMessage("Enter Number: ");
		 	  int prime_number_limit;
		 	  prime_number_limit = input.nextInt();
			  try
			  	{
				  findPrimeNumber(prime_number_limit);
			  	}
	 		  catch(NumberFormatException e) 
				{
					printMessage("Unexpected Error. Please enter a number. Try again");
				}
			  finally
				{
					input.close();
				}
			
		}
		private static void findPrimeNumber(int prime_number_limit) {
			printMessage("Prime numbers from 1 to "+ prime_number_limit +" are :");				
			  for (int i = 2; i <= prime_number_limit; i++) 
			  	{
				  for(int j=2; j<=i/2; j++) 
				  	{
					  if(i%j==0) 
						 counter++;
					  break;
				  	}
					  if(counter==0)
						  printMessage(""+i);
					  counter=0;
				  	}
			  	}
		
	public static void printMessage(String prime_number)
	{
		System.out.println(prime_number);
	}
}