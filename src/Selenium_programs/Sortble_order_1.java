package Selenium_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Sortble_order_1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.globalsqa.com/demo-site/sorting/#Grid%20Sorting");
		//driver.findElement(By.xpath(""));
		driver.findElement(By.xpath("//*[@id=\"post-2675\"]/div[2]/div/div/div[1]/div/a")).click();
		Actions act = new Actions(driver);
		
		
		WebElement order = driver.findElement(By.xpath("//*[@id=\"Grid Sorting\"]"));
		
		act.moveToElement(order).click().build().perform();
		for(int i=1; i<13; i++)
		{
		WebElement select =driver.findElement(By.xpath("//*[@id=\"sortable\"]/li["+i+"]"));
		
		select.getText();
		System.out.println(select.getText());
		
		//for()
		
		
		}
		}

}
