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

public class data_register_1 {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		FileInputStream file = new FileInputStream("E:\\drivers\\book1.xlsx");
		
		XSSFWorkbook book = new XSSFWorkbook(file);
		
		XSSFSheet sheet = book.getSheet("register");
		
		int rowsize = sheet.getLastRowNum();
		System.out.println(rowsize);
		
		
		int colmsize = sheet.getRow(0).getLastCellNum();
		System.out.println(colmsize);
		
		for(int i=1; i<=rowsize; i++)
		{
			XSSFRow row = sheet.getRow(i);
			String fname = row.getCell(0).getStringCellValue();
			String lname = row.getCell(1).getStringCellValue();
			int phone1 = (int) row.getCell(2).getNumericCellValue();
			String email = row.getCell(3).getStringCellValue();
			String address = row.getCell(4).getStringCellValue();
			String city = row.getCell(5).getStringCellValue();
			String state = row.getCell(6).getStringCellValue();
			int code = (int) row.getCell(7).getNumericCellValue();
			String country = row.getCell(8).getStringCellValue();
			String user_name = row.getCell(9).getStringCellValue();
			String passward = row.getCell(10).getStringCellValue();
			String con_psd = row.getCell(11).getStringCellValue();
			
			driver.findElement(By.name("firstName")).sendKeys(fname);
			driver.findElement(By.name("lastName")).sendKeys(lname);
			driver.findElement(By.name("phone")).sendKeys(String.valueOf(phone1));
			driver.findElement(By.name("userName")).sendKeys(email);
			driver.findElement(By.name("address1")).sendKeys(address);
			driver.findElement(By.name("city")).sendKeys(city);
			driver.findElement(By.name("state")).sendKeys(state);
			driver.findElement(By.name("postalCode")).sendKeys(String.valueOf(code));
			
			WebElement op = driver.findElement(By.name("country"));
			Select list = new Select(op);
			list.selectByVisibleText(country);
			
			driver.findElement(By.name("email")).sendKeys(user_name);
			driver.findElement(By.name("password")).sendKeys(passward);
			driver.findElement(By.name("confirmPassword")).sendKeys(con_psd);
			
			driver.findElement(By.name("submit")).click();
			
			driver.findElement(By.linkText("REGISTER")).click();
			
			System.out.println("it is sucessfully submit");
		}
		
		book.close();
	}

}
