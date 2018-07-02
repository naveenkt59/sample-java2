package pom;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.base.Attributes;
import com.base.Wait;
import com.lib.TestDataSource;

import test.webdriver.SonnetElement;

public class Organization extends SonnetElement{
	TestDataSource login_data=new TestDataSource();

	public void organization() throws Exception{
	
		findElement(By.xpath("//div[@id='singleNavigation']/div[1]/ul/li[2]")).click();
		findElement(By.xpath("//table[@id='getacc']/tbody/tr[1]/td[3]/button[2]")).click(Wait.Page_Load);
		findElement(By.xpath("//div[@id='singleNavigation']/div[2]/ul[1]/li[2]")).click(Wait.Page_Load);
		findElement(By.xpath("//table[@id='projectDetails']/tbody/tr[1]/td[3]/button[1]")).click(Wait.Page_Load);
		Assert.assertEquals(false, true);
	}
	
public void AccountValidation() throws Exception{
	
	//Assert.assertEquals(false, true);
	
	
	findElement(By.xpath("//input[@id='AccountName']")).sendKeys("NegativeTest");
	findElement(By.xpath("//input[@id='AccountId']")).sendKeys("1234");
	findElement(By.xpath("//input[@id='ContactName']")).sendKeys("rapidUser");
	
	findElement(By.xpath("//input[@id='ContactNumber']")).sendKeys(String.valueOf(1234567890));
	
	findElement(By.xpath("//textarea[@id='Notes']")).sendKeys("Newaccount");
	Thread.sleep(3000);

	findElement(By.xpath("//button[@id='accountDetailNext']")).click(Wait.Page_Load);
	String AccountExists=findElement(By.xpath("//span[contains(text(),'The account name RAAPID already exists.')]")).getAttribute(Attributes.TEXT);
	_assert.equals(AccountExists, "hfghfggh", "err", false);
	
	/*findElement(By.xpath("//button[@class='close']")).click(Wait.Page_Load);
	findElement(By.xpath("//input[@id='AccountName']")).sendKeys("JNJ");
	findElement(By.xpath("//button[@id='accountDetailNext']")).click(Wait.Page_Load);*/
		
}
	
	public void AddAccDetails() throws Exception{
      
		Assert.assertEquals(false, true);
		
		findElement(By.xpath("//input[@id='AccountName']")).sendKeys("rrdhytrrr");
		findElement(By.xpath("//input[@id='AccountId']")).sendKeys("1234");
		findElement(By.xpath("//input[@id='ContactName']")).sendKeys("rapidUser");		
		findElement(By.xpath("//input[@id='ContactNumber']")).sendKeys(String.valueOf(1234567890));		
		findElement(By.xpath("//textarea[@id='Notes']")).sendKeys("Newaccount");	
		findElement(By.xpath("//button[@id='accountDetailNext']")).click(Wait.Page_Load);	
		findElement(By.xpath("//div[@id='cloud']/div/form/div/span/span/span/span[1]")).click();
		findElement(By.xpath("//li[contains(text(),'Azure')]")).click(Wait.Page_Load);
		findElement(By.xpath("//div[@id='Azure']/div/div/div[6]/label[contains(text(),'Subscription')]/input")).click();
		findElement(By.id("azureSub")).sendKeys("abc");
		findElement(By.id("userName")).sendKeys("mahima.d@sonata-software.com");
		findElement(By.id("password")).sendKeys("abc");
		findElement(By.id("subId")).sendKeys("sub12");
		Thread.sleep(3000);
		findElement(By.id("file")).click(Wait.Page_Load);
		Thread.sleep(5000);
		StringSelection ss = new StringSelection("C:\\Users\\mahima.d\\Downloads\\mycert.pem");   	
    	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
    	   
    	Robot robot = new Robot();
       	robot.keyPress(KeyEvent.VK_CONTROL);
       	robot.keyPress(KeyEvent.VK_V);
       	robot.keyRelease(KeyEvent.VK_V);
       	robot.keyRelease(KeyEvent.VK_CONTROL);
       	robot.keyPress(KeyEvent.VK_ENTER);
       	robot.keyRelease(KeyEvent.VK_ENTER);
       	
       	Thread.sleep(2000);	
       	findElement(By.xpath(".//*[@id='uploadForm']/div[6]/div/button")).click(Wait.Page_Load);
       		
	}


public void CreateProject() throws Exception{
	
	//To add project details
	findElement(By.xpath("//div[@id='singleNavigation']/div[1]/ul[1]/li[2]")).click(Wait.Page_Load);
	//view ACCOUNT
	findElement(By.xpath("//div[@id='getacc_wrapper']/div[2]/div/table/tbody/tr[1]/td[3]/button[2]")).click(Wait.Page_Load);
	findElement(By.xpath("//input[@id='projectname']")).sendKeys("RapiddTest");
	findElement(By.xpath("//input[@id='description']")).sendKeys("Project for automating rapid");
	
	Select tech=  new Select (_Driver.findElement(By.id("projecttechnology")));
	tech.selectByVisibleText("Java");
	
	findElement(By.xpath("//select[@id='status']/option[2]")).click();
	
	findElement(By.xpath("//button[@id='projectDetailNext']")).click(Wait.Page_Load);
	
	//To add tools
	
	findElement(By.xpath("//div[@class='singleNavigation col-md-10']/div/ul/li[2]/a")).click();
	Select sce = new Select (_Driver.findElement(By.id("selectconfigurationengine")));
	sce.selectByVisibleText("Shell");
	Select scis = new Select (_Driver.findElement(By.id("SelectCIServer")));
	scis.selectByVisibleText("Jenkins");
	Select scc = new Select (_Driver.findElement(By.id("SelectCodecoverage")));
	scc.selectByVisibleText("Sonar Qube");
	findElement(By.id("toolsDetailNext")).click();
	
	}


public void ViewProjects() throws Exception{
	findElement(By.xpath("//div[@id='singleNavigation']/div[1]/ul[1]/li[2]")).click(Wait.Page_Load);
	//view ACCOUNT
	findElement(By.xpath("//div[@id='getacc_wrapper']/div[2]/div/table/tbody/tr[1]/td[3]/button[2]")).click(Wait.Page_Load);
	Thread.sleep(3000);
    findElement(By.xpath("//div[@id='singleNavigation']/div[2]/ul[1]/li[2]")).click(Wait.Page_Load);
    findElement(By.cssSelector("#projectDetails tr:nth-child(1) td:nth-child(3) button:nth-child(1)")).click(Wait.Page_Load);
}
	
}




