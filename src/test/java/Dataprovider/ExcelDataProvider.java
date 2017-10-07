package Dataprovider;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ExcelDataProvider {
	 public XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public ExcelDataProvider() {
		try{
			File src = new File("./Applictn TestData/AppData.xlsx");
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		}
			catch (Exception e) {
				System.out.println(e.getMessage());
	     		}
		}
	public String getData(int sheetno, int row, int col){
		sheet= wb.getSheetAt(sheetno);
		String data = sheet.getRow(row).getCell(col).getStringCellValue();
		return data ;
	}
	
	public int getRow (int sheetno){
		int row_no = wb.getSheetAt(sheetno).getLastRowNum();
		int row = row_no + 1;
		return row;
	}
}


