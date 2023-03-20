package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTablePaginationMultipleSelect {
		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(co);
			driver.get("https://selectorshub.com/xpath-practice-page/");
			while(true) {
				if(driver.findElements(By.xpath("//td[text() = 'Denmark']")).size()> 0) {
					multipleCountry("Denmark");
				}
					WebElement next = driver.findElement(By.linkText("Next"));
					if(next.getAttribute("class").contains("disabled"))
					{
						System.out.println("Pagination is over");
						break;
					}
					next.click();
				}
			}

		public static void multipleCountry(String multipleCountry) {
		List<WebElement> multi=	driver.findElements(By.xpath("(//td[text() = '"+multipleCountry+"'])/preceding-sibling::td/input[@type = 'checkbox']"));
		for(WebElement e: multi) {
			e.click();
		}
		}
}
