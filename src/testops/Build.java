package testops;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.base.Wait;
import com.lib.TestDataSource;
import com.lib.data.DataFormat;

import test.webdriver.SonnetElement;

public class Build extends SonnetElement{

	By buildTab=By.xpath("//span[contains(text(),'BUILDS')]");
	By img_newBuild=By.xpath(".//*[@id='add_build_btn']/tbody/tr/td[2]//em//button");
	
	By txtbox_buildName=By.xpath("//table[@class='x-grid3-row-table']//tbody//tr//td[2]");
	By txtbox_buildName1=By.xpath("//div[@class='x-grid3-scroller']//div[2]//input");
	By btn_submit=By.xpath("//td[@class='x-panel-btn-td']//table//tbody//tr//td[2]//em//button[contains(text(),'Create')]");
	
	TestDataSource build=new TestDataSource();
	
	public void datainitialize() throws Exception{
		build.open(DataFormat.Excel, _properties.getValue("login_data"), _properties.getValue("sheet_name"), 1);
	}
	
	
	
	public void createBuild(String tc_id) throws Exception{
		build.SetFilterTo(tc_id);
		findElement(buildTab).click(Wait.Page_Load);
		Thread.sleep(2000);
		findElement(img_newBuild).click(Wait.Page_Load);
		Thread.sleep(1000);
		findElement(txtbox_buildName).doubleClick();
		findElement(txtbox_buildName1).sendKeys(build.GetData("build_name"),Keys.ENTER);
		
		Thread.sleep(3000);
	}
	
	
}
