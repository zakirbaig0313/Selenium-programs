package Data_Driven_rprogram;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

//import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datafrom_excel_3 {

	public static void main(String[] args) throws IOException {
		

		FileInputStream file = new FileInputStream("E:\\drivers\\book1.xlsx");
		
		XSSFWorkbook book = new XSSFWorkbook(file);
		
		XSSFSheet sheet = book.getSheet("Sheet4");  // providing a sheet name
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
				if(j!=2 && j!=7)
				{
				String value =curtrow.getCell(j).toString();
				
				System.out.print(value+"\t");
				}
				
			}
			System.out.println();
		}
		//System.out.println("welome");
		System.out.println();
		for(int x=0; x<rows_cont+1;x++)
		{
			XSSFRow curtrows = sheet.getRow(x);
			for(int y=0; y<col_cont;y++)
			{
				if(y!=0 && y!=1 &&y!=3 && y!=4 && y!=5 && y!=6 && y!=8 && y!=9 && y!=10 && y!=11)
				{
				String value1 =curtrows.getCell(y).toString();
				
				System.out.print(value1+"\t");
				}
				
			}
			System.out.println();
		}
	//	System.out.println("loverbooo");
		

		book.close();
	}

}
