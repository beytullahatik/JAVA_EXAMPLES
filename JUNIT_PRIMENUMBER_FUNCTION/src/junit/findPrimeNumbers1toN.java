package junit;
public class findPrimeNumbers1toN
{
	
	public boolean isPrime( int parameter ) {
		
		for ( int count=2; count<=(parameter/2); count++ ){
			
			if( parameter%count==0){
				return false;	
			}
		}
		
		return true;
	}

}
