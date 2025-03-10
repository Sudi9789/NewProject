package Testcase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.Login;
import PageObject.Logout;
import Utilities.DataDriventesting;


public class Testcase extends BaseClass {
	@Test(dataProvider = "DataPro")
	void login(String user, String pass)
	{
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));	
		Logger L1= LogManager.getLogger("Login");
		L1.info("Launch browser");
	driver.get(url);	
	Login lc= new Login(driver);
	L1.info("enter username");
	lc.user_Name(user);
	L1.info("enter password");
	lc.user_Pass(pass);
	lc.subbutton();
	//Logout lc1= new Logout(driver);
	//lc1.user_logout();

}
	@Test
	void logout()
	{
		Logout l = new Logout(driver);
		l.user_logout();
	}
	
	@DataProvider(name="DataPro")
	public String[][]searchData() throws Exception
	{
		String filename="C:\\Users\\wilso\\OneDrive\\Desktop\\data.xlsx";
		int row= DataDriventesting.getRow(filename,"Sheet1");
		int col= DataDriventesting.getCol(filename,"Sheet1");
		String s1[][]=new String[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				s1[i][j]=DataDriventesting.getCellValue(filename,"Sheet1",i,j);
			}
				
		}
		return s1;
	
}

}
