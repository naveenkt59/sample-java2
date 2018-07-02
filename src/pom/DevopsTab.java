package pom;

import org.openqa.selenium.By;

import com.base.Wait;

import test.webdriver.SonnetElement;

public class DevopsTab extends SonnetElement {
	public void devops() throws Exception{
		System.out.println(getCurrentUrl());
		findElement(By.xpath("//div[@class='mainNavSection']/ul/li[3]")).click(Wait.Page_Load);
		
	}
	

}
