package JavaRESTAssuredAPITesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataDriven {

	public static ArrayList<String> getExcelData(String testCaseName) throws IOException {
		// To stored the required cell data in array
		ArrayList<String> array = new ArrayList<String>();

		// Need to pass the file path to read it
		FileInputStream fis = new FileInputStream("/Users/PKE17/eclipse-workspace/JavaSeleniumDataDriven.xlsx");

		// Using XSSFWorkbook class, will read the values present in excel sheet
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheets = workbook.getNumberOfSheets();
		for (int i = 0; i < sheets; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("TestData")) {
				XSSFSheet sheet = workbook.getSheetAt(i);

				// Identify TestCases column by scanning the first row
				Iterator<Row> rows = sheet.iterator(); // Sheet is a collections of Rows
				Row firstRow = rows.next();
				Iterator<Cell> cells = firstRow.cellIterator(); // Rows is a collections of Cells
				cells.next();

				// Going through each value of first row until we have values are there in cells
				int k = 0; // Using this k to catch the index of required column
				int column = 0;
				while (cells.hasNext()) {
					Cell value = cells.next();
					if (value.getStringCellValue().equalsIgnoreCase("TestCases")) {
						column = k;

					}

					k++;
				}
				System.out.println("Column index is: " + column);

				// Scan all the value present in that column by iterating through each rows of
				// that column

				while (rows.hasNext()) {
					Row r = rows.next();
					if (r.getCell(column).getStringCellValue().equalsIgnoreCase(testCaseName)) {

						// Grab all the cell contents of this row
						Iterator<Cell> required_row = r.cellIterator();
						while (required_row.hasNext()) {

							Cell c = required_row.next();
							if (c.getCellType() == CellType.STRING) {

								array.add(c.getStringCellValue());

							} else {
								array.add(NumberToTextConverter.toText(c.getNumericCellValue()));		// Non string value converting to string value using converter
								
							}

						}
					}

				}
			}
		}
		return array;
	}

	public static void main(String[] args) throws IOException {
		ArrayList data = getExcelData("Add Profile");
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));

	}
}
