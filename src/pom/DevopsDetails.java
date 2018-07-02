package pom;

import org.openqa.selenium.By;

import test.webdriver.SonnetElement;

import com.base.Attributes;
import com.base.Wait;

public class DevopsDetails extends SonnetElement{
	
	public void selectTechnology() throws Exception{
		findElement(By.xpath("//input[@value='Java']")).click(Wait.Page_Load);
		
		findElement(By.xpath("//button[@id='stagePipeline']")).click(Wait.Page_Load);
	}
	
	public void verifyTechnology() throws Exception{
		String tech=findElement(By.xpath("//div[@class='devdetail-overview']/h7[1]")).getAttribute(Attributes.TEXT);
		_assert.contains(tech, "Java", "Technology", true);
	}
	
	public void devopsDetails() throws Exception{
		findElement(By.cssSelector("#stagePipeline")).click(Wait.Page_Load);
	}
	
	
	public void selectTechnology_err() throws Exception{
		
         findElement(By.xpath("//div[@class='stage-infrastructure']/div[1]")).click(Wait.Page_Load);
		 findElement(By.xpath("//button[@id='stageDevOps']")).click(Wait.Page_Load);
		 findElement(By.cssSelector("#stagePipeline")).click(Wait.Page_Load);
		String alert=findElement(By.xpath(".//*[@id='alertModal']/div/div/div/div")).getAttribute(Attributes.TEXT);	
		_assert.equals(alert, "Select any Technology", "Select any Technology", true);
		}
	
	
	public void selectCI() throws Exception{
		findElement(By.cssSelector("#stagePipeline")).click(Wait.Page_Load);
	}
	
	public void verifyCI() throws Exception{
		String ci=findElement(By.xpath("//div[@class='devdetail-overview']/h7[2]")).getAttribute(Attributes.TEXT);
		_assert.contains(ci, "DevOps Type : Continuous Integration", true);		
	}
	
	public void selectCD() throws Exception{
		
		findElement(By.xpath("//input[@name='cd']")).click(Wait.Page_Load);;
			
	}
	
	public void verifyCD() throws Exception{
		String cd=findElement(By.xpath("//div[@class='devdetail-overview']/h7[2]")).getAttribute(Attributes.TEXT);
		_assert.contains(cd, "DevOps Type : Continuous Integration, Continuous Testing, Continuous Delivery","Continuous Delivery", true);
	}
	
	
	
	
	
}
