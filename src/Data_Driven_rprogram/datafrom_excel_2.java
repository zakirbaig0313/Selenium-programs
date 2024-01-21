package Data_Driven_rprogram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datafrom_excel_2 {

	public static void main(String[] args) throws IOException {
		
		           //step 1 - connect the file location
		FileInputStream file = new FileInputStream("E:\\drivers\\book1.xlsx");
		
		          //step 2 - connect to file to workbook
		XSSFWorkbook book = new XSSFWorkbook(file);
		
		        // step 3 - connect to workbook to sheet  it is 2 methods 1-sheet name,2- sheet index
	//	XSSFSheet sheet = book.getSheet("Sheet3");  //method 1 sheet name
		XSSFSheet sheet = book.getSheetAt(2);       //method 2 sheet index
		
		      // step 4 - find the rows
		int rowscount = sheet.getLastRowNum();
		
		     // step 5 - find the coloum

		int colcount = sheet.getRow(0).getLastCellNum();
		
		     // print the all excel values by using nasted loop
		for(int i=0; i<rowscount;i++)
		{
			XSSFRow currentrow = sheet.getRow(i);
			for(int j=0; j<colcount;j++)
			{
				int value = (int) currentrow.getCell(j).getNumericCellValue();
				System.out.print(value+"\t");
			}
			System.out.println();
		}
		book.close();

	}

}
