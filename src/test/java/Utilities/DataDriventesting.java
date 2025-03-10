package Utilities;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class DataDriventesting {
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow rw;
	public static XSSFCell cl;
	public static FileInputStream fn;
	
	
	public static int getRow(String filename, String sheetname) throws Exception
	 {
		 fn= new FileInputStream(filename);
			wb= new XSSFWorkbook(fn);
			ws=wb.getSheet(sheetname);
			int totalRow=ws.getLastRowNum()+1;
			wb.close();
			return totalRow;
		 
			
		}
	 public static int getCol(String filename, String sheetname) throws Exception
	 {
		 fn= new FileInputStream(filename);
			wb= new XSSFWorkbook(fn);
			ws=wb.getSheet(sheetname);
			int totalRow=ws.getRow(0).getLastCellNum();			
			wb.close();
			return totalRow;

		 
			
		}
	 
	 public static String getCellValue(String filename,String sheetname,int r,int c) throws Exception
		{
			
			fn= new FileInputStream(filename);
			wb= new XSSFWorkbook(fn);
			ws=wb.getSheet(sheetname);
			cl=wb.getSheet(sheetname).getRow(r).getCell(c);
		//	wb.close();
			return cl.getStringCellValue();
	}

}
