package pom;

import org.openqa.selenium.By;

import test.webdriver.SonnetElement;


import com.base.Attributes;
import com.base.Wait;

public class SelectInfrastructure extends SonnetElement {
	
	//View Projects
	public void viewProjects() throws Exception{
		findElement(By.xpath("//div[@id='singleNavigation']/div[1]/ul/li[2]")).click(Wait.Page_Load);
		findElement(By.xpath("//table[@id='getacc']/tbody/tr/td[3]/button[2]")).click(Wait.Page_Load);
		findElement(By.xpath(".//*[@id='singleNavigation']/div[2]/ul/li[2]")).click(Wait.Page_Load);
		findElement(By.xpath("//table[@id='projectDetails']/tbody/tr[1]/td[3]/button[1]")).click(Wait.Page_Load);
	}
	
	
	
	
	//Select devOps template
	public void selectTemplate() throws Exception{
		findElement(By.xpath("//div[@class='stage-infrastructure']/div[1]")).click(Wait.Page_Load);
		findElement(By.xpath("//button[@id='stageDevOps']")).click(Wait.Page_Load);		
		findElement(By.xpath("//input[@value='Java']")).click(Wait.Page_Load);		
		findElement(By.xpath("//button[@id='stagePipeline']")).click(Wait.Page_Load);	
	}
	
	//Verfy error message on trying to proceed without selecting template
	public void selectTemplate_err() throws Exception{
		findElement(By.xpath("//button[@id='stageDevOps']")).click(Wait.Page_Load);
		Thread.sleep(5000);
		//String abc= findElement(By.xpath("//div[@class='alert-body']")).getAttribute(Attributes.TEXT);
		_assert.equals("Please Select Some DevOps Template.", "Select Some tileSelect Template", true);

		}
	

}
