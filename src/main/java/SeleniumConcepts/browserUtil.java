package SeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserUtil 
{
	private WebDriver driver;
	
	public WebDriver initDriver(String browserName)
	{
	System.out.println("The browser is:" + browserName);
	switch (browserName.toLowerCase().trim()) {
	case "chrome":
		driver = new ChromeDriver();
		break;
	case "firefox":
		driver = new FirefoxDriver();
		break;
	case "edge":
		driver = new EdgeDriver();
		break;
	default:
		System.out.println(browserName +" is not a valid browser");
		break;
	}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	return driver;
	}	
  public void launchURL(String url)
  {
	  if(url == null)
	  {
		  	System.out.println("No url provided");
	  }
	  if(url.indexOf("https")==0)
	  {
		  driver.get(url);
	  }
	  else
	  {
		  System.out.println("Please add http to get URL launched");
	  }
  }
	 public String getTitle()
	{
	 String title = driver.getTitle();
	 System.out.println("The title of page is:" + title);
	 return title;
	}
	public void closeBrowser()
	{
		if(driver != null)
		{
			driver.close();
		}
		else
		{
			System.out.println("Please provide URL first....");
		}
	}

}
