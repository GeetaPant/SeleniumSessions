package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MovetoElement {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.get("http://mrbool.com/search/");
		WebElement content = driver.findElement(By.xpath("//a[@class = 'menulink']"));	
		Actions act = new Actions(driver);
		act.moveToElement(content).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("COURSES")).click();
	}

}
