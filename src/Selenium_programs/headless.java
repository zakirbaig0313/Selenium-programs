package Selenium_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class headless {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions();
		//option.setHeadless(true);
		option.addArguments("--headless");
		WebDriver driver = new ChromeDriver(option);

		driver.get("https://www.facebook.com/login");
		
		System.out.println("welcome to headless");
	}

}
