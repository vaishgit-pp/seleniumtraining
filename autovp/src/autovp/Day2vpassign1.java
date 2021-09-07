package autovp;
import java.io.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2vpassign1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="selenium";
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.get("http://www.Google.com");
	long start = System.currentTimeMillis();
	browser.findElement(By.name("q")).sendKeys(text + Keys.ENTER);
	long end = System.currentTimeMillis();
	
	String output1 =browser.findElement(By.xpath("//input[@value='selenium'and @aria-label='Search']")).getAttribute("value");;
	System.out.println(output1);
	 if(text.equals(output1)) {
    	 System.out.println(" I/O success!!");
     }
     else {
    	 System.out.println("I/O unsuccessfull!!");
     }
		
	 //long end = System.currentTimeMillis();
     System.out.println("Time taken to search " +(end - start) + "ms");
		//browser.close();
		
	}

}
