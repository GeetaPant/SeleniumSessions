package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class RightClickConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement rightCl = driver.findElement(By.xpath("//span[text()= 'right click me']"));
		Actions act = new Actions(driver);
		act.contextClick(rightCl).build().perform();
		
		List<WebElement> rightele = driver.findElements(By.xpath("//ul[@class = 'context-menu-list context-menu-root']//span"));
		System.out.println(rightele.size());
		for(WebElement e: rightele) {
		String text = e.getText();
		System.out.println(text);
		if(text.equals("Quit")) {
			e.click();
			Alert alert = driver.switchTo().alert();
			alert.accept();
			break;
		}
		}

		
}
}