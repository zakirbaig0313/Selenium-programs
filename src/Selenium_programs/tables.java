package Selenium_programs;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
public class tables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		
		option.setHeadless(true);
		
		WebDriver driver = new ChromeDriver(option);

		driver.get("http://the-internet.herokuapp.com/tables");
		
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.xpath("//*[@id=\"table1\"]/thead/tr"));
		
		//System.out.println(table.getText());
		
		WebElement table1 = driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr"));
		
		//Select tb = new Select(table1);
		////*[@id="table1"]/tbody/tr[1]/td[1]
		
		List <WebElement> rows =table1.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr"));
		
		System.out.println("table of total rows :"+rows.size());
		
		List<WebElement> columns = table1.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr[1]/td"));
		
		System.out.println("table of total columns :"+columns.size());
		//System.out.println(columns.get(0).getText());
		System.out.println(table.getText());
		
		for(int i=1;i<=rows.size();i++)
		{
			for(int j=1;j<=columns.size();j++)
			{
				
				
				System.out.print(table1.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr["+i+"]/td["+j+"]")).getText()+"\t\t");
			}
			
			System.out.println();
		}
		
		
	/*	for(int i=0;i<columns.size();i++)
		{
			
				System.out.println(rows.get(i).getText());
			
		}*/
		
	}

}
