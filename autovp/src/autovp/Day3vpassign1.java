package autovp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3vpassign1 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.manage().window().maximize();
		browser.get("http://www.google.com/");
		java.util.List<WebElement> links =browser.findElements(By.tagName("a"));
		
	      System.out.println("Number of Links in the Page is " + links.size());
	      
	      for (int i = 1; i<=links.size(); i = i+1) {
	         System.out.println("Name of Link# " + i + links.get(i).getText());
	      }
	      browser.quit();
	}
}
	      


