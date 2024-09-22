package readAndwrteDataInExcelFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeDataInExcel {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub

		FileOutputStream File=new FileOutputStream(System.getProperty("user.dir")+"//testdata//function1.xlsx");
		//create workbook
		XSSFWorkbook wb =new XSSFWorkbook();
		//create sheet
		XSSFSheet sheet = wb.createSheet();
		//add data in sheet
//		XSSFRow row1 = sheet.createRow(0);
//		row1.createCell(0).setCellValue("Hello");
//		row1.createCell(1).setCellValue("hoo");
//		row1.createCell(2).setCellValue("Hoii");
//		row1.createCell(3).setCellValue("Hoooo");
//		
//		XSSFRow row2 = sheet.createRow(1);
//		row2.createCell(0).setCellValue("ASSS");
//		row2.createCell(1).setCellValue("BSSS");
//		row2.createCell(2).setCellValue("CSSS");
//		row2.createCell(3).setCellValue("DSSS");
//		row2.createCell(4).setCellValue("ASSS");
//		//attach sheet to file
//		wb.write(File);
//		wb.close();
//		File.close();
//		System.out.println("done===");
		
		
		//using Loop 
		Scanner sc = new Scanner(System.in);
		
		for (int r = 0; r < 5; r++) {
			XSSFRow currentrow = sheet.createRow(r);
			for (int c = 0; c <4; c++) {
				System.out.println("Enter a value: ");
				String data = sc.next();
				currentrow.createCell(c).setCellValue(data);
			}
		}
		
		wb.write(File);
		wb.close();
	File.close();
		
		
			
		
	}

}
