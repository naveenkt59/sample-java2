package testops;

import org.openqa.selenium.By;

import com.base.Wait;
import com.lib.TestDataSource;
import com.lib.data.DataFormat;

import test.webdriver.SonnetElement;

public class Environment extends SonnetElement {
	
	By envTab=By.xpath("//span[contains(text(),'ENVIRONMENTS')]");
	By img_newEnv=By.xpath(".//*[@id='add_env_list_btn']/tbody/tr/td[2]//em//button");
	
	By txtbox_envName=By.xpath("//input[@name='name']");
	
	By btn_submit=By.xpath("//td[@class='x-panel-btn-td']//table//tbody//tr//td[2]//em//button[contains(text(),'Create')]");
	
	TestDataSource env=new TestDataSource();
	
	public void datainitialize() throws Exception{
		env.open(DataFormat.Excel, _properties.getValue("login_data"), _properties.getValue("sheet_name"), 1);
	}
	
	
	public void createEnv(String tc_id) throws Exception{
		env.SetFilterTo(tc_id);
		findElement(envTab).click(Wait.Page_Load);
		Thread.sleep(2000);
		findElement(img_newEnv).click(Wait.Page_Load);
		findElement(txtbox_envName).sendKeys(env.GetData("env_name"));
		findElement(btn_submit).click(Wait.Page_Load);
		Thread.sleep(3000);
	}
	

}
