package junit;
import static org.junit.Assert.*;

import org.junit.Test;

public class findPrimeNumbersTest {
	findPrimeNumbers1toN test = new findPrimeNumbers1toN();
	
	@Test
	public void test() {
		assertEquals(true,test.isPrime(29));
		
	}
	

}