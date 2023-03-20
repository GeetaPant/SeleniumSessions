package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class staticWebTableHandle {

	static WebDriver driver;
	
	public static void main(String[] args) {
		driver = new ChromeDriver();
	driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
	
	String beforexpath = "//table[@class ='tsc_table_s13']/tbody/tr[";
	String afterxpath = "]/td[1]";

	String bxpath = "//table[@class ='tsc_table_s13']/tbody/tr[";
	String axpath = "]/td[2]";
	
	
	for(int row = 1; row <5; row ++) {
		String xpath = beforexpath +row + afterxpath;
		String rowVal = driver.findElement(By.xpath(xpath)).getText();
		System.out.println(rowVal);
		System.out.println("-----------------------");
	}
	for(int row2 = 1; row2 <5; row2++) {
		String xpath1 = bxpath +row2+ axpath;
		String rowVal2 = driver.findElement(By.xpath(xpath1)).getText();
		System.out.println(rowVal2);
	}
	List<WebElement> tableHeader = driver.findElements(By.xpath("//table[@class ='tsc_table_s13']//thead//th"));
	  System.out.println(tableHeader.size());
	  for(WebElement e: tableHeader) {
		  String text = e.getText();
		  System.out.println(text);
	  }
	}
}
 