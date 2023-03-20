package SeleniumConcepts;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownConcept 
{
static WebDriver driver;

	public static void main(String[] args)
	{
		driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement country=driver.findElement(By.tagName("select"));
		Select dp = new Select(country);
		//dp.selectByIndex(6);
		//dp.selectByValue("ALB");
	//	dp.selectByVisibleText("India");
		
		List<WebElement> countrycount = dp.getOptions();
		System.out.println(countrycount.size());
		
//		List<String> expList = Arrays.asList("India","Canda","Aruba");
		for(WebElement e:countrycount)
		{
		String text = e.getText();
		System.out.println(text);
//		if(countrycount.containsAll(expList))
//		{
//			System.out.println("Test Pass");
//		}
		if(text.equals("Australia"))
		
		{
			e.click();
		break;
	}
		
		}
	}

}
