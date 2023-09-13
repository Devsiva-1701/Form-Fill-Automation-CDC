package selenium;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataExcel {

	XSSFWorkbook workbook;
	XSSFSheet sheet;
	
	public ReadDataExcel( FileInputStream fis ) {
		
		
		try {
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheet("Sheet1");
		} catch (Exception e) {
			
			System.out.println( "Some Error Occured..." );
			System.out.println(e.getCause());
			
		}
		
	}
	
	
	public void writeData()
	{
		
		WriteDataExcel  wrt = new WriteDataExcel(workbook, sheet);
		wrt.write();
		
	}
	
	public void displayData()
	{
		
		try {
			Object value = sheet.getRow(1).getCell(3).getStringCellValue();
			System.out.println(value);
		} catch (Exception e) {
			System.out.println( "There is no Data in the specified column or row..." );
			System.out.println(e.getCause());
		}
		
		
	}
	
	
	

}
