package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static String[][] readData(String excelfileName, String excelSheetName) throws IOException
	{
		XSSFWorkbook wb = new XSSFWorkbook("C:/Users/Janet Joshlina/eclipse-workspace/project/data/"+excelfileName+".xlsx");
		XSSFSheet ws = wb.getSheet(excelSheetName);
		int rowCount = ws.getLastRowNum();
		int cellCount = ws.getRow(0).getLastCellNum();
		String[][] data = new String[rowCount][cellCount];
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < cellCount; j++) {
				data[i-1][j] =  ws.getRow(i).getCell(j).getStringCellValue();
			} 
		}
		wb.close();
		return data;
		
	}

}
