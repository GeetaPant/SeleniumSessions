 package TestNGSession;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTest {
	
	//AAA Rule - Arrange, Act, Assert
	//1 test case - 1 assertion is best practice
@BeforeSuite

public void startDBConnection() {
	System.out.println("Db Connection setup");
}
@BeforeTest
public void createUser() {
	System.out.println("Create User - BeforeTEst");
}
@BeforeClass
public void openBrowse() {
	System.out.println("Launch Browser... Before Class");
}
@BeforeMethod
public void launchApp() {
	System.out.println("Launch the app... Before Method");
}
@Test(expectedExceptions = ArithmeticException.class)
public void verifTitle() {
	System.out.println("Verify Title.... Test Method");
	int s = 7/0;
}
@Test
public void checkCurrentURL() {
	System.out.println("Verify current URL. Test mMethod");
}
@AfterMethod
public void closeApp() {
	System.out.println("Close the app... AfterMethod");
}
@AfterClass
public void closeBrowser() {
	System.out.println("Close Borwser... Afterclass");
}

}
