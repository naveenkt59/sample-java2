package testops;

import org.openqa.selenium.By;

import com.base.Wait;
import com.lib.TestDataSource;
import com.lib.data.DataFormat;

import test.webdriver.SonnetElement;

public class Requirements extends SonnetElement{
	
	By img_prodList=By.xpath("//div[@id='products_pane-xcollapsed']//div");
	By img_classification=By.xpath("//li[@class='x-tree-node']//ul//li[3]//div[1]//img[@class='x-tree-ec-icon x-tree-elbow-plus']");
	By img_newReq=By.xpath("//table[@id='add_requirement_list_btn']//tr//td[2]//em");
	//Link
	By link_project=By.xpath("//span[contains(text(),'Sonata')]");
	By link_Requirements=By.xpath("//span[contains(text(),'REQUIREMENTS')]");
	
	//Textbox
	By txtbox_reqSub=By.xpath("//textarea[@id='newsubject']");
	By txtbox_reqDesc=By.xpath("//textarea[@id='newdescription']");
	By txtbox_rank=By.xpath("//div[@class='input-tab']//input[@id='newrank']");
	
	//Dropdowns
	By drpdwn_targtVersion=By.xpath("//div[@class='dropdown-tab']//select[@id='newtarget_version']");
	By drpdwn_status=By.xpath("//div[@class='dropdown-tab']//select[@id='newstatus']");
	By drpdwn_priority=By.xpath("//div[@class='dropdown-tab']//select[@id='newpriority']");
	
	//Button
	By btn_submit=By.xpath(".//*[@id='add-modal']/div/div/div[2]/div/input[@type='submit']");
	
	
	TestDataSource requirement=new TestDataSource();
	
	public void datainitialize() throws Exception{
		requirement.open(DataFormat.Excel, _properties.getValue("login_data"), _properties.getValue("sheet_name"), 1);
	}
	
	public void selectProject() throws Exception{
		//Boolean isPresent = findElements(img_prodList).isDisplayed();
		
		Boolean isPresent=findElement(img_prodList).isDisplayed();
		System.out.println(isPresent);
		if(isPresent)
		{
			findElement(img_prodList).click(Wait.Page_Load);
		}
		
		
		findElement(img_classification).click(Wait.Page_Load);
	
		
		findElement(link_project).click(Wait.Page_Load);
		
		
		
	}
	
	public void createReq(String tc_id) throws Exception{
		requirement.SetFilterTo(tc_id);
		findElement(link_Requirements).click(Wait.Page_Load);
		Thread.sleep(2000);
		findElement(img_newReq).click(Wait.Page_Load);
		Thread.sleep(2000);
		findElement(txtbox_reqSub).sendKeys(requirement.GetData("req_sub"));
		findElement(txtbox_reqDesc).sendKeys(requirement.GetData("req_sub"));
		findElement(drpdwn_targtVersion).selectByVisibleText(requirement.GetData("req_ver"));
		findElement(drpdwn_status).selectByVisibleText("New");
		findElement(drpdwn_priority).selectByVisibleText(requirement.GetData("req_priority"));
		//findElement(drpdwn_targtVersion).selectByVisibleText(requirement.GetData("req_version"), Wait.Page_Load);
		//Thread.sleep(2000);
		findElement(txtbox_rank).sendKeys("1");
		findElement(btn_submit).click(Wait.Page_Load);
	}

}
