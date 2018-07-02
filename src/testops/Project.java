package testops;

import org.openqa.selenium.By;

import com.base.Wait;
import com.lib.TestDataSource;
import com.lib.data.DataFormat;

import test.webdriver.SonnetElement;

public class Project extends SonnetElement{

	//Link
	By projects=By.cssSelector("div[id=menu_admin]>a:nth-child(4)");
	By class_rapid=By.xpath(".//*[@id='admin_table']/tbody/tr[4]/td[4]/a");
	By link_editProject=By.xpath(".//*[@id='bugzilla-body']/p[1]/a");
	By link_editVersion=By.xpath("//div[@id='bugzilla-body']/form/table/tbody/tr[7]/th/a");
	
	
	
	
	//Textbox
	By proj_name=By.cssSelector("input[name='product']");
	By proj_desc=By.xpath(".//*[@id='bugzilla-body']/form/table/tbody/tr[3]/td/textarea");
	By comp_name=By.xpath("//input[@name='component']");
	By comp_desc=By.xpath("//table[@id='addcomponent']//tbody//tr[2]//td//textarea[@name='description']");
	By comp_assignee=By.xpath("//input[@id='initialowner']");
	By version_name=By.xpath("//input[@id='version']");
	
	
	
	//Button
	By btn_addProject=By.xpath("//div[@id='bugzilla-body']//form//input[@id='addproduct']");
	By btn_editComponents=By.xpath("//table[@id='admin_table']//tbody//tr//th[2]//a//button");
	By btn_addNewComponent=By.xpath(".//*[@id='bugzilla-body']/p[2]/a");
	By btn_createComp=By.id("addcompbutton");
	By btn_addVersion=By.xpath("//div[@id='bugzilla-body']/p[3]/button");
	By btn_createVersion=By.id("addcompbutton");
	
	TestDataSource proj=new TestDataSource();
	
	public void datainitialize() throws Exception{
		proj.open(DataFormat.Excel, _properties.getValue("login_data"), _properties.getValue("sheet_name"), 1);
	}
	
	
	
	public void projects(String tc_id) throws Exception{
		proj.SetFilterTo(tc_id);
		findElement(projects).click(Wait.Page_Load);
		findElement(class_rapid).click(Wait.Page_Load);
		findElement(proj_name).sendKeys(proj.GetData("proj_name"));
		findElement(proj_desc).sendKeys(proj.GetData("proj_name"));
		findElement(btn_addProject).click(Wait.Page_Load);
		
	}
	
	public void addComponent(String tc_id) throws Exception{
		proj.SetFilterTo(tc_id);
		findElement(btn_editComponents).click(Wait.Page_Load);
		findElement(btn_addNewComponent).click(Wait.Page_Load);
		findElement(comp_name).sendKeys(proj.GetData("comp_name"),Wait.Page_Load);
		findElement(comp_desc).sendKeys(proj.GetData("comp_name"),Wait.Page_Load);
		findElement(comp_assignee).sendKeys(proj.GetData("comp_assignee"),Wait.Page_Load);
		findElement(btn_createComp).click(Wait.Page_Load);
	}
	
	public void addVersion(String tc_id) throws Exception{
		proj.SetFilterTo(tc_id);
		findElement(link_editProject).click(Wait.Page_Load);
		findElement(link_editVersion).click(Wait.Page_Load);
		findElement(btn_addVersion).click(Wait.Page_Load);
		findElement(version_name).sendKeys(proj.GetData("version_name"));
		findElement(btn_createVersion).click(Wait.Page_Load);
	}

}
