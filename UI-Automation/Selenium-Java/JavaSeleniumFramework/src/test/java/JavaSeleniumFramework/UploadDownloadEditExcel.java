package JavaSeleniumFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class UploadDownloadEditExcel {

	public static void main(String[] args) throws IOException {
		
		String ColumnName= "Price";
		String fruitName = "Apple";
		String newValue = "600";
		String filePath = "/Users/PKE17/Downloads/download.xlsx";
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/upload-download-test/index.html");
		
		// Download the excel sheet
		driver.findElement(By.id("downloadButton")).click();
		
		
		// Edit the excel sheet
		int col = getColumnNumber(filePath, ColumnName);
		int row = getRowNumber(filePath, fruitName);
		Assert.assertTrue(updateCell(filePath, col, row, newValue));
		
		
		// Upload the excel sheet
		WebElement uploadButton = driver.findElement(By.xpath("//input[@type='file']"));		// When any web element has type as file, selenium treat it as file upload browse functionality
		uploadButton.sendKeys(filePath);														// Instead of interacting with browse pop up window, we pass the path of downloaded file
		
		
		
		// Verify toast message is displayed and get disappeared
		WebElement toast_mssg = driver.findElement(By.cssSelector("div[role='alert'] div:nth-child(2)"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(toast_mssg));
		Assert.assertEquals("Updated Excel Data Successfully.", toast_mssg.getText());
		System.out.println(toast_mssg.getText());
		
		wait.until(ExpectedConditions.invisibilityOf(toast_mssg));
		
		
		
		// Verify the edited value in web table
		String priceColumn = driver.findElement(By.xpath("//div[text()='Price']")).getAttribute("data-column-id");
		String actual_price = driver.findElement(By.xpath("//div[text()='"+fruitName+"']/parent::div/parent::div/div[@id='cell-"+priceColumn+"-undefined']")).getText();
		System.out.println(actual_price);
		Assert.assertEquals(newValue, actual_price);
	}
	
	

	
	
	private static int getColumnNumber(String filePath, String columnName) throws IOException {
		
		FileInputStream FIS = new FileInputStream(filePath);
		XSSFWorkbook wk = new XSSFWorkbook(FIS);
		XSSFSheet sheet = wk.getSheet("Sheet1");
		
		Iterator<Row> rows = sheet.iterator();
		Row firstRow = rows.next();
		Iterator<Cell> cells = firstRow.cellIterator();
		int k=0;
		int column=0;
		while (cells.hasNext()) {
			Cell value =  cells.next();
			if (value.getStringCellValue().equalsIgnoreCase(columnName)) {
				column=k;
			}
			k++;
		}
		System.out.println(column);
		return column;
		
	}
	
	
	private static int getRowNumber(String filePath, String fruitName) throws IOException {
		
		FileInputStream FIS = new FileInputStream(filePath);
		XSSFWorkbook wk = new XSSFWorkbook(FIS);
		XSSFSheet sheet = wk.getSheet("Sheet1");
		
		Iterator<Row> rows = sheet.iterator();
		int k=0;
		int rowNumber=0;
		while (rows.hasNext()) {
			Row row = rows.next();
			Iterator<Cell> cells = row.cellIterator();
			
			while (cells.hasNext()) {
				Cell cell = cells.next();
				if (cell.getCellType() == CellType.STRING && cell.getStringCellValue().equalsIgnoreCase(fruitName)) {				// Here we are checking only Apple ie, string so we are avoiding the checking the numeric cell
					rowNumber=k;
					break;
				}
			}
			k++;
		}
		
		return rowNumber;
		
	}


	private static boolean updateCell(String filePath, int col, int row, String updatedValue) throws IOException {
		
		FileInputStream FIS = new FileInputStream(filePath);
		XSSFWorkbook wk = new XSSFWorkbook(FIS);
		XSSFSheet sheet = wk.getSheet("Sheet1");
		Row required_Row = sheet.getRow(row);							
		Cell required_Cell = required_Row.getCell(col);
		required_Cell.setCellValue(updatedValue);
		
		FileOutputStream FOS = new FileOutputStream(filePath);			// To read the file we use FileInputStream while to write and save the file we use FileOutputStream
		wk.write(FOS);													// using workbook object it will written the sheet using FOS
		wk.close();														// After completing editing of that sheet, close the workbook using its object
		FIS.close();													// After completing the editing work, close the FileInputStream
		
		return true;
	}

}
