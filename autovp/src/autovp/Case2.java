package autovp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.get("http://www.youcandealwithit.com/borrowers/calculators-and-resources/calculators/budget-calculator.shtml");
		browser.findElement(By.id("food")).sendKeys("1000");
		browser.findElement(By.id("clothing")).sendKeys("3000");
		browser.findElement(By.id("shelter")).sendKeys("5000");
		browser.findElement(By.id("monthlyPay")).sendKeys("30000");
		String myexp= browser.findElement(By.id("totalMonthlyExpenses")).getAttribute("value");
	System.out.print("My expense is" +myexp);
	}

}
