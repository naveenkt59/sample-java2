package pom;

import org.openqa.selenium.By;

import com.base.Attributes;
import com.base.Wait;

import test.webdriver.SonnetElement;

public class ChoosePipeline extends SonnetElement {
	
	public void selectCIPipeline() throws Exception{
		findElement(By.xpath("//input[@name='ci1-pipeline']")).click(Wait.Page_Load);
		boolean ischeckedCI=findElement(By.xpath("//input[@name='ci1-pipeline']")).isSelected();
		System.out.println(ischeckedCI);
		_assert.equals(ischeckedCI, true, "CI Pipeline is selected", true);
	}
	
	public void choosePipeline() throws Exception{
		
		findElement(By.xpath("//button[@id='stageCodeRepo']")).click(Wait.Page_Load);
	}
	
	public void selectCDPipeline() throws Exception{
		findElement(By.xpath("//input[@name='ci4-pipeline']")).click(Wait.Page_Load);
		findElement(By.xpath("//input[@name='ct3-pipeline']")).click(Wait.Page_Load);
		findElement(By.xpath("//input[@name='cd-pipeline']")).click(Wait.Page_Load);
		
		boolean ischeckedCD=findElement(By.xpath("//input[@name='cd-pipeline']")).isSelected();
		System.out.println(ischeckedCD);
		_assert.equals(ischeckedCD, true, "CD Pipeline is selected", true);
	}
	
	public void selectCDPipeline_err() throws Exception{
		findElement(By.xpath("//input[@name='cd-pipeline']")).click(Wait.Page_Load);
		String cd_err=findElement(By.xpath("//div[@class='alert-body']")).getAttribute(Attributes.TEXT);
		_assert.equals(cd_err,"Select last step in CT pipeline","Select CD without CT",true);
		
		
	}


}
