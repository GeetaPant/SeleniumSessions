package SeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaScriptExector {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.get("https://www.amazon.com/");
		//JavascriptExecutor js = (JavascriptExecutor)driver;
	//	String title = js.executeScript("return document.title").toString();
		JavaScriptUtil jsUtil =new JavaScriptUtil(driver);
		String title =jsUtil.getTitleByJS();
		System.out.println(title);
		
		jsUtil.getJSAlert("Hi This is my alert");
	}

}
