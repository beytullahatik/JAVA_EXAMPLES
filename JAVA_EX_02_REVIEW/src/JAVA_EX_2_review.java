import java.util.Scanner;

public class JAVA_EX_2 
{
	public static void printMessage(String prime_number)
	{
		System.out.println(prime_number);
	}
	public static void main(String[] args)
	{	
		int prime_number_limit = 0;
		int counter=0;
		Scanner input = new Scanner(System.in);
	 	 printMessage("Enter Number: ");
		 prime_number_limit = input.nextInt();
		try
		{

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
		catch(Exception e) 
		{
			printMessage("Please enter a number.");
		}
		finally
		{
			input.close();
		}
	}
}