/**
 * 
 */
package mavenForJenkins;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelDataProvider {
	

	public static Object[][] readExcelData() throws IOException

	{
		String ExcelFile = "C:/Users/RAZIM MEERAN/eclipse-workspace/TestNG_TestProject/util/SSP.xlsx";
		
		FileInputStream file = new FileInputStream(ExcelFile);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		Sheet sheet = workbook.getSheetAt(0);
		
		int rowCount = sheet.getLastRowNum();
		int ColumnCount=sheet.getRow(0).getLastCellNum();
		
		
		System.out.println("Row number is : "+rowCount);
		System.out.println("Column number is : "+ColumnCount);
		
		Object[][] data = new Object[rowCount][ColumnCount];
		
		
		for(int i=1;i<=rowCount;i++)
		{
			Row row = sheet.getRow(i);
			
			for(int j=0;j<ColumnCount;j++)
			{
				Cell cell = row.getCell(j);
				data[i-1][j]=cell.toString();
			}
		}
		
		workbook.close();
		file.close();
		return data;	
	}
}
