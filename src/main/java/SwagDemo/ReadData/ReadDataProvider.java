package SwagDemo.ReadData;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataProvider {

	public static HSSFWorkbook excelWorkbook;
	public static HSSFSheet excelWSheet;
	public static int row;
	public static int cell;

	static String tableArray[][] = null;

	
	
	public  String[][] getTableArray( String sheetname) {

		try {
			
			FileInputStream file = new FileInputStream("./TestData/TestDatafile.xls");
			excelWorkbook = new HSSFWorkbook(file);
			excelWSheet = excelWorkbook.getSheet(sheetname);

			row = excelWSheet.getLastRowNum();
			cell = excelWSheet.getRow(0).getLastCellNum();

			tableArray = new String[row][cell];
			int ci = 0;
			for (int i = 1; i <= row; i++) {
				int cj = 0;
				for (int j = 1; j <= cell; j++) {

					tableArray[ci][cj] = excelWSheet.getRow(i).getCell(j).getStringCellValue();
					cj++;

				}
				ci++;
			}
		} catch (Exception e) {
			System.out.println("Exception occured...");
			e.printStackTrace();
		}
		
		return tableArray;

	}

}
