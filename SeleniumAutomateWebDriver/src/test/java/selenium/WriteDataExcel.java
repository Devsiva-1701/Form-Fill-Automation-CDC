package selenium;


import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class WriteDataExcel {

		public XSSFWorkbook workbook;
		XSSFSheet sheet;
		
		WriteDataExcel( XSSFWorkbook workbook , XSSFSheet sheet  )
		{
			
			this.workbook = workbook;
			this.sheet = sheet;
			
		}
		
		public void write()
		{
			
					
			int maxCells = sheet.getRow(0).getPhysicalNumberOfCells();
			int maxRow = sheet.getPhysicalNumberOfRows();
			
			XSSFCell cell = sheet.getRow(0).createCell(maxCells);
			
			XSSFFont textFont = workbook.createFont();
			textFont.setBold(true);

			CellStyle cellstyl = workbook.createCellStyle();
			cellstyl.setFont(textFont);
			
			cell.setCellValue("Phone Number");
			cell.setCellStyle(cellstyl);
			for(int i =1 ; i <maxRow ; i++)
			{
				
				try {
					XSSFCell cellUser = sheet.getRow(i).createCell(maxCells);
					cellUser.setCellValue("1234567890");
				} catch (Exception e) {
					
					System.out.println("Error occured while Enterring the phone numbers..");
					System.out.println(e.getCause());
				}
				
			}
			
			try {
				FileOutputStream fos = new FileOutputStream("./assets/ExcelFiles/UserDat.xlsx");
				workbook.write(fos);
				System.out.println("Sheet Created Successfully!!");
			} catch (Exception e) {
				System.out.println("Error occured while writing the data to Excel sheet name : " + sheet.getSheetName());
				System.out.println(e);
				System.out.println(e.getCause());
			}
			
		}

}




	
	