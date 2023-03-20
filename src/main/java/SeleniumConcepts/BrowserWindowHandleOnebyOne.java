package SeleniumConcepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleOnebyOne {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String pwid = driver.getWindowHandle();
		Thread.sleep(3000);
		WebElement liEle = driver.findElement(By.xpath("//a[contains(@href, 'linkedin')]"));
		WebElement twEle = driver.findElement(By.xpath("//a[contains(@href, 'twitter')]"));
		WebElement faEle = driver.findElement(By.xpath("//a[contains(@href, 'facebook')]"));
		WebElement yoEle = driver.findElement(By.xpath("//a[contains(@href, 'youtube')]"));

		liEle.click();

		Set<String> handle1 = driver.getWindowHandles();
		Iterator<String> it = handle1.iterator();
		it.next();
		String id1 = it.next();
		driver.switchTo().window(id1);
		String linkedTitle = driver.getTitle();
		System.out.println(linkedTitle);
		driver.close();
		driver.switchTo().window(pwid);
		Thread.sleep(2000);
		
		 twEle.click(); 
		 
		 Set<String> handle2 = driver.getWindowHandles();
		 Iterator<String> it2 = handle2.iterator(); 
		 it2.next();
		 String secondID = it2.next();
		 driver.switchTo().window(secondID);
		 String twitterTitle = driver.getTitle();
		 System.out.println(twitterTitle); 
		 driver.close();
		 driver.switchTo().window(pwid); 
		 Thread.sleep(2000);
		  
		 
		  faEle.click();
		  
		  Set<String> handle3 = driver.getWindowHandles();
		  Iterator<String> it3 = handle3.iterator();
		  it3.next();
		  String thridID = it3.next();
		  driver.switchTo().window(thridID);
		  String faceTitle = driver.getTitle();
		  System.out.println(faceTitle); 
		  driver.close();
		  driver.switchTo().window(pwid); 
		  Thread.sleep(2000);
		 
		
		 yoEle.click();
		 
		 Set<String> handle4 = driver.getWindowHandles();
		 Iterator<String> it4 = handle4.iterator(); 
		 it4.next();
		 String fourthID = it4.next();
		 driver.switchTo().window(fourthID); 
		 String youTitle = driver.getTitle();
		 System.out.println(youTitle); 
		 driver.close(); 
		 driver.switchTo().window(pwid);
		 Thread.sleep(2000);
		  
		  }
}