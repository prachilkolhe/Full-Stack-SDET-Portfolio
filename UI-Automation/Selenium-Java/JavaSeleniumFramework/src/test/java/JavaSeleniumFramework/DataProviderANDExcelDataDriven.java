package JavaSeleniumFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProviderANDExcelDataDriven {
	
	
	@Test(dataProvider="driveTest")
	public void testCase(String TestCases, String Data1, String Data2, String Data3)
	{

	}
	
	
	
	@DataProvider(name="driveTest")
	public Object[][] getTestData() throws IOException
	{
		// Object[][] data = {{"Login", "abc", "def", "ghi"}, {"Purchase", "jkl", "mno", "pqr"}, {"Add Profile", "stu", "vwx", "yz"}, {"Delete Profile", "123", "456", "789"}};
		// return data;
		// --> Every row of the excel sheet should be pass as single array
		
		// This class methods are used to format the any data type to string data type
		DataFormatter formatter = new DataFormatter();
		
		String path = "/Users/PKE17/eclipse-workspace/JavaSeleniumDataDriven.xlsx";
		FileInputStream FIS = new FileInputStream(path);
		XSSFWorkbook wk = new XSSFWorkbook(FIS);
		XSSFSheet sheet = wk.getSheetAt(0);
		int rowCount = sheet.getPhysicalNumberOfRows();
		
		XSSFRow row = sheet.getRow(0);
		int columnCount = row.getLastCellNum();
		
		Object data[][] = new Object[rowCount-1][columnCount];
		for (int i=0; i<rowCount-1; i++) {
			row = sheet.getRow(i+1);		// i+1 is to skip the header row
			
			for (int j=0; j<columnCount; j++) {
				XSSFCell cell = row.getCell(j);
				
				data[i][j] = formatter.formatCellValue(cell); 			// formatter object will convert the data type of the value in string data type no matter what data type it has
				System.out.println(data[i][j]);
			}
		}
		return data;
	}
	
	
	

}
