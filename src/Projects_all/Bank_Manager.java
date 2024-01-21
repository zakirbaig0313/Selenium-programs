package Projects_all;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Bank_Manager {

	void AddCustomer() throws IOException{
		
		FileInputStream file = new FileInputStream("E:/drivers/zakir.xlsx");
		
		XSSFWorkbook book = new XSSFWorkbook(file);
		
		XSSFSheet sheet = book.getSheet("banking_details");
		
		int rowsize = sheet.getLastRowNum();
		System.out.println(rowsize);
		
		int colmsize = sheet.getRow(0).getLastCellNum();
		System.out.println(colmsize);
		book.close();
		
		for(int i=1; i<=rowsize; i++)
		{
			XSSFRow row =sheet.getRow(i);
			
			    String first_name = row.getCell(0).getStringCellValue();
			    
				System.out.print(first_name+" ");
				String Last_Name = row.getCell(1).getStringCellValue();
				System.out.print(Last_Name+" ");
				int Post_Code = (int) row.getCell(2).getNumericCellValue();
				System.out.print(Post_Code);
				
				System.out.println();
									
		}
		
	}
	
	public void Web() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//	NgWebDriver driver1 = new NgWebDriver(driver);
		
		//System.setProperty("webdriver.Firefox.Mariette", "E:\\\\drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		Actions act = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//button[text()='Customer Login']"));
		act.click(element).build().perform();
	}
	
	public static void main(String[] args) throws IOException {
		
		Bank_Manager option = new Bank_Manager();
		
		option.Web();
		//option.AddCustomer();

	}

}
