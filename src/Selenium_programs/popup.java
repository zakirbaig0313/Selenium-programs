package Selenium_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://webdriveruniversity.com/Popup-Alerts/index.html");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("popup-alerts")).click();
		
		driver.findElement(By.id("button4")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(5000);
		
		
		driver.switchTo().alert().dismiss();
		//driver.switchTo().alert().accept();

	}

}
