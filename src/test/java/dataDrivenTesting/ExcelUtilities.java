package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities {

	
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static CellStyle style;
	
	public static int getRowCount(String xlfileloc, String xlsheetname) throws IOException
	{   
		fi=new FileInputStream(xlfileloc);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheetname);
	   int RowCount = ws.getLastRowNum();
	   wb.close();
	   fi.close();
		return RowCount;
		
	}
	
	public static int getCellCount(String xlfileloc, String xlsheetname,int rownum) throws IOException
	{
		fi=new FileInputStream(xlfileloc);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheetname);
		row=ws.getRow(rownum);
		short CellCount = row.getLastCellNum();
		wb.close();
		fi.close();
		
		return CellCount;	
	}
	
	public static String getData(String xlfileloc, String xlsheetname,int rownum, int colnum) throws IOException
	{
		fi=new FileInputStream(xlfileloc);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheetname);
		row=ws.getRow(rownum);
		cell=row.getCell(colnum);
		
	String data;
	try {
		//data=cell.toString();
		DataFormatter formatter=new DataFormatter();
		data=formatter.formatCellValue(cell);
		return data;	    }
	catch (Exception e) {
		       data="";
	                   }
		
	wb.close();
	fi.close();
	return data;
		
	}
	
	public static void setCellData(String xlfileloc, String xlsheetname,int rownum, int colnum,String data) throws IOException
	{
		fi=new FileInputStream(xlfileloc);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheetname);
		row=ws.getRow(rownum);
		cell=row.getCell(colnum);
		System.out.println(row);
		System.out.println(colnum);
		System.out.println(cell);
		cell.setCellValue(data);
		fo= new FileOutputStream(xlfileloc);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
		
	}
	
	public static void fillGreenColour(String xlfileloc, String xlsheetname,int rownum, int colnum) throws IOException
	{
		fi=new FileInputStream(xlfileloc);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheetname);
		row=ws.getRow(rownum);
		cell=row.getCell(colnum);
		
		style=wb.createCellStyle();
		
		style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		cell.setCellStyle(style);
		fo=new FileOutputStream(xlfileloc);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
		
	}
	
	public static void fillRedColour(String xlfileloc, String xlsheetname,int rownum, int colnum) throws IOException
	{
		fi=new FileInputStream(xlfileloc);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheetname);
		row=ws.getRow(rownum);
		cell=row.getCell(colnum);
		
		style=wb.createCellStyle();
		
		style.setFillForegroundColor(IndexedColors.RED.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		fo=new FileOutputStream(xlfileloc);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
		
	}
	
	
	
}
