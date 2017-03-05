package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
 
	  XSSFWorkbook wb;
	  XSSFSheet sheet;
	  
	public ExcelDataProvider() {
		File src = new File("C:\\Users\\smriti\\workspace\\ETLProject\\ApplicationTestData");
		 try {
			FileInputStream fil = new FileInputStream(src);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception is:"+e.getMessage());
		}
	}
	
	public String getData(int sheetno, int rowno, int column ){
		sheet = wb.getSheetAt(sheetno);
		String Data = sheet.getRow(rowno).getCell(column).getStringCellValue();
		return Data;
	
	}
	
	public String getData(String sheetname, int rowno, int column ){
		sheet = wb.getSheet(sheetname);
		String Data = sheet.getRow(rowno).getCell(column).getStringCellValue();
		return Data;
	
	}

}
