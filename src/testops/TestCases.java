package testops;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.base.Wait;
import com.lib.TestDataSource;
import com.lib.data.DataFormat;

import test.webdriver.SonnetElement;

public class TestCases extends SonnetElement {
	//Link
	By testCaseTab=By.xpath("//span[contains(text(),'TEST CASES')]");
	
	//Image
	By img_newTC=By.xpath("//table[@id='add_case_list_btn']//tbody//tr//td[2]//em//button");
	
	//Textbox
	By txtbox_plan=By.xpath(".//*[@id='bugzilla-body']/form/p/input[1]");
	By txtbox_tcSummary=By.xpath(".//*[@id='ncf-summary']");
	By txtbox_tester=By.xpath(".//*[@id='default_tester']");
	By txtbox_req=By.xpath(".//*[@id='ncf-reqs']");
	
	
	//Dropdown
	By drpdwn_status=By.xpath("//div[@id='x-form-el-ncf-casestatus']//div//img");
	By tcstatus=By.xpath("//div[contains(text(),'READY')]");	
	By drpdwn_category=By.xpath("//div[@id='x-form-el-case_category_combo']//div//img");
	By drpdwn_priority=By.xpath("//div[@id='x-form-el-priority_combo']//div//img");
	By tc_priority=By.xpath("//div[@class='x-combo-list-inner']//div[contains(text(),'High')]");
	By tcCategory=By.xpath("//div[contains(text(),'--default--')]");
	
	
	//Button
	By btn_submit=By.xpath("//td[@class='x-panel-btn-td']//table//tbody//tr//td[2]//em//button[contains(text(),'Submit')]");
	
	
	TestDataSource tc=new TestDataSource();
	
	public void datainitialize() throws Exception{
		tc.open(DataFormat.Excel, _properties.getValue("login_data"), _properties.getValue("sheet_name"), 1);
	}
	
	public void goToTC() throws Exception{
		findElement(testCaseTab).click(Wait.Page_Load);
		Thread.sleep(3000);
		findElement(img_newTC).click(Wait.Page_Load);
	}
	
	public void createTC(String tc_id) throws Exception{
		tc.SetFilterTo(tc_id);
		findElement(txtbox_plan).sendKeys(_properties.getValue("automation_plan_id"),Keys.ENTER);
		Thread.sleep(3000);
		findElement(txtbox_tcSummary).sendKeys(tc.GetData("tc_summary"));
		findElement(txtbox_tester).sendKeys(tc.GetData("default_tester"));
		
		findElement(drpdwn_status).click(Wait.Page_Load);
		findElement(tcstatus).click(Wait.Page_Load);
		
		findElement(drpdwn_category).click(Wait.Page_Load);
		findElement(tcCategory).click(Wait.Page_Load);
		
		findElement(txtbox_req).sendKeys(tc.GetData("tc_req"));
		
		findElement(drpdwn_priority).click(Wait.Page_Load);
		findElement(tc_priority).click(Wait.Page_Load);
		
		findElement(btn_submit).click(Wait.Page_Load);
		Thread.sleep(3000);
		
	}

}
