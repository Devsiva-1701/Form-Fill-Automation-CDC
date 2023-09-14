package Automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadExcelData {
    XSSFWorkbook workbook;
	XSSFSheet sheet;

	public  void ReadData() throws FileNotFoundException{
		String workbookPath = "D:\\form_data.xlsx";
		FileInputStream fis = new FileInputStream(workbookPath);
		try{
			 workbook = new XSSFWorkbook(fis);
			 sheet = workbook.getSheet("Form Data");
			
		}catch(Exception e){
			System.out.println(e);
		}
		
	}

	public String returnData(int cell, int row){
		String value = sheet.getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
}
