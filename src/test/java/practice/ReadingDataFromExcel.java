package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadingDataFromExcel {
FileInputStream file;
	
   @Test
	public void readData() throws IOException
	{
	   file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\function1.xlsx");
	  XSSFWorkbook workbook = new XSSFWorkbook(file);
	  XSSFSheet sheet = workbook.getSheet("sheet0");
	  int Trow = sheet.getLastRowNum();
	  int Tcol = sheet.getRow(1).getLastCellNum();
	  
	  for (int i =0; i <=Trow; i++) {
		XSSFRow row = sheet.getRow(i);
		
		for (int j = 0; j <Tcol; j++) {
			String cell = row.getCell(j).toString();
			System.out.print(cell+" ");
		}
		System.out.println();
	}
	  
	  workbook.close();
	  file.close();
	  
	  
	}
	
	
	
	
	
}
