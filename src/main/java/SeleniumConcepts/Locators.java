package SeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators 
{
	static WebDriver driver;
public static void main(String args[])
{
	driver = new ChromeDriver();
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
}
}
