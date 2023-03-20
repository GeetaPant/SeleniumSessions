package SeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessConcept {
static WebDriver driver;
	

	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
		co.setHeadless(true);
		//co.addArguments("--headless");
		//to run in incognito mode
		//co.addArguments("--incognito");
		driver=new ChromeDriver(co);
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.quit();
}
}
