package SeleniumConcepts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cricInfoWebTable {
static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/australia-in-india-2022-23-1348637/india-vs-australia-4th-test-1348655/live-cricket-score");
		List<String> runs = getScoreCard("Virat Kohli");
		System.out.println(runs);
		List<String> run = getScoreCard("Ravindra Jadeja");
		System.out.println(run);
	}
	public static String getbatsmanName(String batsmaname) {
		return driver.findElement(By.xpath("//span[text() = '"+batsmaname+"']/ancestor::td/following-sibling::td//strong")).getText();
		}
	public static List<String> getScoreCard(String batsmaname) {
		List <WebElement> score = driver.findElements(By.xpath("//span[text() = '"+batsmaname+"']/ancestor::td/following-sibling::td"));
		List<String> scoreList = new ArrayList<String>();
		for(WebElement e: score ) {
			String text = e.getText();
			scoreList.add(text);
		}
		return scoreList;
	}
}


