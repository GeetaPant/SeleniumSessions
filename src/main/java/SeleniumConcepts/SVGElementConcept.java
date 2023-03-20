package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElementConcept {
static WebDriver driver;

	//SVG - Scaler Vector Graphs
	//how to find the tota numberof svg element on a page -
	// -- //*[local-name()= 'svg']

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map#/");
		Thread.sleep(4000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id, 'map-instance')]")));
		List<WebElement> states = driver.findElements(By.xpath("//*[local-name()='svg' and @id= 'map-svg']//*[name()='g' and @id = 'regions']//*[name() = 'path']"));
		System.out.println(states.size());
		for(WebElement e: states) {
		String text =e.getAttribute("name");
		System.out.println(text);
		if(text.equals("Colorado")) {
			e.click();
			break;
		}
	
		}
	   List<WebElement> colorado =driver.findElements(By.xpath("//*[local-name() = 'svg' and @id = 'map-svg']//*[name()= 'g' and @id = 'regions']//*[name() ='path']"));
	   System.out.println(colorado.size());
		for(WebElement e: colorado) {
		String text1 =e.getAttribute("name");
		System.out.println(text1);
	}

}
}
