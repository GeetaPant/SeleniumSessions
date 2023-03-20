package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class RegisterPageTest {

	public static void main(String[] args) {
	browserUtil brutil = new browserUtil();
	WebDriver driver = brutil.initDriver("chrome");
	brutil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	String title = brutil.getTitle();
	System.out.println("The title of page is:"+ title);
	
	By reg = By.linkText("Register");
	
	ElementUtil ele = new ElementUtil(driver);
	ele.doClick(reg);
	By firstname =By.id("input-firstname");
	By lastname = By.xpath("//*[@id=\"input-lastname\"]");
	By email = By.cssSelector("#input-email");
	By tele = By.name("telephone");
	By pwd = By.xpath("//*[@id=\"input-password\"]");
	By cfmpwd = By.xpath("//*[@id=\"input-confirm\"]");
	By privacy = By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
	By continuebtn = By.cssSelector("#content > form > div > div > input.btn.btn-primary");
	By tagname = By.tagName("h1");
	
	ele.doSendKeys(firstname, "Geeta");
	ele.doSendKeys(lastname, "Pant");
	ele.doSendKeys(email, "test323273232@gmail.com");
	ele.doSendKeys(tele, "1234567890");
	ele.doSendKeys(pwd, "test@123");
	ele.doSendKeys(cfmpwd, "test@123");
	ele.doClick(privacy);
	ele.doClick(continuebtn);
	String tag = ele.getElementText(tagname);
	if(tag.contains("Your Account Has Been Created!"))
	{
		System.out.println("Account created successfully");
	}
	else
	{
		System.out.println("Account creation failed");;
	}
	}

}
