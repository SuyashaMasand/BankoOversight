package Maven;

import org.testng.annotations.Test;

public class Maven2Test {

	@Test(groups = {"smoke","regression"})
	public void sample4Test() {
		System.out.println("===TEST SCRIPT 4====");
		
	}
	
	@Test(groups = "smoke")
	public void sample5Test() {
		System.out.println("=== TEST SCRIPT 5===");
		
		
		
	}
	
	@Test(groups = "regression")
	public void sample6Test() {
		System.out.println("=== TEST SCRIPT 6===");
	
	
}
}