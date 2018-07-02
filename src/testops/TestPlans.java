package testops;

import org.openqa.selenium.By;


import com.base.Attributes;
import com.base.Wait;
import com.lib.TestDataSource;
import com.lib.data.DataFormat;

import test.webdriver.SonnetElement;

public class TestPlans extends SonnetElement{
	//Links
	By link_testPlan=By.xpath("//span[contains(text(),'TEST PLANS')]");
	By link_testManagement=By.xpath("//a[contains(text(),'Test Management')]");
	
	//Button
	By btn_newPlan=By.xpath("//table[@id='new_plan_list_btn']//tbody//tr//td[2]//em//button");
	By btn_submitPlan=By.xpath("//div[@class='x-panel-btns x-panel-btns-center']//table//td[@class='x-panel-btn-td']//table[1]//tbody//tr//td[2]//em//button[contains(text(),'Submit')]");
	//Dropdown
	By drpdwn_project=By.xpath("//input[@id='new_plan_form_product_chooser']");
	By drpdwn_planType=By.xpath("//input[@id='new_plan_form_types_chooser']");
	By drpdwn_version=By.xpath("//div[@id='x-form-el-new_plan_form_version_chooser']//div//img");
	By selectProject=By.xpath("//div[@class='x-combo-list-inner']//div[1]");
	//Testbox
	By txtbox_planName=By.name("plan_name");
	
	//Image
	By img_projDropdwn=By.xpath("//div[@id='x-form-el-new_plan_form_product_chooser']//div//img");
	
	By project_name=By.xpath("//div[contains(text(),'Sonata')]");
	//By project_name=By.xpath("//div[@class='x-combo-list-inner']//div[25]");
	
	//By version_name=By.xpath("//div[@class='x-combo-list-inner']//div[contains(text(),'28-03-2017')]");
	By version_name=By.xpath("//div[@class='x-combo-list-inner']//div[contains(text(),'28-03-2017')]");
	By txtbox_version=By.xpath(".//*[@id='new_plan_form_version_chooser']");
	By plantype_drpdwn=By.xpath("//div[@id='x-form-el-new_plan_form_types_chooser']//div//img");
	By plantype=By.xpath("//div[contains(text(),'Unit')]");
	
	
	
	By plan_dialogBox=By.xpath("//span[@class='ext-mb-text']");
	
	TestDataSource plan=new TestDataSource();
	
	public void datainitialize() throws Exception{
		plan.open(DataFormat.Excel, _properties.getValue("login_data"), _properties.getValue("sheet_name"), 1);
	}
	
	public void goToDashboard() throws Exception{
		findElement(link_testManagement).click(Wait.Page_Load);
	}
	
	public void selectProject() throws Exception{
		
	}
	
	public void createPlan(String tc_id) throws Exception{
		//findElement(link_testManagement).click(Wait.Page_Load);
		plan.SetFilterTo(tc_id);
		findElement(link_testPlan).click(Wait.Page_Load);
		Thread.sleep(2000);
		findElement(btn_newPlan).click(Wait.Page_Load);
		findElement(txtbox_planName).sendKeys(plan.GetData("plan_name"));
		
	
		findElement(img_projDropdwn).click(Wait.Page_Load);
		findElement(project_name).click(Wait.Page_Load);
		
		
		Thread.sleep(2000);
				
	
		
		
		findElement(plantype_drpdwn).click(Wait.Page_Load);
		findElement(plantype).click(Wait.Page_Load);
		
		findElement(drpdwn_version).click(Wait.Page_Load);
		findElement(version_name).click(Wait.Page_Load);
		
		findElement(btn_submitPlan).click(Wait.Page_Load);
		Thread.sleep(3000);
		
		
		String abc=findElement(plan_dialogBox).getAttribute(Attributes.TEXT);
		String numberOnly= abc.replaceAll("[^0-9]", "");
		System.out.println(numberOnly);
		_properties.setValue("automation_plan_id", numberOnly);
		
		System.out.println(_properties.getValue("automation_plan_id"));
	}

}
