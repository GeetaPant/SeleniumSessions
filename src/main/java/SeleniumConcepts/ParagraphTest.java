package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ParagraphTest {

	public static void main(String[] args)
	{
		String browserName = "chrome";
		browserUtil brutil = new browserUtil();
		WebDriver driver = brutil.initDriver(browserName);
		brutil.launchURL("https://classic.crmpro.com/");
		brutil.getTitle();
		
		By para = By.xpath("//div[@class = 'col-sm-10']/p");
		
		ElementUtil ele = new ElementUtil(driver);
		List<WebElement> paracount = ele.getElements(para);
	    System.out.println("paragraph count "+ paracount.size());
	    for(WebElement e : paracount)
	    {
	    	String text = e.getText();
	    	System.out.println(text);
	    	System.out.println(" ");
	    }
	  //  brutil.closeBrowser();
		
	}

}
