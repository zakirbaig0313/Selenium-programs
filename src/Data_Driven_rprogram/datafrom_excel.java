package Data_Driven_rprogram;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

//import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datafrom_excel {

	public static void main(String[] args) throws IOException {
		

		FileInputStream file = new FileInputStream("E:\\drivers\\book1.xlsx");
		
		XSSFWorkbook book = new XSSFWorkbook(file);
		
		XSSFSheet sheet = book.getSheet("Sheet1");  // providing a sheet name
	//	XSSFSheet sheet = book.getSheetAt(0);       // providing a sheet index value
		
		int rows_cont = sheet.getLastRowNum();  // return the rows count 
		
		System.out.println(rows_cont);
		
		int col_cont = sheet.getRow(0).getLastCellNum();  // return the columns count
		
		System.out.println(col_cont);
		
		for(int i=0; i<rows_cont+1;i++)
		{
			XSSFRow curtrow = sheet.getRow(i);
			for(int j=0; j<col_cont;j++)
			{
				String value =curtrow.getCell(j).toString();
				
				System.out.print(value+"\t");
			}
			System.out.println();
		}
		
		book.close();
	}

}
