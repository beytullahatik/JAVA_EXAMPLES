public class JAVA_EX_1 {

	public static void main(String[] args) {
		int counter=0;
		for (int i = 2; i <= 20; i++) {
			  for(int j=2; j<=i; j++) {
				  if(i%j==0)
					 counter++;
			  }	
			  if(counter==1)
				  System.out.println("Prime number : " +i);
			  counter=0;
		}
	}
}
