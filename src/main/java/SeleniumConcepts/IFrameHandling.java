package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameHandling {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@title = 'vehicle-registration-forms-and-templates']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id = 'frame-one748593425']")));
		driver.findElement(By.xpath("//input[@name = 'RESULT_TextField-8']")).sendKeys("Geeta");
		
		
	}

}
