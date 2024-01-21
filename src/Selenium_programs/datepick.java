package Selenium_programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepick {

	public static void main(String[] args) throws Throwable {
		
System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.manage().window().maximize();
		
		//driver.switchTo().alert().dismiss();
		//driver.findElement(By.xpath("//*[@id=\"post-2661\"]/div[2]/div/div/div[1]/div/a")).click();
		
		System.out.println("hai");
		driver.findElement(By.id("ui-datepicker-div")).click();
		
		
		//List<WebElement> year = driver.findElements(By.xpath("/html/body/div[2]/div[1]/table/thead/tr/th"));
		
		//System.out.println(year.size());
		/*for(int i=1; i<20;i++)
		{
			String d_m = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div")).getText();
			if(d_m.equals("July 2023"))
			{
				driver.findElement(By.linkText("12")).click();
			}
		}
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[1]/th[2]")).click();
		
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/table/tbody/tr/td/span[11]")).click();
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[3]/td[6]")).click();
		
		*/
	}

}
