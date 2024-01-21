package Data_Driven_rprogram;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class flight_test {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		
		FileInputStream file = new FileInputStream("E:\\drivers\\book1.xlsx");
		
		XSSFWorkbook book = new XSSFWorkbook(file);
		
		XSSFSheet sheet = book.getSheet("flight-registertrip");
		
		int rowsize = sheet.getLastRowNum();
		System.out.println(rowsize);
		
		int colmsize = sheet.getRow(0).getLastCellNum();
		System.out.println(colmsize);
		
		for(int i=1; i<=rowsize; i++)
		{
			XSSFRow row = sheet.getRow(i);
			
			String trip = row.getCell(0).getStringCellValue();
			int no_psg = (int) row.getCell(1).getNumericCellValue();
			String depature = row.getCell(2).getStringCellValue();
			String month = row.getCell(3).getStringCellValue();
			int day = (int) row.getCell(4).getNumericCellValue();
			String arriving = row.getCell(5).getStringCellValue();
			String r_month = row.getCell(6).getStringCellValue();
			int r_day = (int) row.getCell(7).getNumericCellValue();
			String servise_class = row.getCell(8).getStringCellValue();
			String airline = row.getCell(9).getStringCellValue();
			
			
			//trip for round trip or one way trip
			if(trip.equalsIgnoreCase("Round Trip"))
			{
				driver.findElement(By.xpath("//input[@value = 'roundtrip']")).click();
				//System.out.println("hi");
			}
			else
			{
				driver.findElement(By.xpath("//input[@value = 'oneway']")).click();
				//System.out.println("hlo");
			}
			
			//passenger
			//System.out.println("hlo");
			
			WebElement element = driver.findElement(By.name("passCount"));
		//	System.out.println(element);
			Select passger = new Select(element);
			passger.selectByVisibleText(String.valueOf(no_psg));
			
			//depature
			WebElement element1 = driver.findElement(By.name("fromPort"));
			Select depature1 = new Select(element1);
			depature1.selectByVisibleText(String.valueOf(depature));
			
			//month
			WebElement element2 = driver.findElement(By.name("fromMonth"));
			Select month2 = new Select(element2);
			month2.selectByVisibleText(String.valueOf(month));
			
			//day
			WebElement element3 = driver.findElement(By.name("fromDay"));
			Select day2 = new Select(element3);
			day2.selectByVisibleText(String.valueOf(day));
			
			//Arriving 
			WebElement element4 = driver.findElement(By.name("toPort"));
			Select arriving4 = new Select(element4);
			arriving4.selectByVisibleText(String.valueOf(arriving));
			
			//return month
			WebElement element5 = driver.findElement(By.name("toMonth"));
			Select month5 = new Select(element5);
			month5.selectByVisibleText(String.valueOf(r_month));
			
			//return day
			WebElement element6 = driver.findElement(By.name("toDay"));
			Select month6 = new Select(element6);
			month6.selectByVisibleText(String.valueOf(r_day));
			
			//servise class
			if(servise_class.equalsIgnoreCase("Economy class"))
			{
				driver.findElement(By.xpath("//input[@value = 'Coach']")).click();
			}
			if(servise_class.equalsIgnoreCase("Business class"))
			{
				driver.findElement(By.xpath("//input[@value = 'Business']")).click();
			}
			else
			{
				driver.findElement(By.xpath("//input[@value = 'First']")).click();
			}
			
			//Airline
			//return day
			WebElement element7 = driver.findElement(By.name("airline"));
			Select airline7 = new Select(element7);
			airline7.selectByVisibleText(String.valueOf(airline));
			
			//submit
			driver.findElement(By.name("findFlights")).click();
			
			//flight booking button
			driver.findElement(By.linkText("Flights")).click();
			
			System.out.println("it is sucssfully submit");
			book.close();
			driver.close();
		}

	}

}
