package utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {

	public static  String readExcelFile(int row, int cell) throws Exception
	{
		FileInputStream file = new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\framework\\Test_Data\\Zerodha.xlsx");
		Sheet sheetNo = WorkbookFactory.create(file).getSheet("Sheet1");
		String value = sheetNo.getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
}
