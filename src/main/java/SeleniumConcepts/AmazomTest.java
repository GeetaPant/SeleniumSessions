package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazomTest {

	public static void main(String[] args) 
	{
		
		// Capture all the footers 
		browserUtil brutil = new browserUtil();
		String browserName = "chrome";
		WebDriver driver = brutil.initDriver(browserName);
		brutil.launchURL("https://www.amazon.com/");
		By footer = By.xpath("//div[@id= 'navFooter']//a");
		
		ElementUtil ele = new ElementUtil(driver);
		List<String> footertext = ele.getElementsTextList(footer);
		System.out.println(footertext);
		 System.out.println(footertext.size());
		
		 System.out.println("-------------------------------------");
		By contentlink = By.xpath("//a[starts-with(text(), 'Amazon')]");
		List<String> amazonlist = ele.getElementsTextList(contentlink);
		System.out.println(amazonlist);
		System.out.println(amazonlist.size());
	}

}