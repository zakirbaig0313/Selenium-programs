package zakirbaigselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home_page_1 {
	public static WebDriver driver;

	public void lunch() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/login/");
	}

	public void close() {
		driver.close();
	}

	public void email(String email) {

		WebElement email1 = driver.findElement(By.id("email"));
		email1.sendKeys(email);
	}

	public void pass(String pass) {

		WebElement pass1 = driver.findElement(By.id("pass"));
		pass1.sendKeys(pass);
	}

	public void cclick() {
		WebElement clickk = driver.findElement(By.id("loginbutton"));
		clickk.click();
	}

}
