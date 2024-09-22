package readAndwrteDataInExcelFile;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readDataInExcel {

	public static void main(String[] args) throws IOException {
	//Reading Excel File
FileInputStream File =new FileInputStream(System.getProperty("user.dir")+"//testdata//testdata.xlsx");
//get workbook
 XSSFWorkbook wb=new XSSFWorkbook(File);
 //get sheet
XSSFSheet sheet = wb.getSheet("Sheet2");
//total no. of rows
int Trow = sheet.getLastRowNum();
//total no. of columns
int Tcol = sheet.getRow(1).getLastCellNum();
//Read data
for (int r = 0; r <Trow; r++) {
	
	XSSFRow row = sheet.getRow(r);
	
	for (int c = 0; c <Tcol; c++) {
		XSSFCell cell = row.getCell(c);
		System.out.print(cell+"   ");
	}
	System.out.println();
}

wb.close();
File.close();
			
	}

}
