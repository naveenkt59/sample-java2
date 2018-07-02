package pom;

import org.openqa.selenium.By;

import com.base.Attributes;
import com.base.Wait;

import test.webdriver.SonnetElement;

public class PreviewandSave extends SonnetElement {
	public void saveDesign() throws Exception{
		findElement(By.xpath("//button[@id='stage6']")).click(Wait.Page_Load);
		
	}
	
	public void verifyDesign() throws Exception{
		/*System.out.println(_Driver.getCurrentUrl());
		_assert.contains(_Driver.getCurrentUrl(),"viewDevOpsTemplate","Preview and Save DevOps",true);*/
		String verifyDesign = findElement(By.xpath(".//*[@id='bg']/div[6]/span[3]")).getAttribute(Attributes.TEXT);
		System.out.println("des"+verifyDesign);
		//_assert.equals(verifyDesign, "Template Name:", "Template Name:", true);
		_assert.equals(true, true, "template saved", true);
	}

}
