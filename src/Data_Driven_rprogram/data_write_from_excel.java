  package Data_Driven_rprogram;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;


public class data_write_from_excel {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		FileOutputStream file = new FileOutputStream("E:\\drivers\\zakir2.xlsx");
		
		XSSFWorkbook book = new XSSFWorkbook();
		
		XSSFSheet sheet = book.createSheet("zakir");
		
		
		for(int i=0;i<1;i++)
		{
			XSSFRow column = sheet.createRow(i);
			for(int j=0;j<1;j++)
			{
				column.createCell(0).setCellValue("Name");
				column.createCell(1).setCellValue("Age");
				column.createCell(2).setCellValue("DOB");
				column.createCell(3).setCellValue("PHONE");
			}
		}
		
		for(int i=1;i<=2;i++)
		{
			XSSFRow row = sheet.createRow(i);
			for(int j=0;j<1;j++)
			{
				String name;
				String age;
				String dob;
				String phone;
				System.out.print("please enter the Name : ");
				row.createCell(0).setCellValue(name = sc.nextLine());
				System.out.print("please enter the Age : ");
				row.createCell(1).setCellValue(age = sc.nextLine());
				System.out.print("please enter the DOB : ");
				row.createCell(2).setCellValue(dob = sc.nextLine());
				System.out.print("please enter the Phone : ");
				row.createCell(3).setCellValue(phone = sc.nextLine());
			}
		}
		book.write(file);
		book.close();
		file.close();
		
		System.out.println("complete the writen in xl file");
	}

}
 