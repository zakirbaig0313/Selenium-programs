
package Selenium_programs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class dropdownlist_sorted_or_not_2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette", "E:\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions option1 = new ChromeOptions();
		option1.setHeadless(true);
		
		WebDriver driver = new ChromeDriver(option1);
		
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("dropdowm-menu-2"));
		
		Select se = new Select(element);
		
		List <WebElement> option = se.getOptions();
		
		List<String> orglist = new ArrayList<String>();
		List<String> templist = new ArrayList<String>();
		
		for(WebElement e : option)
		{
			orglist.add(e.getText());
			templist.add(e.getText());
		}
		
		System.out.println(orglist);
		System.out.println(templist);
		
		Collections.sort(templist);
		
		System.out.println(templist);
		
		if(templist == orglist)
		{
			System.out.println(" it is sorted ");
		}
		else
		{
			System.out.println("it is not sorted");
		}
		
	}

}
