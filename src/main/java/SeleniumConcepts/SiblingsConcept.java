package SeleniumConcepts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiblingsConcept {
	
static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	
	
			driver=new ChromeDriver();
			driver.get("https://classic.crmpro.com/");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys("newautomation");
			driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("Selenium@12345");
			driver.findElement(By.xpath("//input[@value= 'Login']")).click();
			Thread.sleep(3000);
			driver.switchTo().frame("mainpanel");
			
			driver.findElement(By.xpath("//a[text() = 'Contacts']")).click();
			Thread.sleep(5000);
		
			selectUser("Romi singh");
			selectUser("deepti gupta");
			
		 String companyName = selectCompany("Romi singh");
			System.out.println(companyName);
			
			List<String> phoneNo = getPhoneNumber("Romi singh");
			System.out.println(phoneNo);
		
		 companyName = selectCompany("deepti gupta");
				System.out.println(companyName);
			List <String> Ph2 = getPhoneNumber("deepti gupta");
			System.out.println("Deepti's Phone numbers:  "+Ph2);
	
			
	}
	public static void selectUser(String username){
	driver.findElement(By.xpath("//a[text()='"+username+"']/parent::td/preceding-sibling::td/input[@name='contact_id']")).click();
		
	}
	public static String selectCompany(String username){
		return driver.findElement(By.xpath("//a[text()='"+username+"']/parent::td/following-sibling::td/a[@context='company']")).getText();
	
	}
	public static List<String> getPhoneNumber(String username){
		List<WebElement> phoneNumbers = driver.findElements(By.xpath("//a[text()= '"+username+"']/parent::td/following-sibling::td//span[@context='phone']"));
		List<String>phone = new ArrayList<String>();
		for(WebElement e: phoneNumbers){
			String ph = e.getText();
			phone.add(ph);
			}
            return phone;
	}
}
