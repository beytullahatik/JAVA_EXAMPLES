import java.util.Scanner;
public class ALG_EX_01
{

	public static void main(String[] args)
	{
			try 
			{
				int vn_counter=0;
				Scanner input = new Scanner(System.in);
				System.out.println("Enter Array Size:");
				int vn_index = input.nextInt();
				int [] Array = new int [vn_index];
				for(int i=0; i<vn_index; i++)
				{
					System.out.println("Enter number:");
					Array[i]=input.nextInt();
				}
				for(int i=0; i<vn_index; i++)
				{
					for(int j=i+1; j<vn_index; j++)
					{
						if(Array[i]==Array[j]) 
						{
							vn_counter++;
							System.out.println(Array[i]+" sayisi tekrar etmiþtir");
						}	
					}

				}
				if(vn_counter==0)
					System.out.println("tekrar yoktur");
			}
			catch(Exception e)
			{
				System.out.println("Dizi boyutu olarak harf veya karakter girilmiþtir.");
			}
	}
}
