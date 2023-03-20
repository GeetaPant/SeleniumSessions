package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		driver.switchTo().frame("main");
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();//come out of frame
		//2 types of frame (frame and iFrame). No change in automation
	}

}
