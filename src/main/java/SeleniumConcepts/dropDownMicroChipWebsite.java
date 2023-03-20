package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownMicroChipWebsite {
	static WebDriver driver;
	
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.microchip.com/prochiplicensing/#/");
		WebElement yearDrop = driver.findElement(By.xpath("//select[@id = 'cpld']"));
		Select select = new Select(yearDrop);
		select.selectByVisibleText("ATF1504");
		
	}

}
