/**
 * 
 */
package mavenForJenkins;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataTest{
		
	 @DataProvider(name = "testData")
	    public Object[][] testData() throws IOException{
	        return ExcelDataProvider.readExcelData();
	    }
	 
	 @Test(dataProvider="testData")
	 public void test(String testCaseID, String testCaseName) 
	 {
		System.out.println("TestCase Id = "+testCaseID +" & TestCase Name:"+testCaseName); 
	 }

}
