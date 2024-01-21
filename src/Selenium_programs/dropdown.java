package Selenium_programs;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		ChromeOptions option = new ChromeOptions();
		
		//option.setHeadless(true);
		//option.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB");
		
		driver.manage().window().maximize();
		
		Select days = new Select(driver.findElement(By.id("day")));
		
		days.selectByIndex(7);
		
		Select months = new Select(driver.findElement(By.id("month")));
		
		months.selectByIndex(5);
		
		Select years = new Select(driver.findElement(By.id("year")));
		
		years.selectByValue("1998");
		
		List <WebElement> list1 = days.getOptions();
		
		System.out.println("number of days : "+list1.size());
		
		for(int i=0;i<list1.size();i++)
		{
			System.out.print(list1.get(i).getText());
		}
		
		System.out.println();
		
		List <WebElement> list2 = months.getOptions();
		
		System.out.println("number of months : "+list2.size());
		
		for(int i=0;i<list2.size();i++)
		{
			System.out.print(list2.get(i).getText());
		}
		
		System.out.println();
		List <WebElement> list3 = years.getOptions();
		
		System.out.println("number of years : "+list3.size());
		
		for(int i=0;i<list3.size();i++)
		{
			System.out.print(list3.get(i).getText());
		}
		
		
		}

}
