package testops;

import org.openqa.selenium.By;

import com.lib.TestDataSource;
import com.lib.data.DataFormat;

import test.webdriver.SonnetElement;

public class TestopsLogin extends SonnetElement{
	TestDataSource login=new TestDataSource();
	
	//Textbox
	By login_name=By.id("Bugzilla_login");
	By login_passwd=By.id("Bugzilla_password");
	
	//Button
	By btn_login=By.id("log_in");
	
	
	public void initializeData() throws Exception{
		login.open(DataFormat.Excel, _properties.getValue("login_data"), _properties.getValue("sheet_name"), 1);
	}
	
	public void login(String tc_id) throws Exception{
		login.SetFilterTo(tc_id);
		navigateTo(_properties.getValue("url"));

		findElement(login_name).sendKeys(login.GetData("username"));
		findElement(login_passwd).sendKeys(login.GetData("password"));
		findElement(btn_login).click();

	}
	
	

}
