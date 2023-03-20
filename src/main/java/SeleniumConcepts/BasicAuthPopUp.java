package SeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthPopUp {
static WebDriver driver;
	public static void main(String[] args) {
		
		String uname = "admin";
		String pwd= "admin";
		driver = new ChromeDriver();
		//need to enter username and pwd after http with: separated
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.get("https://"+uname+":"+pwd+"@"+"the-internet.herokuapp.com/basic_auth");
	}

}
