package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StaleElementException {

			static WebDriver driver;

		public static void main(String[] args) {
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(co);
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
			WebElement fn = driver.findElement(By.id("input-firstname"));
			fn.sendKeys("testing");
			driver.navigate().refresh();
			fn.sendKeys("Fsds"); //gives staleeleemntexception
			
	}

}
