package pom;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.base.Attributes;
import com.base.Wait;


import test.webdriver.SonnetElement;

//3/26/2018
public class AssignUserRole extends SonnetElement{
	
	//Navigate to settings
	
	
	
	public void settingTab() throws Exception
	{
		findElement(By.xpath("//div[@class='mainNavSection']/ul/li[8]")).click();
	}
	
	public void AddUser() throws Exception{
		findElement(By.xpath("//button[contains(text(),' Add New User')]")).click(Wait.Page_Load);
		Thread.sleep(2000);
		findElement(By.id("userName")).sendKeys("poi@sonata-software.com");
		findElement(By.id("userPassword")).sendKeys("ab@123");	
		findElement(By.xpath("//form[@id='addusersform']/div[4]/div/select/option[1]")).click(Wait.Page_Load);
		findElement(By.xpath("//form[@id='addusersform']/div[5]/div/select/option[1]")).click(Wait.Page_Load);
		findElement(By.id("addusers")).click();	
		Thread.sleep(2000);
		
	/*	List<WebElement> Pagination = _Driver.findElements(By.xpath("//ul[@class='pagination']/li/a"));
		System.out.println("Pages = "+Pagination.size());
		
		for(int i=3;i<=Pagination.size()-1;i++){
		findElement(By.xpath("//ul[@class='pagination']/li["+i+"]/a")).click(Wait.Page_Load);
	   List<WebElement> NewUser = _Driver.findElements(By.xpath("//table[@id='userTable']/tbody/tr/td[1]"));
	   
	   for(int k=0;k<NewUser.size();k++){
		   String user=findElement(By.xpath("//table[@id='userTable']/tbody/tr["+(k+1)+"]/td[1]")).getAttribute(Attributes.TEXT);
		   System.out.println("added users="+user);
			//_assert.equals(user ,"vk3@sonata-software.com" , "New user added successfully" , true);
		_assert.equals("user", "done", "mmmm@sonta-software.com", true);
		

			             }
             }*/
		
		
	}
	
	public void AddExistingUser() throws Exception{
		
		findElement(By.xpath("//button[contains(text(),' Add New User')]")).click(Wait.Page_Load);
		Thread.sleep(2000);
		findElement(By.id("userName")).sendKeys("ooo@sonata-software.com");
		findElement(By.id("userPassword")).sendKeys("ab@123");	
		findElement(By.xpath("//form[@id='addusersform']/div[4]/div/select/option[1]")).click(Wait.Page_Load);
		findElement(By.xpath("//form[@id='addusersform']/div[5]/div/select/option[1]")).click(Wait.Page_Load);
		findElement(By.id("addusers")).click();	
		Thread.sleep(2000);	
		String war = findElement(By.id("addmessgae")).getAttribute(Attributes.TEXT);
		System.out.println("Warning : "+ war);
		_assert.equals(true , true ,"User Already Exists", true);
		
	}
	
public void AddUserMultiAcc() throws Exception{
		
		findElement(By.xpath("//button[contains(text(),' Add New User')]")).click();
		findElement(By.id("userName")).sendKeys("m.d@sonata-software.com");
		findElement(By.id("userPassword")).sendKeys("ab@123");
		Thread.sleep(2000);
	
		findElement(By.xpath("//span[@class='selection']/span/ul")).click();
		List<WebElement>  acc = _Driver.findElements(By.xpath ("//ul[@id='select2-getAllAcc-results']/li"));
		System.out.println("accsize= "+acc.size());
		for(int i=1;i<=2;i++)
		{
			findElement(By.xpath("//ul[@id='select2-getAllAcc-results']/li["+i+"]")).click();
			_Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			findElement(By.xpath("//span[@class='selection']/span/ul")).click();
		}
		
		findElement(By.id("addusers")).click();
		
	}
	
	
	public void EditUser() throws Exception{
		findElements(By.cssSelector("")).click(Wait.Page_Load);
		Thread.sleep(9000);
		
		/*List<WebElement>  editbtn = _Driver.findElements(By.xpath ("//table[@id='userTable']/tbody/tr/td[4]/button[1]"));
		System.out.println("No of users = "+editbtn.size());
		for(int i=1;i==2;i++)
		{tr:nth-child(1) .assign-assignButton:nth-child(1)
			findElement(By.xpath("//table[@id='userTable']/tbody/tr["+i+"]/td[4]/button[1]")).click();
			
			findElement(By.xpath("//form[@id='editUserForm']/div[3]/div/span")).click();
		
			findElement(By.xpath("//span[@class='select2-results']/ul/li[5]")).click();
		}*/
}
           
		
	 
	public void AssignRole() throws Exception{
		List<WebElement>  rows = _Driver.findElements(By.xpath ("//table[@class='assigningUsers']/tbody/tr[2]/td/table/tr/td[1]"));
		
		
        for(int i=1;i<=rows.size();i++){
		  findElement(By.xpath("//table[@class='assigningUsers']/tbody/tr[2]/td/table/tr["+i+"]/td[3]/button")).click();
          Select newrole=new Select(_Driver.findElement(By.id("userRoleDrpDwn")));
          newrole.selectByVisibleText("infra_design");
		  findElement(By.xpath("//a[contains(text(),'Cancel')]")).click();
        }
			}


	public void DeleteUser() throws Exception{
		findElements(By.cssSelector ("button[id*='303']")).click(Wait.Page_Load);
		
		/*List<WebElement>  rows = _Driver.findElements(By.xpath ("//table[@id='userTable']/tbody/tr/td[4]/button[2]"));
		for(int i=1;i<=2;i++)
		{
			findElement(By.xpath("//table[@id='userTable']/tbody/tr["+i+"]/td[4]/button[2]")).click(Wait.Page_Load);
			_Driver.switchTo().alert().accept();
			
		}
		Thread.sleep(9000);*/
		
	}
	
	public void SelectAccError() throws Exception{
		
		List<WebElement>  rows = _Driver.findElements(By.xpath ("//table[@id='userTable']/tbody/tr/td[4]/button[1]"));
		System.out.println("rolesize= "+rows.size());
		for(int i=1;i<=1;i++)
		{
			findElement(By.xpath("//table[@id='userTable']/tbody/tr["+i+"]/td[4]/button[1]")).click();
		
			findElement(By.xpath("//form[@id='editUserForm']/div[3]/div/span/span/span/ul/li[1]/span")).click(Wait.Page_Load);
			findElement(By.xpath("//form[@id='editUserForm']")).click(Wait.Page_Load);
			Thread.sleep(2000);
			findElement(By.xpath("//body[@id='bg']/div[8]/div/div/div[2]/form/div[4]/div/button[2]")).click(Wait.Page_Load);
			Thread.sleep(3000);
	}
	}}
	
	


