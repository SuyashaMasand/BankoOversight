package Maven;

import org.testng.annotations.Test;

public class Maven1Test {
	
	@Test(groups = "smoke")
	public void sample1Test() {
		System.out.println("===TEST SCRIPT 1====");
		
		
		
	}
	
	@Test(groups = "regression")
	public void sample2Test() {
		System.out.println("=== TEST SCRIPT 2===");
		
	}
	
	@Test(groups = {"smoke" , "regression"})
	public void sample3Test() {
		System.out.println("=== TEST SCRIPT 3===");
		
	}

}
