package project;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReading {
	
	public Object[][] readData() throws IOException {
		XSSFWorkbook book = new XSSFWorkbook("C:/Users/Janet Joshlina/eclipse-workspace/project/data/NOPCommerce.xlsx");
		XSSFSheet sheet = book.getSheet("TC006_ProductPresentOrNot");
		
		//get the number of rows
		int row = sheet.getLastRowNum();
		System.out.println(row);
		
		//get the number of columns
		short column = sheet.getRow(0).getLastCellNum();
		System.out.println(column);
		
		//add the row and columb in a string
		String[][] data = new String[row][column];
		
		//get one data 
		for (int i = 1; i <= row; i++) {
			for (int j = 0; j < column; j++) {
				String data1 = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(data1);
				
				//store in data
				data[i-1][j]=data1;
			}
		}
		
		//close book
		book.close();
		return data;

	}
	
	public static void main(String[] args) throws IOException {
		ExcelReading er = new ExcelReading();
		er.readData();
	}

}
