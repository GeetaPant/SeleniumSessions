package SeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeLocators {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver ();
		driver.get("https://www.aqi.in/dashboard/canada");
	}

}
