package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragandDropConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement ele1 = driver.findElement(By.id("draggable"));
		WebElement ele2 = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
	//	act.clickAndHold(ele1).moveToElement(ele2).build().perform();
		act.dragAndDrop(ele1, ele2).release().build().perform();
}
}