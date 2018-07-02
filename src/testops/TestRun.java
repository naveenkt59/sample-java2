package testops;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.base.Wait;
import com.lib.TestDataSource;
import com.lib.data.DataFormat;

import test.webdriver.SonnetElement;

public class TestRun extends SonnetElement{

	//Link
	By testRunTab=By.xpath("//span[contains(text(),'TEST RUNS')]");
	
	//Image
	By img_createRun=By.xpath("//table[@id='add_run_list_btn']//tbody//tr//td[2]//em//button");
	
	//Dropdown
	By drpdwn_version=By.xpath("//div[@id='x-form-el-product_version_combo']//div//img");
	By version_value=By.xpath("//div[@class='x-combo-list-inner']//div[contains(text(),'28-03-2017')]");
	
	By drpdwn_build=By.xpath("//div[@id='x-form-el-build_combo']//div//img");
	By build_value=By.xpath("//div[@class='x-combo-list-inner']//div[contains(text(),'Build1')]");
	
	
	By drpdwn_env=By.xpath("//div[@id='x-form-el-environment_combo']//div//img");
	By env_value=By.xpath("//div[@class='x-combo-list-inner']//div[contains(text(),'QA')]");
	
	//TextBox
	By txtbox_plan=By.xpath(".//*[@id='bugzilla-body']/form/p/input[1]");
	By txtbox_runSummary=By.xpath(".//*[@id='run_summary']");
	
	
	//Button
	By btn_submit=By.xpath("//td[@class='x-panel-btn-td']//table//tbody//tr//td[2]//em//button[contains(text(),'Submit')]");
	By btn_goToCreatedRun=By.xpath("//td[@class='x-panel-btn-td']//table//tbody//tr//td[2]//em//button[contains(text(),'Yes')]");
	By btn_TCPass=By.xpath("//div[@id='caserun_grid_tb']//table//tbody//tr//td[2]//table//tbody//tr//td//button//img");
	
	
	//Checkbox
	By addCaseToRun=By.xpath("//img[@class='x-form-check']");
	
	
	By selectTC=By.xpath("//div[@class='x-grid3-body']/div/table/tbody/tr[1]");
	

	TestDataSource tr=new TestDataSource();
	
	public void datainitialize() throws Exception{
		tr.open(DataFormat.Excel, _properties.getValue("login_data"), _properties.getValue("sheet_name"), 1);
	}
	
	public void goToTestRun() throws Exception{
		findElement(testRunTab).click(Wait.Page_Load);
		Thread.sleep(1000);
		findElement(img_createRun).click(Wait.Page_Load);
	}
	
	public void creteRun(String tc_id) throws Exception{
		tr.SetFilterTo(tc_id);
		findElement(txtbox_plan).sendKeys(_properties.getValue("automation_plan_id"),Keys.ENTER);
		
		findElement(addCaseToRun).click(Wait.Page_Load);
		
		
		findElement(drpdwn_version).click(Wait.Page_Load);
		findElement(version_value).click(Wait.Page_Load);
		
		findElement(drpdwn_build).click(Wait.Page_Load);
		findElement(build_value).click(Wait.Page_Load);
		
		
		findElement(drpdwn_env).click(Wait.Page_Load);
		findElement(env_value).click(Wait.Page_Load);
		
		findElement(txtbox_runSummary).sendKeys(tr.GetData("run_summary"));
		
		findElement(btn_submit).click(Wait.Page_Load);
		
		
		findElement(btn_goToCreatedRun).click(Wait.Page_Load);
		
		
		findElement(selectTC).click(Wait.Page_Load);
		
		
		findElement(btn_TCPass).click(Wait.Page_Load);
		Thread.sleep(1000);
	}
}
