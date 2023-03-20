package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeDropDown{

static WebDriver driver;

public static void main(String [] args) {
	driver = new ChromeDriver();
	driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	//driver.manage().window().maximize();
//	By firstDD = By.xpath("//select[@id = 'first']");
//	
//	WebElement browseDD = driver.findElement(firstDD);
//	Select select = new Select(browseDD);
//	List<WebElement> browserCount = select.getOptions();
//	System.out.println(browserCount.size());
////	select.selectByVisibleText("Yahoo");
//	
//	for(WebElement e: browserCount) {
//		String text = e.getText();
//		System.out.println(text);
//		if(text.equals("Yahoo")) {
//			e.click();
//			break;
//		}
//	}
	By secondDD = By.xpath("//select[@id = 'second']");
	WebElement seconDDD = driver.findElement(secondDD);
	Select select = new Select(seconDDD);
	
	select.selectByVisibleText("Donut");
	List<WebElement> eatCount = select.getOptions();
	System.out.println(eatCount.size());
	
	
}
	
}
