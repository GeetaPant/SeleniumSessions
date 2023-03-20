package SeleniumConcepts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PseudoElementsConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
	String script = " return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"), '::before').getPropertyValue('content')\r\n"
			+ "";
	driver = new ChromeDriver(co);
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	
	JavascriptExecutor js =(JavascriptExecutor)driver;
	String mand_field = js.executeScript(script).toString();
	System.out.println(mand_field);
	if(mand_field.contains("*")) {
		System.out.println("this is a mandatory field");
	}
	}

}
