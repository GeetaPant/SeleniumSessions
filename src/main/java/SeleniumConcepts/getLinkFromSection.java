package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLinkFromSection {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://chercher.tech/");
		By testingCol = By.xpath("(//ul[@class ='plan-features'])[1]/li");
		By devCol= By.xpath("(//ul[@class ='plan-features'])[2]/li");
		By certificateCol= By.xpath("(//ul[@class ='plan-features'])[3]/li");
		By certificateCol2 = By.xpath("(//ul[@class ='plan-features'])[4]/li");
		By cert3 = By.xpath("(//ul[@class ='plan-features'])[5]/li");
		By forum = By.xpath("(//ul[@class ='plan-features'])[6]/li");
		By git = By.xpath("(//ul[@class ='plan-features'])[7]/li");
		By quiz = By.xpath("(//ul[@class ='plan-features'])[8]/li");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		
		List<String> testList = eleUtil.getElementsTextList(testingCol);
		int testCount = eleUtil.getCount(testingCol);
		System.out.println("Links under Testing: "+ testList);
		System.out.println("--------------------------------------");
		
		List<String> devList = eleUtil.getElementsTextList(devCol);
		int devCount = eleUtil.getCount(devCol);
		System.out.println("Links under Development: "+ devList);
		System.out.println("--------------------------------------");
		
		List<String> certificateList = eleUtil.getElementsTextList(certificateCol);
		int certCount = eleUtil.getCount(certificateCol);
		System.out.println("Links under Certification A-C:  "+ certificateList);
		System.out.println("--------------------------------------");
		
		List<String> certificateList2 = eleUtil.getElementsTextList(certificateCol2);
		int certCount2 = eleUtil.getCount(certificateCol2);
		System.out.println("Links under Certification D-O: "+ certificateList2);
		System.out.println("--------------------------------------");
		
		List<String> cert3list = eleUtil.getElementsTextList(cert3);
		int cert3count = eleUtil.getCount(cert3);
		System.out.println("Links under Certification J-Z: "+ cert3list);
		System.out.println("--------------------------------------");
		
		List<String> forumList = eleUtil.getElementsTextList(forum);
		int forumCount = eleUtil.getCount(forum);
		System.out.println("Links under Forum: "+ forumList);
		System.out.println("--------------------------------------");
		
		List<String> gitList = eleUtil.getElementsTextList(git);
		int gitCount = eleUtil.getCount(git);
		System.out.println("Links under Git: "+ gitList);
		System.out.println("--------------------------------------");
		List<String> quizList = eleUtil.getElementsTextList(quiz);
		int quizCount = eleUtil.getCount(quiz);
		System.out.println("Links under Quiz: "+ quizList);
		System.out.println("--------------------------------------");
		
		
		
		
		
//		List<WebElement> h4testing = driver.findElements(testingCol);
//		System.out.println("Links count under heading Testing: "+ h4testing.size());
//		List<String> totalList = new ArrayList<String>();
//		for(WebElement e: h4testing)
//		{
//			String text = e.getText();
//			totalList.add(text);
//		}
//		System.out.println("All the links under Testing: "+ totalList);
//		
	}

}
