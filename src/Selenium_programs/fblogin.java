package Selenium_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fblogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login");
		//driver.get("https://www.facebook.com/r.php?locale=en_GB");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("zakirbaig100@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("15e81a0313");
	//	driver.findElement(By.name("login")).click();
		
		//driver.switchTo().alert().dismiss();
		
//		driver.findElement(By.xpath("//*[@id=\"mount_0_0_od\"]/div/div[1]/div/div[2]/div[3]/div[1]/span/div/div[1]/div/svg/g/image")).click();
		
		//*[@id="mount_0_0_od"]/div/div[1]/div/div[2]/div[3]/div[1]/span/div/div[1]/div/svg/g/image
	}

}
