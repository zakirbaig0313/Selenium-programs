package Selenium_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Own_Xpath_1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
		
		driver.findElement(By.xpath("//input[@name = 'firstName']")).sendKeys("zakir");
		
		//first we can find table (control + f ) click the inspect
		//  any xapth write in start with "//" ---> //input[@name = 'firstname'] is link
		// 
		//   there are more methods
		//  1 -- any text to find the element  "login with google"
		//      //button[text() = 'login with google']
		
		//  2 -- so many text that time we wil use this method 2,3 letters using  "login with google"
		       //buton[contains(text(),'goo')]
		
		//  3 -- this method is end text to find element  "login with google"
		
		      //button[ends-with(text(),'google')]
		      //button[starts-with(text(),'login')]
		
		// 4 -- this link find the uper element or lower element to find element
		
		     //input[@id = 'login']/preceding-sibiling::button
			 //input[@id = 'login']/following-sibiling::button
		     //input[@id = 'login']/parent::form
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
	
	

}
