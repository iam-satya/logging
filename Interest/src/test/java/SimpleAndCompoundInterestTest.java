import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleAndCompoundInterestTest {
	SimpleAndCompoundInterest s=new SimpleAndCompoundInterest();
	@Test
	public  void test() {
		assertEquals(10500,s.simpleInterestCalc(10000,5,1),0.0f); 
	
	}

}
