package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTablePagination {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.get("https://selectorshub.com/xpath-practice-page/");
		while(true) {
			if(driver.findElements(By.xpath("//td[text() = 'India']")).size()> 0) {
				selectCountry("India");
				break;
			}
			else {
				WebElement next = driver.findElement(By.linkText("Next"));
				if(next.getAttribute("class").contains("disabled"))
				{
					System.out.println("Pagination is over... Select right country");
					break;
				}
				next.click();
			}
		}
	}

	private static void selectCountry(String countryName) {
		driver.findElement(By.xpath("//td[text() = '"+countryName+"']/preceding-sibling::td/input[@type = 'checkbox']")).click();
	}

}
