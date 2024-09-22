package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WrittingDatainExcel {

	FileInputStream fi;
	FileOutputStream fo;
	
	@Test
	public void writeData() throws IOException
	{
		fo=new FileOutputStream(System.getProperty("user.dir")+"//testdata//myfile1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet();
		
		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("Hello");
		row1.createCell(1).setCellValue("Good morning");
		row1.createCell(2).setCellValue("how are you");
		
		Scanner sc=new Scanner(System.in);
		//Using for loop
		for (int i =1; i <=3; i++) {
			XSSFRow currentrow = sheet.createRow(i);
			for (int j = 0; j <=2; j++) {
				System.out.println("enter a value");
				String value = sc.next();
				currentrow.createCell(j).setCellValue(value);
			}
		}
		
		
		workbook.write(fo);
		workbook.close();
		fo.close();
		
		
	}
	
	
	
}
