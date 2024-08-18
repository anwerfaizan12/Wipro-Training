package day_20;

import java.io.File;
import java.io.FileInputStream;
 
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook; // For .xlsx files
 
public class XlSheet_01 {
	//excel file with data
	//apache poi jar, in addition to selenium jar files, chrome driver
	public static void main(String[] args) {
        try {
        	File f=new File("C:\\Users\\Administrator\\Downloads\\day_20 workbook.xlsx");
            FileInputStream fis = new FileInputStream(f);
            Workbook workbook = new XSSFWorkbook(fis); // Use HSSFWorkbook for .xls files
            Sheet sheet = workbook.getSheetAt(0); // Assuming you want the first sheet
            
            Row row = sheet.getRow(1);
            
            Cell cell = row.getCell(0);
            System.out.println(cell.getNumericCellValue());
 
            Cell cell1 = row.getCell(1);
            System.out.println(cell1.getStringCellValue());
           
         //Get the total number of rows (excluding header row)
           int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum() + 1;
           System.out.println("Total number of rows: " + rowCount);
 
            // Get the total number of columns (assuming all rows have the same number of columns)
            int columnCount = sheet.getRow(0).getLastCellNum();
            System.out.println("Total number of columns: " + columnCount);
            
 
            workbook.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}