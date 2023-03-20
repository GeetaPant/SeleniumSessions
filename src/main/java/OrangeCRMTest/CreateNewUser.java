package OrangeCRMTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateNewUser
{

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains (text(), 'Sign Up')]")).click();
		
		fillNewUserForm();
	}
	
	public static void fillNewUserForm()
	{
	WebElement edition =driver.findElement(By.xpath("//select[@id= 'payment_plan_id']"));
		Select select = new Select(edition);
		select.selectByVisibleText("Free Edition");
		driver.findElement(By.xpath("//input[@name ='first_name']")).sendKeys("ved");
		driver.findElement(By.xpath("//input[@name ='surname']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@name ='email']")).sendKeys("geetautomation001@gmail.com");
		driver.findElement(By.xpath("//input[@name ='email_confirm']")).sendKeys("geetautomation001@gmail.com");
		driver.findElement(By.xpath("//input[@name ='username']")).sendKeys("geetautomation001@gmail.com");
		driver.findElement(By.xpath("//input[@name ='password']")).sendKeys("testing#01");
		driver.findElement(By.xpath("//input[@name ='passwordconfirm']")).sendKeys("testing#01");
		
		
	}

}
