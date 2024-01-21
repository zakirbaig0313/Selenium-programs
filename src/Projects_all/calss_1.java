package Projects_all;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class calss_1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.demo.guru99.com/V4/manager/addcustomerpage.php");
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement datePicker = driver.findElement(By.id("dob"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value', '2023-08-19')", datePicker);
		
		//act.click(element);
		
		System.out.println("ji");
	}

}
