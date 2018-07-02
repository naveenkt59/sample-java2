package pom;



import org.openqa.selenium.By;


import com.base.Attributes;
import com.base.Wait;
import com.lib.TestDataSource;
import com.lib.data.DataFormat;

import test.webdriver.SonnetElement;

public class DedicatedDevops extends SonnetElement {
TestDataSource dedicatedDevops=new TestDataSource();
	
	public void datainitialize() throws Exception{
		String csvpath=_properties.getValue("data");
		dedicatedDevops.open(DataFormat.CSV,csvpath);
		
	}
	
	/*To launch browser*/
	public void setup() throws Exception{
		
		invokeBrowser(_properties.getValue("browser_name"));
	}
	
	public void dedicatedDevops() throws Exception{
		findElement(By.cssSelector(".deployDedicatedDevops")).click(Wait.Page_Load);
	}
	
	public void configDeployedTemplate() throws Exception{
		findElement(By.xpath("//div[@id='configureTemplate']//table//tbody//tr[1]//td[4]//a")).click(Wait.Page_Load);
		
	}
	
public void deployTemplate() throws Exception{
	findElement(By.xpath("//li[@class='deployDedicatedDevops']/span")).click(Wait.Page_Load);
	findElement(By.xpath("//div[@id='infrastructure']/ul/li[2]/a")).click(Wait.Page_Load);
	
}

public void selectTemplate() throws Exception{
	//findElement(By.xpath("//summary[@data-templatename='Dedicated_Devops_DevOps_59234']")).click(Wait.Page_Load);
	findElement(By.xpath(".//*[@id='deployTemplate']/article/summary[1]/table/tbody/tr[1]/td[2]")).click(Wait.Page_Load);
	String abc=findElement(By.xpath(".//*[@id='deployTemplate']/article/summary[1]/table/tbody/tr[1]/td[2]")).getAttribute(Attributes.TEXT);
	System.out.println("Selected Template = "+abc);
}


public void selectTemplateproceed() throws Exception{
	findElement(By.xpath("//button[@id='cloudDetails']")).click(Wait.Page_Load);
	
}

public void verifyTemplate() throws Exception{
	String temp=findElement(By.xpath("//div[@class='cloud-detail-overview']/h7[1]")).getAttribute(Attributes.TEXT);
	System.out.println("Selected template = "+temp);
	
}

public void addCloudService() throws Exception{
	
	findElement(By.xpath("//button[@id='addNewCloudService']")).click(Wait.Page_Load);
	Thread.sleep(3000);
	findElement(By.xpath("//input[@id='newCloudService']")).sendKeys("abc");
	findElement(By.xpath("//button[@id='addCloudBtn']")).click(Wait.Page_Load);
	
}

public void verifyCloudService() throws Exception{
	String cloudStorage= findElement(By.xpath("//div[@class='alert-body']")).getAttribute(Attributes.TEXT);
	_assert.equals(cloudStorage,"Cloud Service Added","Verify cloud service",true);
	
}
 
public void addStorageAccount() throws Exception{
	findElement(By.xpath("//button[@id='addNewStorageAccount']")).click(Wait.Page_Load);
	findElement(By.xpath("//input[@id='newStorageAccount']")).sendKeys("abc");
	findElement(By.xpath("//button[@id='addStorageBtn']")).click(Wait.Page_Load);
	
	}


public void verifyStorageAccount() throws Exception{
	String storageAccount= findElement(By.xpath("//div[@class='alert-body']")).getAttribute(Attributes.TEXT);
	_assert.equals(storageAccount,"Storage Account Added","Verify storage account",true);
}


/*public void cloudServicedropdown() throws Exception{
	//WebElement element= findElement(By.xpath("")).
	List<WebElement> elements = findElements(By.className("vfmThumbnail"));
		
			
}*/
}
