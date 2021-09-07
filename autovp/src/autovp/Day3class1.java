package autovp;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Day3class1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.manage().window().maximize();
		browser.get("http://www.amazon.in/");
		//int i=browser.findElements(By.xpath( "//*[@type='submit']")).size();
		//System.out.print(i);
		
		 Actions ac=new Actions(browser);
		 ac.moveToElement(browser.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		 Thread.sleep(5000);
		 //browser.findElement(By.xpath("//span[text()='Sign in']")).click();
		 browser.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span")).click();
		 Thread.sleep(5000);
		    
		        String title=browser.getTitle();
		        if(title.equals("Amazon Sign In"));
		        System.out.println("pass");
		        browser.close();
		        
	}

}
