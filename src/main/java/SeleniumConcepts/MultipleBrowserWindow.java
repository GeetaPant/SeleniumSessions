package SeleniumConcepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleBrowserWindow {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String pwid = driver.getWindowHandle();
		Thread.sleep(3000);
		WebElement liEle=driver.findElement(By.xpath("//a[contains(@href, 'linkedin')]"));
		WebElement twEle=driver.findElement(By.xpath("//a[contains(@href, 'twitter')]"));
		WebElement faEle=driver.findElement(By.xpath("//a[contains(@href, 'facebook')]"));
		WebElement yoEle=driver.findElement(By.xpath("//a[contains(@href, 'youtube')]"));
		
		liEle.click();
		twEle.click();
		faEle.click();
		yoEle.click();
		
	 Set<String> handles= driver.getWindowHandles();
	 Iterator<String> it = handles.iterator();
	 
	 while(it.hasNext()) {
		String wid = it.next();
		driver.switchTo().window(wid);
		System.out.println("Current URL: "+driver.getCurrentUrl());
		Thread.sleep(2000);
		if(!wid.equals(pwid)){
			driver.close();
		}
		driver.switchTo().window(pwid);
		String title = driver.getTitle();
		System.out.println(title);
		
	 }
	}

}
