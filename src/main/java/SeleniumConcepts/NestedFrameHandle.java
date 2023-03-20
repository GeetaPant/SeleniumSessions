package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NestedFrameHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.get("https://selectorshub.com/iframe-scenario/");
		driver.switchTo().frame("pact1");
		driver.findElement(By.id("inp_val")).sendKeys("Geeta");
		driver.switchTo().frame("pact2");
		driver.findElement(By.id("jex")).sendKeys("Geeta");
		driver.switchTo().frame("pact3");
		driver.findElement(By.id("glaf")).sendKeys("Geeta");
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
		driver.findElement(By.id("inp_val")).sendKeys("Vyom");
		
		
	}

}
