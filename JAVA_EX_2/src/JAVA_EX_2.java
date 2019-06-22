import java.util.Scanner;

public class JAVA_EX_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number:");
		int index = input.nextInt();
		int vn_counter=0;
		for (int i = 2; i <= index; i++) {
			  for(int j=2; j<=index; j++) {
				  if(i%j==0)
					 vn_counter++;
			  }	
			  if(vn_counter==1)
				  System.out.println("Prime number : " +i);
			  vn_counter=0;
		}
	}
}