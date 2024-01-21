package Selenium_programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdown_list {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://elementalselenium.com/");
		
		driver.manage().window().maximize();
		
		WebElement option = driver.findElement(By.name("fields[programming_language]"));
		
		Select se = new Select(option);
		
		//se.selectByIndex(3);
		
		List<WebElement> test=se.getOptions();
		
		List orgtemp = new ArrayList();
		List duptemp = new ArrayList();
		
		/*for(int i=0;i<test.size();i++)
		{
			System.out.println(test.get(i).getText());
			orgtemp.add(test.get(i).getText());
			duptemp.add(test.get(i).getText());
		}*/
		
		for(WebElement e : test)
		{
			System.out.println(e.getText());
			orgtemp.add(e.getText());
			
			duptemp.add(e.getText());
		}
		
		System.out.println("before sorted list of orgtemp : "+orgtemp);
		System.out.println("before sorted list of duptemp : "+duptemp);
		
		Collections.sort(duptemp);
		
		System.out.println("After sorted list of orgtemp : "+orgtemp);
		System.out.println("After sorted list of duptemp : "+duptemp);
		
		if(duptemp == orgtemp)
		{
			System.out.println("it is sorted order");
		}
		else
		{
			System.out.println("it is not sorted order");
		}
	//	System.out.println(list.);

	}

}
