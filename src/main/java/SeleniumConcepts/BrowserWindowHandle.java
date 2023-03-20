package SeleniumConcepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@href, 'linkedin')]")).click();
		Set<String> handle = driver.getWindowHandles();
		Iterator<String> it = handle.iterator();
		String pwid = it.next();
		System.out.println("parent window ID: "+ pwid);
		 String cwid = it.next();
		System.out.println("child window ID: "+cwid);
		
		driver.switchTo().window(cwid);
		System.out.println(driver.getCurrentUrl());
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		driver.switchTo().window(pwid);
		System.out.println(driver.getCurrentUrl());
		String title1 = driver.getTitle();
		System.out.println(title1);
	}
	
}
