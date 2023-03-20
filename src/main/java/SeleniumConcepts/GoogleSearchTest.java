package SeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
	static WebDriver driver;
	
	public static void main(String[] args) {
	
	
			driver=new ChromeDriver();
			driver.get("https://www.google.com/");
	}

}
