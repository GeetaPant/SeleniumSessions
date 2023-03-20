package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AttributeSession {

	  
	public static void main(String[] args) {
		String browerName = "chrome";
	 
		browserUtil brutil = new browserUtil();
		WebDriver driver =brutil.initDriver(browerName);
		brutil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		By firstname =By.id("input-firstname");
		By hrefVal = By.tagName("a");
		By texttype = By.className("form-control");
		By linkpath = By.xpath("//aside[@id = 'column-right']//a");
		By headerlist = By.xpath("//nav[@id = 'menu']//a");
		
		
		ElementUtil ele = new ElementUtil(driver);
//		String phval=ele.getElementAttribute(firstname, "placeholder");
//		System.out.println(phval);
//		List<WebElement> urllink = ele.getElements(hrefVal);
//		System.out.println(urllink.size()); 
//		for(WebElement e: urllink)
//		{
//			String hreff= e.getAttribute("href");
//			String linktext = e.getText();
//			
//			System.out.println(hreff + "--" + linktext);
//		}
		
		int elecount = ele.getCount(texttype);
		ele.getCount(linkpath);
		List<WebElement> linkcounts = ele.getElements(linkpath);
		for(WebElement e: linkcounts)
		{
			String linkcc = e.getText();
			System.out.println(linkcc);
		}
		//get the text list for header area
		List<String> header = ele.getElementsTextList(headerlist);
		System.out.println(header);
		System.out.println(ele.getCount(headerlist));

	
		
		
		
		
		
		
		
	}

}
