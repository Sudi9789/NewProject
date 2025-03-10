package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
WebDriver currentdriver;
	
	public Login(WebDriver RemoteDriver)
	{
		currentdriver= RemoteDriver;
		PageFactory.initElements(RemoteDriver,this);
	}
	
	
		@FindBy(id="userame") WebElement Username;
	
		@FindBy(id="password") WebElement Password;		
		@FindBy(id="submit") WebElement Submit;
		public void user_Name(String user)
		{
			Username.sendKeys(user);
		}
		
		public void user_Pass(String pass)
		{
			Password.sendKeys(pass);
		}
		public void subbutton()
		{
			Submit.click();
		}

}
