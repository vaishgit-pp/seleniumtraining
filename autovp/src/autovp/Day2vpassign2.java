package autovp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Day2vpassign2 {

	public static void main(String[] args)throws InterruptedException  {
		//declaring variables
		int f=1000;
		String foodie = Integer.toString(f);
		int c=500;
		String cloth = Integer.toString(c);
		int s=800;
		String shade = Integer.toString(s);
	    int sal=5000;
	    String pay = Integer.toString(sal);
	    int othr=200;
	    String oi = Integer.toString(othr);
	    
	    
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.get("http://www.youcandealwithit.com/borrowers/calculators-and-resources/calculators/budget-calculator.shtml");
		browser.findElement(By.id("food")).sendKeys(foodie);
		browser.findElement(By.id("clothing")).sendKeys(cloth);
		browser.findElement(By.id("shelter")).sendKeys(shade);
		browser.findElement(By.id("monthlyPay")).sendKeys(pay);
		browser.findElement(By.id("monthlyOther")).sendKeys(oi);
		Thread.sleep(5000);
		float vMExp= f+c+s;
		//boolean V1=Boolean.parseBoolean(vMExp);
		float vMInc= sal+othr;
		System.out.println(vMExp);
		System.out.println(vMInc);
		
		
		
		String myexp= browser.findElement(By.id("totalMonthlyExpenses")).getAttribute("value");
		float f1= Float.parseFloat(myexp);
		
		if (Float.compare(vMExp, f1) == 0) {
			 
            System.out.println("My expense is"+f1);
        }
        else if (Float.compare(vMExp, f1) < 0) {
 
            System.out.println("Match not found");
        }
	
		String myic= browser.findElement(By.id("totalMonthlyIncome")).getAttribute("value");
		float f2= Float.parseFloat(myic);
		if (Float.compare(vMInc, f2) == 0) {
			 
            System.out.println("My overall income is"+f2);
        }
        else if (Float.compare(vMInc, f2) < 0) {
 
            System.out.println("Match not found");
        }
		Thread.sleep(5000);
		browser.quit();
	}

}
	