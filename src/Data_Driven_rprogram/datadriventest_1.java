 package Data_Driven_rprogram;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class datadriventest_1 {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "E:E:\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india /fixed-deposit-calculator-SBI-BSB001.html");

		driver.manage().window().maximize();
		
		driver.findElement(By.id("wzrk-cancel")).click();
		
		FileInputStream file = new FileInputStream("E:\\drivers\\zakir.xlsx");
		
		XSSFWorkbook book = new XSSFWorkbook(file);
		
		XSSFSheet sheet = book.getSheet("zakir1");
		
		int rows = sheet.getLastRowNum();
		
		System.out.println(rows);
		
		for(int i=1; i<=rows;i++)
		{
			
			int principle = (int) sheet.getRow(i).getCell(0).getNumericCellValue();
			int ROI = (int) sheet.getRow(i).getCell(1).getNumericCellValue();
			int period = (int) sheet.getRow(i).getCell(2).getNumericCellValue();
			String time = sheet.getRow(i).getCell(3).toString();
			String frequency = sheet.getRow(i).getCell(4).toString();
			Double interest_earned = (Double) sheet.getRow(i).getCell(5).getNumericCellValue();
		
			//System.out.println(interest_earned);
			driver.findElement(By.id("principal")).sendKeys(String.valueOf(principle));
			driver.findElement(By.id("interest")).sendKeys(String.valueOf(ROI));
			driver.findElement(By.id("tenure")).sendKeys(String.valueOf(period));
			
			WebElement type = driver.findElement(By.id("tenurePeriod"));
			
			Select se = new Select(type);
			
			se.selectByVisibleText(time);
		
			WebElement type1 = driver.findElement(By.id("frequency"));
			
			Select se1 = new Select(type1);
	
			se1.selectByVisibleText(frequency);
			
			//driver.findElement(By.id("e")).sendKeys(String.valueOf(interest_earned));
			
			driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[1]/img")).click();
			
			String realintrest1 =  driver.findElement(By.id("resp_matval")).getText();   
			
			System.out.println("1 : "+interest_earned);
			System.out.println("2 : "+realintrest1);
			
			if(Double.parseDouble(realintrest1) == interest_earned)
			{
				System.out.println("it is test pass");
			}
			else
			{
				System.out.println("it is test not pass");
			}
			
			
			driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[2]/img")).click();
				
		}
		   
		book.close();

	}

}
