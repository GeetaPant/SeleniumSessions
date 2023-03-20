package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickSendKeys {

	static WebDriver driver;

	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		By fname = By.id("input-firstname");
		By lname = By.id("input-lastname");
		Actions act = new Actions(driver);
		act.sendKeys(driver.findElement(fname), "Geeta").build().perform();
		act.sendKeys(driver.findElement(lname), "Pant").build().perform();
	}
	
}
