public class findPrimeNumbers1to20 
{
	static int counter=0;
	public static void main(String[] args) 
		{
			printMessage("Prime numbers from 1 to 20 are :");
			try 
				{
					findPrimeNumber1to20();
				}
			catch(Exception e)
				{
					System.out.println("Unexpected error");
				}
		}
	private static void findPrimeNumber1to20() 
		{
		for (int i = 2; i <= 20; i++) 
			{
			  for(int j=2; j<=i/2; j++) 
			  	{
				  if(i%j==0) 
				  {
					 counter++;
				     break;	  
				  }			  
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
