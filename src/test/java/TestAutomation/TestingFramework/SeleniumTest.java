package TestAutomation.TestingFramework;

import org.testng.annotations.Test;

public class SeleniumTest {
	
	@Test
	public void getMethodname() {
		System.out.println("Selenium Test");
	}
	
	@Test(groups = {"Regression"}, priority=-1)
	public void getMethodRegression() {
		System.out.println("Selenium Regression Test");
	}
	
	@Test(groups = {"Smoke"}, priority=1)
	public void getMethodSmoke() {
		System.out.println("Selenium Smoke Test");
	}

}
