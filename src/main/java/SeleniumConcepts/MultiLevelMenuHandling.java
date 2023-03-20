package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MultiLevelMenuHandling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.get("https://www.bigbasket.com/");
		Thread.sleep(3000);
		
		selectMultipeLevelProduct("Baby Care","Baby Accessories","Baby Toys");
		
	}
	public static void selectMultipeLevelProduct(String l2, String l3, String l4) throws InterruptedException
	{
		WebElement parentEle = driver.findElement(By.xpath("//a[@qa = 'categoryDD']"));
		Actions act = new Actions(driver);
		act.moveToElement(parentEle).build().perform();
		Thread.sleep(2000);
		WebElement l2Ele = driver.findElement(By.linkText(l2));
		act.moveToElement(l2Ele).build().perform();
		Thread.sleep(2000);
		WebElement l3Ele = driver.findElement(By.linkText(l3));
		act.moveToElement(l3Ele).build().perform();
		Thread.sleep(2000);
		WebElement l4Ele = driver.findElement(By.linkText(l4));
		act.click(l4Ele).build().perform();
	}

}
