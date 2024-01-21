package Selenium_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Date_picker_3 {

	public static void main(String[] args) {
		
		String day = "2";
		String month = "jan";
		
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.abhibus.com/bus-ticket-booking?msclkid=0c2cebfd1aba1773a3008f5ae7b376b8&utm_source=bing&utm_medium=cpc&utm_campaign=Generic_KWs_AP_TS_KA_TN&utm_term=bus%20booking%20online&utm_content=Generic-Travel-Search");
		
		System.out.println("hi");
		
		driver.findElement(By.name("journey_date")).click();
		for(int i=1; i<2; i++);
		{
		WebElement leftmonth =driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/div/span[1]"));
		String lmonth = leftmonth.getText();
		WebElement rightmonth = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/div/span[1]"));
		String rmonth = rightmonth.getText();
		if(lmonth.equalsIgnoreCase(month))
		{
			WebElement lday = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[3]/td[4]/a"));
			String ldays = lday.getText();
			if(ldays.equalsIgnoreCase(day))
			{
			System.out.println(ldays);
			}
		}
		if(rmonth.equalsIgnoreCase(month))
		{
			WebElement rday = driver.findElement(By.tagName("a"));
			String rdays = rday.getText();
		}
		}
	}

}
