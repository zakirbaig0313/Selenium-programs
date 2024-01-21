package Selenium_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class Practice_1 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://webdriveruniversity.com/Accordion/index.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("manual-testing-accordion")).click();
		
		String text = driver.findElement(By.id("manual-testing-description")).getText();
		
		System.out.println(text);
		Thread.sleep(10000);
		driver.findElement(By.id("manual-testing-accordion")).click();
		
		driver.close();
	}

}
