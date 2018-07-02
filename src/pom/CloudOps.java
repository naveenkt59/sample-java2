package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.base.Wait;

import test.webdriver.SonnetElement;

public class CloudOps extends SonnetElement {
	
	public void CloudOpsDesign() throws Exception{
		findElement(By.cssSelector(".designEnviron")).click();
		findElement(By.xpath("//div[@id='roleID']/div/div")).click(Wait.Page_Load);
		findElement(By.xpath("//div[@id='roleID']/div/div/ul/li[2]")).click();
		findElement(By.xpath("//div[@id='roleAtID']/div/div")).click(Wait.Page_Load);
		findElement(By.xpath("//div[@id='roleAtID']/div/div/ul/li[1]")).click();
		findElement(By.xpath("//div[@id='oSys']/div/div")).click(Wait.Page_Load);
		findElement(By.xpath("//div[@id='oSys']/div/div/ul/li[1]")).click();
		findElement(By.cssSelector("#docker0")).click();
		findElement(By.cssSelector("#DockerSelll0")).click();
		findElement(By.cssSelector("#DockerSelll0 li:nth-child(2) dt")).click();
		
		findElement(By.cssSelector("#t_name")).sendKeys("Template1");
		findElement(By.cssSelector("#t_desc")).sendKeys("Template1");
		findElement(By.cssSelector("#save_exit")).click(Wait.Page_Load);
		System.out.println("Success : "+ _Driver.switchTo().alert().getText());
		String Success = _Driver.switchTo().alert().getText();
		String[] SuccessSplit = Success.split("\\s");
	    for (int i=0; i < SuccessSplit.length; i++){
	     // System.out.println(SuccessSplit[i]);
	    //  String OnlyTemplate = SuccessSplit[3];
	    }
	    String OnlyTemplate = SuccessSplit[3];
	    System.out.println("Template saved : " + OnlyTemplate);
	    _Driver.switchTo().alert().accept();
		findElement(By.cssSelector("#sel")).click();
		findElement(By.cssSelector("#sel ul dl:nth-child(1)")).click(Wait.Page_Load);
		findElement(By.cssSelector("#sell")).click(Wait.Page_Load);
		findElement(By.cssSelector("#sells li:nth-child(2)")).click(Wait.Page_Load);
		
		findElement(By.cssSelector("#sel0")).click(Wait.Page_Load);
		findElement(By.cssSelector("#sels0 li:nth-child(4)")).click(Wait.Page_Load);
		findElement(By.cssSelector("#sell0")).click(Wait.Page_Load);
		findElement(By.cssSelector("#sell0 li:nth-child(2)")).click(Wait.Page_Load);
		findElement(By.xpath("//table[@id='nodeSel0']/tbody/tr[2]/td[1]")).click(Wait.Page_Load);
		_Driver.switchTo().alert().accept();
		
		findElement(By.cssSelector("#selll0")).click(Wait.Page_Load);
		findElement(By.cssSelector("#selll0 li:nth-child(1)")).click(Wait.Page_Load);
		findElement(By.cssSelector("#t_name")).sendKeys("TemplateNode");
		findElement(By.cssSelector("#t_desc")).sendKeys("Template1");
		findElement(By.cssSelector(".saveInfo")).click(Wait.Page_Load);
		findElement(By.cssSelector("#search")).sendKeys(OnlyTemplate, Keys.ENTER);
		findElement(By.xpath("//div[@id="+OnlyTemplate+"]")).click();
		findElement(By.xpath(".//*[@id='dasd_939']/input[3]")).click(Wait.Page_Load);
		
	}
	
	public void DeployNetwork() throws Exception{
		findElement(By.cssSelector(".deployNetworks")).click();
		//chose the details
		findElement(By.cssSelector("#chooseUrCloud>span")).click(Wait.Page_Load);
		findElement(By.cssSelector(".Dev>dl")).click();	
		findElement(By.cssSelector("#chooseRegion>span")).click();
		findElement(By.cssSelector("#chooseRegion>ul>li:nth-child(2)")).click(Wait.Page_Load);
		//create VPC
		findElement(By.xpath("#vpcName")).click();
		findElement(By.xpath("//div[@id='oSys']/div/div")).click(Wait.Page_Load);
		findElement(By.xpath("//div[@id='oSys']/div/div/ul/li[1]")).click();
		findElement(By.cssSelector("#docker0")).click();
		findElement(By.cssSelector("#DockerSelll0")).click();
		findElement(By.cssSelector("#DockerSelll0 li:nth-child(2) dt")).click();
		
	}


}
