package Data_Driven_rprogram;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datafrom_excel_1 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("E:\\drivers\\book1.xlsx");
		
		XSSFWorkbook book = new XSSFWorkbook(file);
		
		XSSFSheet sheet = book.getSheet("Sheet2"); // i am using name sheet not index value
		
		int rowcount = sheet.getLastRowNum();  //return the row count
		
		int colcount = sheet.getRow(0).getLastCellNum(); //return the column/cells
		
		System.out.println(rowcount);
		System.out.println(colcount);
		
		for(int i=0 ; i<rowcount+1;i++)
		{
			XSSFRow currntrow =sheet.getRow(i); //focus on current row
			for(int j=0;j<colcount; j++)
			{
				String value =currntrow.getCell(j).getStringCellValue();  //focus on current column
				System.out.print(value+"\t");
			}
			System.out.println();
		}
		book.close();
		
		

	}

}
