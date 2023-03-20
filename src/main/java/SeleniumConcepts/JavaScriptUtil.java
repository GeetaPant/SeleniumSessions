package SeleniumConcepts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {

private WebDriver driver;

public JavaScriptUtil(WebDriver driver) {
	this.driver =driver;
}
public String getTitleByJS() {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	return js.executeScript("return document.title").toString();
	
}
public void getJSAlert(String message) {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("alert(' " + message +"')");
}
	public void refreshBrowserByJS() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("history.go(0);");
}
	public void drawBorder(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguements[0].style.border='3px solid red'", element);
}
	public void scrollIntoView(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguements[0].scrollIntoView(true);",element);
	}
	public void clickElementByJS(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguements[0].click;",element);
	}
	}