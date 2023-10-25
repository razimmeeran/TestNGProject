/**
 * 
 */
package mavenForJenkins;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderProgram {
	@DataProvider(name="Credentials")
	public Object[][] testdata()
	{
		return new Object[][] {
			
			{"Razim","Meeran"},
			{"Shameen","Nisha"}			
		};
	}
	@Test(dataProvider = "Credentials")
	public void test(String Fname, String Lname)
	{
		System.out.println("My name is : "+Fname +" "+Lname);		
	}
}
