public class JAVA_EX_1 
{
	public static void printMessage(String prime_number)
	{
		System.out.println(prime_number);
	}
	public static void main(String[] args) 
	{
		int counter=0;
		printMessage("Prime numbers from 1 to 20 are :");
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
}
