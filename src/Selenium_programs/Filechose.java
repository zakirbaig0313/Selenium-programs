package Selenium_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filechose {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/File-Upload/index.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("myFile")).sendKeys("E:\\drivers\\book1.xlsx");
		
		Thread.sleep(10000);
		
		
		driver.findElement(By.id("submit-button")).click();
		
		Thread.sleep(10000);
		
		driver.switchTo().alert().accept();
		
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

}
