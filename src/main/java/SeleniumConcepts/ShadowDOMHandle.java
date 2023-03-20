package SeleniumConcepts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ShadowDOMHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
	WebElement pizza = (WebElement)js.executeScript("return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")");
	pizza.sendKeys("Cheese Pizza") ;
	}


}
