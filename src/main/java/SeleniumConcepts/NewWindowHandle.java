package SeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowHandle {
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String pwid = driver.getWindowHandle();
	//	driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);//sel 4.x
		
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		driver.close();
		driver.switchTo().window(pwid);
		System.out.println(driver.getTitle());
	}

}
