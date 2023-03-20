package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SliderMoveConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.get("https://jqueryui.com/resources/demos/slider/default.html");
		WebElement slider = driver.findElement(By.id("slider"));
		slider.click();
		int x = slider.getSize().getWidth();
		System.out.println("Width is: "+x);
		Actions act = new Actions(driver);
		act.moveToElement(slider, -((x/2)-20), 0).click().build().perform();
		
	}

}
