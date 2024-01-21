
package Selenium_programs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class dropdownlist_sorted_or_not {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		driver.manage().window().maximize();
		
		WebElement drop = driver.findElement(By.id("dropdowm-menu-1"));
		
		Select se = new Select(drop);
		
		List <WebElement> option = se.getOptions();
		List<String> orginallist = new ArrayList<String>();
		List<String> templist = new ArrayList<String>();
		
		for(WebElement e:option)
		{
			orginallist.add(e.getText());
			templist.add(e.getText());
		}
		
		System.out.println("before sorting : "+orginallist);
		System.out.println("beofre sorting : "+templist);
		
		Collections.sort(templist);
		
		System.out.println("after sorting : "+templist);
		
		if(templist == orginallist)
		{
			System.out.println("it sorted the list");
		}
		else
		{
			System.out.println("it is not sorted list");
		}

	}

}
