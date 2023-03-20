package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StaleEleExecWithFEs {

		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(co);
			driver.get("https://www.freshworks.com/");
			Thread.sleep(8000);
			List<WebElement> suppList = driver.findElements(By.xpath("//div[contains (text(), 'Support & Success')]/parent::div//a"));
			System.out.println(suppList.size());
			for( int i =0; i <suppList.size();i++) {
				String text = suppList.get(i).getText();
				System.out.println(text);
				suppList.get(i).click();
				Thread.sleep(3000);
				suppList = driver.findElements(By.xpath("//div[contains (text(), 'Support & Success')]/parent::div//a"));
				Thread.sleep(8000);
				
			}
	}

}
