package JavaSeleniumFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	
	public static ArrayList<String> getExcelData(String TestCaseName) throws IOException {

		// Store the file path in variable using FileInputStream
		String filePath = "/Users/PKE17/eclipse-workspace/JavaSeleniumDataDriven.xlsx";
		FileInputStream FIS = new FileInputStream(filePath);

		
		// Pass the file path to workbook object
		XSSFWorkbook workbook = new XSSFWorkbook(FIS);

		
		// Storing data in array
		ArrayList<String> DataArray = new ArrayList<String>();
		
		
		// Navigate to the required sheet present in the excel file
		int sheets = workbook.getNumberOfSheets();
		for (int i = 0; i < sheets; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("TestData")) {
				XSSFSheet sheet = workbook.getSheetAt(i);

				// Scan entire first row to verify the expected column
				Iterator<Row> rows = sheet.iterator(); 									 // Iterator for each rows of the sheet
				Row FirstRow = rows.next();
				
				
				// Scan the entire row to verify required column name
				Iterator<Cell> FCells = FirstRow.cellIterator(); 						// Iterator for each cell of the row
				int k = 0;
				int column = 0;
				while (FCells.hasNext()) { 												// It will check if next cell is present, if yes then it will go inside
					Cell value = FCells.next(); 										// Moved to next cell, without this it will only have control of that row but not of cells
					if (value.getStringCellValue().equalsIgnoreCase("TestCases")) {
						column = k;
//						System.out.println(column);
					}
					k++;
				}

				
				// Scan the column to verify the expected value of the column
				while (rows.hasNext()) {
					Row r = rows.next();
					if (r.getCell(column).getStringCellValue().equalsIgnoreCase(TestCaseName)) {

						// Pull all the data of that row and fetch it in the test case
						Iterator<Cell> r_values = r.cellIterator();
						while (r_values.hasNext()) {
							
							Cell c = r_values.next();
							if (c.getCellType() == CellType.STRING) {
//							System.out.println(c.getStringCellValue());
							DataArray.add(c.getStringCellValue());
							}
							else {
								DataArray.add(String.valueOf(c.getNumericCellValue()));		// We can't add data type other than string, so converted integer into string then added it
							}
							
						}
					}
				}
			}
		}
		return DataArray;	
	}

	
	
	
	public static void main(String[] args) throws IOException {
		ArrayList data = getExcelData("Delete Profile");
		System.out.println(data);
	}
}
