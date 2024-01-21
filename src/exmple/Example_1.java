package exmple;
import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Example_1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
				"E:\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/login/");
	
	WebElement ls = driver.findElement(By.id("email_container"));
	ls.sendKeys("zakir");

	WebElement ls1 = driver.findElement(By.id("pass"));
	ls1.sendKeys("zakir@zakir");
	
	WebElement ls2 = driver.findElement(By.id("loginbutton"));
	ls2.click();
}
}
