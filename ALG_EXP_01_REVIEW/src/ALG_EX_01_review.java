import java.util.Scanner;
public class ALG_EX_01
{
	public static void printMessage(String prime_number)
	{
		System.out.println(prime_number);
	}
	public static void main(String[] args)
	{
		    int counter=0;
		    Scanner input = new Scanner(System.in);
		    printMessage("Dizi boyutu giriniz : ");
			int index = input.nextInt();
			int [] Array = new int [index];
			try 
			{
				for(int i=0; i<index; i++)
				{
					printMessage("Sayi giriniz : ");
					Array[i]=input.nextInt();
				}
				for(int i=0; i<index; i++)
				{
					for(int j=i+1; j<index; j++)
					{
						if(Array[i]==Array[j]) 
						{
							counter++;
							printMessage(Array[i]+" sayisi tekrar etmiþtir.");
						}	
					}
				}
				if(counter==0)
					printMessage("Tekrar yoktur");
			}
			catch(Exception e)
			{
				printMessage("Dizi boyutu olarak harf veya karakter girilmiþtir.");
			}
	}
}
