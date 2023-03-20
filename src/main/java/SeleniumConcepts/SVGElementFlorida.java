package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SVGElementFlorida {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.get("https://petdiseasealerts.org/forecast-map#/");
		Thread.sleep(4000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id, 'map-instance')]")));
		List<WebElement> states = driver.findElements(By.xpath("//*[local-name()='svg' and @id= 'map-svg']//*[name()='g' and @id = 'regions']//*[name() = 'path']"));
		System.out.println(states.size());
		Actions act = new Actions(driver);
		for(WebElement e: states) {
		String text =e.getAttribute("name");
		System.out.println(text);
		if(text.equals("Florida")) {
			int x = e.getSize().getWidth();
			int y = e.getSize().getHeight();
			System.out.println(x+ ":" +y);
			act.moveToElement(e, (x/4)+75, 0).click().build().perform();
			break;
			}

		}
}
}