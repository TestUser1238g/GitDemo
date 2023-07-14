package TestAutomation.TestingFramework;

import org.testng.annotations.Test;

public class MobileTest {
	
	@Test
	public void getMethodvalue() {
		System.out.println("Mobile Test");
	}
	
	@Test(groups = {"Regression"}, priority=-1)
	public void getMethodRegression() {
		System.out.println("Mobile Regression Test");
	}
	
	@Test(groups = {"Smoke"}, priority=1)
	public void getMethodSmoke() {
		System.out.println("Mobile Smoke Test");
	}


}
