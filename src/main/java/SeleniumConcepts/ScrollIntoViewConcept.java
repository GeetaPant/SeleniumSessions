package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScrollIntoViewConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.get("https://www.amazon.com/");
		WebElement vb= driver.findElement(By.xpath("//span[text()='Popular items this season']"));
		JavaScriptUtil jsUtil= new JavaScriptUtil(driver);
		
		 jsUtil.scrollIntoView(vb);

	}

}
