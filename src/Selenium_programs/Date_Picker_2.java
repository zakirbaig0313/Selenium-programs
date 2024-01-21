package Selenium_programs;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class Date_Picker_2 {

	public static void main(String[] args) throws InterruptedException  {
		
		//it changes
		int year = 1998; 
		String months = "jun";
		String dayfix = "6";
		
		String month = null;
		String days = null;
		int stnd = 2023; //it is fixed
		
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://webdriveruniversity.com/Datepicker/index.html");
		
		
		
		WebElement click1 = driver.findElement(By.xpath("//*[@id=\"datepicker\"]/span/i"));
		
		click1.click();
		
		WebElement click2 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[1]/th[2]"));
		
		click2.click();
		
		if(year < stnd)
		{
			
			
			for(int i=0; i<30; i++)
			{
				WebElement click4 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/table/thead/tr/th[2]"));
				String postyear = click4.getText();
			if(postyear.equalsIgnoreCase(String.valueOf(year)))
			{
			
				for(int j=1; j<13; j++)
				{
				WebElement list = driver.findElement(By.xpath("/html/body/div[2]/div[2]/table/tbody/tr/td/span["+j+"]"));
				month = list.getText();
				
				if(month.equalsIgnoreCase(months))
				{
					list.click();
				
					for(int k=0;k<32;k++)
					{
						i++;
						j++;
					}
				}
				}
			}
			else
			{
				
				driver.findElement(By.xpath("/html/body/div[2]/div[2]/table/thead/tr/th[1]")).click();
				
			}
			}
		}
		else
		{
		for(int i=0; i<12; i++)
		{
			WebElement click3 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/table/thead/tr/th[2]"));
			String futyear = click3.getText();
			if(futyear.equalsIgnoreCase(String.valueOf(year)))
			{
			
				for(int j=1; j<13; j++)
				{
				WebElement list = driver.findElement(By.xpath("/html/body/div[2]/div[2]/table/tbody/tr/td/span["+j+"]"));
				month = list.getText();
				
				if(month.equalsIgnoreCase(months))
				{
					list.click();
				
					for(int k=0;k<13;k++)
					{
						i++;
						j++;
					}
				}
				}
			}
			else
			{
				
				driver.findElement(By.xpath("/html/body/div[2]/div[2]/table/thead/tr/th[3]")).click();
				
			}
		}
		}
		
		
		for(int i=1; i<=6; i++)
		{
			for(int j=1; j<=7; j++)
			{
			WebElement day = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr["+i+"]/td["+j+"]"));
			
			days = day.getText();
			
			if(days.equalsIgnoreCase(dayfix))
			{
				day.click();
				for(int l=0;l<15;l++)
				{
					j++;
					i++;
				}
			
				
			}
			
			}
			
		}
		System.out.println("days / month / year");
		System.out.print(days+" / "+month+" / "+year);
			
	}

}
