package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCountTest {

	static WebDriver driver;
	
	public static void main(String[] args)
	{
		int counter =0;
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		int linkcount = linklist.size();
		System.out.println("The total number of links...." + linkcount);
		for (int i = 0;i<linkcount; i++)
		{
			String text = linklist.get(i).getText();
			if(text.equals(""))
			{
				counter = counter+1;
			
			}
		}
		System.out.println("Empty Links Counts...."+ counter);

}
}