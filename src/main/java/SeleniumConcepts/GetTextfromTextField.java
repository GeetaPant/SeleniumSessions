package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetTextfromTextField {

	static WebDriver driver;

	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	//	JavaScriptUtil jsUtil= new JavaScriptUtil(driver);
		WebElement fn = driver.findElement(By.id("input-firstname"));
		//jsUtil.drawBorder(fn);
		String place = fn.getAttribute("placeholder");
		System.out.println(place);
		fn.sendKeys("Testing");
			//	fn.sendKeys(null) -- Throws illegalArgumentexception error
		String name = fn.getAttribute("value");
		System.out.println(name);
		
	}
}
