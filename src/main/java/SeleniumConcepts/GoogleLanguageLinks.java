package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguageLinks {
	static WebDriver driver;
	

	public static void main(String[] args) {
	
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		List<WebElement>langList = driver.findElements(By.xpath("//div[@id ='SIvCob']/a"));
		System.out.println(langList.size());
		for(WebElement e : langList)
		{
		String LangText = 	e.getText();
		System.out.println(LangText);
	//	if(LangText.equals("മലയാളം"));
//		{
//			e.click();
//			break;
//			// return the links of all language)
//			//create method to capture list of google footer link
//		}
//}
		}
		WebElement setting =driver.findElement(By.xpath("//div[contains(text(),'Setting') and @jsname ='LgbsSe']"));
		List<WebElement>footerlist =driver.findElements(By.xpath("//div[@class = 'KxwPGc SSwjIe' and @jscontroller = 'NzU6V']//a"));
		System.out.println("total footer count : "+ footerlist.size());
		String sets =setting.getText();
		System.out.println(sets);
		for(WebElement e: footerlist)
		{
			String footertext = e.getText();
			System.out.println(footertext);
		}
	
	}
}

