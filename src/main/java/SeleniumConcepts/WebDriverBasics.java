package SeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		WebDriver driver= null;
		String browser = "safari";
		if(browser.equals("chrome"))
		{
		 driver = new ChromeDriver();
		}
		else if (browser.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browser.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		else 
		{
			System.out.println("Invalid Browser." + browser);
		}
	
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("title of page is:" +title);
		
		if(title.equals("Google"))
		{
			System.err.println("Test Pass");
		}
		else
		{
			System.out.println("Test Failed");
		}
		driver.quit();
	}
	

}
