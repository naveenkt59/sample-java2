package pom;

import java.awt.Robot;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;


import com.base.Attributes;

import com.base.Wait;

import test.webdriver.SonnetElement;


public class Pipeline extends SonnetElement {
	
	RobotUtil robotUtil=new RobotUtil();
	
	public void downloadTemplate() throws Exception{
		findElement(By.xpath("//a[@class='template-download']")).click(Wait.Page_Load);
	}
	
	public void ct() throws Exception{
		findElement(By.xpath("//li[@class='deployPipeline']/span/i")).click(Wait.Page_Load);
	}
	
    public void seltech() throws Exception{
    	findElement(By.xpath("//input[@value='Java']")).click(Wait.Page_Load);
    	
    }
    
    public void selrep() throws Exception{
    	findElement(By.xpath("//div[@class='techAndRepo']/div[2]/div[2]/label[1]/input")).click(Wait.Page_Load);
    	findElement(By.id("goToPipelineStage")).click(Wait.Page_Load);
    }
    
    public void chosect() throws Exception{
    	
    	
    	findElement(By.xpath("//div[contains(text(),'Choose CT Pipeline')]")).click(Wait.Page_Load);
    	
    	
    	findElement(By.xpath("//div[@id='ctContent']/label[3]/input")).click(Wait.Page_Load);
    	
    }
    public void SelectPipelines() throws Exception{
    	findElement(By.xpath("//div[@id='ciContent']/div/label[5]/input")).click(Wait.Page_Load);
    	findElement(By.xpath(".//*[@id='configure']")).click(Wait.Page_Load);
    	
    }
    public void catchcterr() throws Exception{
    	findElement(By.id("configure")).click(Wait.Page_Load);
    	findElement(By.xpath("//div[@class='alert-body']"));
		Thread.sleep(5000);
		_assert.equals("Select any pipelines","Select CI Pipeline",true);
		findElement(By.xpath("//div[@class='alert-body']")).click();
      
    }
    
    public void pipelineOverview() throws Exception{
    	findElement(By.xpath("//div[@id='ciContent']/div/label[2]/input")).click(Wait.Page_Load);
    	String SelectionOverviewTech=findElement(By.id("selectedTechnology")).getAttribute(Attributes.TEXT);
		_assert.contains(SelectionOverviewTech, "Java", "Technology", true);
		String SelectionOverviewRep=findElement(By.id("selectedRepsository")).getAttribute(Attributes.TEXT);
		_assert.contains(SelectionOverviewRep, "Github", "Code Repository: ", true);
    }
    
  
    public void Configure() throws Exception{
    	findElement(By.id("configure2556662556")).click(Wait.Page_Load);
    	//findElement(By.id("configure")).click(Wait.Page_Load);
    	//findElement(By.xpath("//a[@class='template-download']")).click(Wait.Page_Load);
    //	_Driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	
    //	_Driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	
    	//findElement(By.cssSelector("#jsonFile")).click();
    	
    	
    	
    	
    //	StringSelection ss = new StringSelection("C:\\Users\\mahima.d\\Downloads\\"+robotUtil.getLatestFileName("C:\\Users\\mahima.d\\Downloads").replaceAll(".json",".JSON"));
    	//System.out.println("C:\\Users\\mahima.d\\Downloads\\"+robotUtil.getLatestFileName("C:\\Users\\mahima.d\\Downloads").replaceAll(".json",".JSON"));
    //	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
    	
    	
    	
 /*  Robot robot = new Robot();

    	robot.keyPress(KeyEvent.VK_CONTROL);
    	robot.keyPress(KeyEvent.VK_V);
    	robot.keyRelease(KeyEvent.VK_V);
    	robot.keyRelease(KeyEvent.VK_CONTROL);
    	robot.keyPress(KeyEvent.VK_ENTER);
    	robot.keyRelease(KeyEvent.VK_ENTER);
    		
    	findElement(By.id("uploadFile")).click();
    	findElement(By.id("configureJson")).click(Wait.Page_Load);
    	Thread.sleep(10000);*/
    	
    }
    

   
}
