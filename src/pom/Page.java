package pom;



import org.openqa.selenium.By;

import org.openqa.selenium.Keys;


import com.base.Attributes;
import com.base.Wait;
import com.lib.TestDataSource;
import com.lib.data.DataFormat;


import test.webdriver.SonnetElement;

public class Page extends SonnetElement  {
	
/* To read test data from external file */
	TestDataSource data=new TestDataSource();
	
	public void datainitialize() throws Exception{
		String csvpath=_properties.getValue("data");
	
		data.open(DataFormat.CSV,csvpath);
		
	}
	
	/*To launch browser*/
	public void setup() throws Exception{
		
		invokeBrowser(_properties.getValue("browser_name"));
	}

	
	public void login_01() throws Exception
	{
		data.SetFilterTo(1);
		navigateTo(_properties.getValue("url"));
		findElement(By.xpath("//input[@id='userName_Input_Id']")).sendKeys(data.GetData("username"));
		Thread.sleep(2000);
		findElement(By.xpath("//input[@id='passWord_Input_Id']")).sendKeys(data.GetData("password"));
		Thread.sleep(2000);
		findElement(By.xpath("//button[@id='login_Button']")).click(Wait.Page_Load);
		Thread.sleep(3000);
		_assert.contains(_Driver.getCurrentUrl(), "accounts", "Accounts Page", true);
		
		
		
	}
	
	
	//Verify login functionality by entering valid username and invalid password
	public void login_02() throws Exception{
		data.SetFilterTo(2);
		navigateTo(_properties.getValue("url"));
		findElement(By.xpath("//input[@id='userName_Input_Id']")).sendKeys(data.GetData("username"));
		findElement(By.xpath("//input[@id='passWord_Input_Id']")).sendKeys(data.GetData("password"));
		findElement(By.xpath("//button[@id='login_Button']")).click(Wait.Page_Load);	
		String alert2=findElement(By.xpath("//div[@class='alert alert-danger']/summary")).getAttribute(Attributes.TEXT);
		_assert.contains(alert2, "User name and Password is not matching..!!", "Invalid Password",true);
	}
	
	
	//Verify login functionality by entering invalid username and invalid password
		public void login_03() throws Exception{
			data.SetFilterTo(3);
			navigateTo(_properties.getValue("url"));
			findElement(By.xpath("//input[@id='userName_Input_Id']")).sendKeys(data.GetData("username"));
			findElement(By.xpath("//input[@id='passWord_Input_Id']")).sendKeys(data.GetData("password"));
			findElement(By.xpath("//button[@id='login_Button']")).click(Wait.Page_Load);	
			String alert3=findElement(By.xpath("//div[@class='alert alert-danger']/summary")).getAttribute(Attributes.TEXT);
			_assert.contains(alert3, "User name and Password is not matching..!!", "Invalid Credentials",true);
			
			
			
			
			
		}
	
	
		public void login_04() throws Exception{
			data.SetFilterTo(4);
			navigateTo(_properties.getValue("url"));
			findElement(By.xpath("//input[@id='userName_Input_Id']")).sendKeys(data.GetData("username"));
			findElement(By.xpath("//input[@id='passWord_Input_Id']")).sendKeys(data.GetData("password"));
			findElement(By.xpath("//button[@id='login_Button']")).click(Wait.Page_Load);	
			String alert3=findElement(By.xpath("//div[@class='alert alert-danger']/summary")).getAttribute(Attributes.TEXT);
			_assert.contains(alert3, "User name and Password is not matching..!!", "Invalid Credentials",true);
		}
		
		
		public void login_05() throws Exception{
			data.SetFilterTo(1);
			navigateTo(_properties.getValue("url"));
			findElement(By.xpath("//input[@id='userName_Input_Id']")).sendKeys(data.GetData("username"));
			findElement(By.xpath("//input[@id='passWord_Input_Id']")).sendKeys(data.GetData("password"));
			_WebElement.sendKeys(Keys.ENTER);
			
			Thread.sleep(3000);
			_assert.contains(_Driver.getCurrentUrl(), "accounts", "Accounts Page", true);
			
		}
		
		//Verify login functionality by entering valid username and invalid password(Enter Key)
		public void login_06() throws Exception{
			data.SetFilterTo(2);
			navigateTo(_properties.getValue("url"));
			findElement(By.xpath("//input[@id='userName_Input_Id']")).sendKeys(data.GetData("username"));
			findElement(By.xpath("//input[@id='passWord_Input_Id']")).sendKeys(data.GetData("password"));
			_WebElement.sendKeys(Keys.ENTER);
			
		//Boolean ispresent=_WebElement.findElements(By.xpath("//div[@class='alert alert-danger']")).size()>0;
			_assert.contains(_Driver.getCurrentUrl(), "accounts", "Accounts Page", true);
		}
		
		//Verify login functionality by entering invalid username and invalid password(Enter Key)
		public void login_07() throws Exception{
			data.SetFilterTo(3);
			navigateTo(_properties.getValue("url"));
			findElement(By.xpath("//input[@id='userName_Input_Id']")).sendKeys(data.GetData("username"));
			findElement(By.xpath("//input[@id='passWord_Input_Id']")).sendKeys(data.GetData("password"));
			_WebElement.sendKeys(Keys.ENTER);
			
		//Boolean ispresent=_WebElement.findElements(By.xpath("//div[@class='alert alert-danger']")).size()>0;
			_assert.contains(_Driver.getCurrentUrl(), "accounts", "Accounts Page", true);
		}
		
		//Verify if user is able to login by entering invalid username and valid password(Enter)
		public void login_08() throws Exception{
			data.SetFilterTo(4);
			navigateTo(_properties.getValue("url"));
			findElement(By.xpath("//input[@id='userName_Input_Id']")).sendKeys(data.GetData("username"));
			findElement(By.xpath("//input[@id='passWord_Input_Id']")).sendKeys(data.GetData("password"));
			_WebElement.sendKeys(Keys.ENTER);
			
		//Boolean ispresent=_WebElement.findElements(By.xpath("//div[@class='alert alert-danger']")).size()>0;
			_assert.contains(_Driver.getCurrentUrl(), "accounts", "Accounts Page", true);
		}
		
		
		public void login_09() throws Exception
		{
			
			navigateTo(_properties.getValue("url"));
			
			findElement(By.xpath("//button[@id='login_Button']")).click(Wait.Page_Load);
			String alert9=findElement(By.xpath("//div[@class='alert alert-danger']/summary")).getAttribute(Attributes.TEXT);
			_assert.contains(alert9, "User name and Password is not matching..!!", "Invalid Login",true);
			
		}
		
		
		
		public void login_10() throws Exception
		{
			data.SetFilterTo(1);
			navigateTo(_properties.getValue("url"));
			findElement(By.xpath("//input[@id='passWord_Input_Id']")).sendKeys(data.GetData("password"));
			findElement(By.xpath("//button[@id='login_Button']")).click(Wait.Page_Load);
			String alert10=findElement(By.xpath("//div[@class='alert alert-danger']/summary")).getAttribute(Attributes.TEXT);
			_assert.contains(alert10, "User name and Password is not matching..!!", "Invalid Login",true);
			
		}
		
		
		public void login_11() throws Exception
		{
			data.SetFilterTo(1);
			navigateTo(_properties.getValue("url"));
			findElement(By.xpath("//input[@id='userName_Input_Id']")).sendKeys(data.GetData("username"));
			findElement(By.xpath("//button[@id='login_Button']")).click(Wait.Page_Load);
			String alert10=findElement(By.xpath("//div[@class='alert alert-danger']/summary")).getAttribute(Attributes.TEXT);
			_assert.contains(alert10, "User name and Password is not matching..!!", "Invalid Login",true);
			
		}
		
		
		public void login_12() throws Exception
		{
			data.SetFilterTo(1);
			navigateTo(_properties.getValue("url"));
			findElement(By.xpath("//input[@id='userName_Input_Id']")).sendKeys(data.GetData("username"));
			findElement(By.cssSelector(".redLinks.pull-right")).click(Wait.Page_Load);
			_assert.equals("No Action", "Reset Pasword screen", "Reset Password", true);
			
		}
	//Navigates to DevOps tab	
	public void devops() throws Exception{
		System.out.println(getCurrentUrl());
		findElement(By.xpath("//li[@class='devopsTab']")).click(Wait.Page_Load);
		
	}
	
	
	//Select account and project
	public void organization() throws Exception{
		findElement(By.xpath("//div[@id='typeDro']")).click(Wait.Page_Load);
		//Sonata Account
		findElement(By.xpath(".//*[@id='accounts_ID']/li[1]/dl")).click(Wait.Page_Load);
		//Select Project
		findElement(By.xpath("//li[@id='acProducts']/table/tbody/tr[3]/td[1]/a")).click(Wait.Page_Load);
		Thread.sleep(5000);
		String CloudOpspage=_Driver.getCurrentUrl();
		_assert.contains(CloudOpspage, "master_2", "Organization Page", true);
}
	
	
	//Select devOps template
	public void selectTemplate() throws Exception{
		findElement(By.xpath("//div[@class='stage-infrastructure']/div[1]")).click(Wait.Page_Load);
		findElement(By.xpath("//button[@id='stageDevOps']")).click(Wait.Page_Load);
		String devdetails=findElement(By.xpath(".//*[@id='DevOpsStages']/ol/li[2]/span")).getAttribute(Attributes.TEXT);
		System.out.println(devdetails);
		_assert.equals(devdetails, "DEVOPS DETAILS","Select Template", true);
		Thread.sleep(5000);
	}
	
	//Verfy error message on trying to proceed without selecting template
	public void selectTemplate_err() throws Exception{
		findElement(By.xpath("//button[@id='stageDevOps']")).click(Wait.Page_Load);
		Thread.sleep(5000);
		String abc= findElement(By.xpath("//div[@class='alert-body']")).getAttribute(Attributes.TEXT);
		_assert.equals(abc, "Select Some tile","Select Template", true);
		}
	
	public void selectTechnology() throws Exception{
		findElement(By.xpath("//input[@value='Java']")).click(Wait.Page_Load);
		
	}
	
	public void verifyTechnology() throws Exception{
		String tech=findElement(By.xpath("//div[@class='devdetail-overview']/h7[1]")).getAttribute(Attributes.TEXT);
		_assert.contains(tech, "Java", "Technology", true);
	}
	
	public void devopsDetails() throws Exception{
		findElement(By.cssSelector("#stagePipeline")).click(Wait.Page_Load);
	}
	
	
	public void selectTechnology_err() throws Exception{
		findElement(By.cssSelector("#stagePipeline")).click(Wait.Page_Load);
		String alert=findElement(By.cssSelector(".alert-body")).getAttribute(Attributes.TEXT);
		_assert.equals(alert, "Select any Technology", "Select any Technology", true);
	}
	
	
	public void selectCI() throws Exception{
		findElement(By.cssSelector("#stagePipeline")).click(Wait.Page_Load);
		Thread.sleep(3000);
		
	}
	
	public void verifyCI() throws Exception{
		String ci=findElement(By.xpath("//div[@class='devdetail-overview']/h7[2]")).getAttribute(Attributes.TEXT);
		_assert.contains(ci, "DevOps Type : Continuous Integration", true);
		
		
	}
	
	public void selectCD() throws Exception{
		
		findElement(By.xpath("//img[@src='/images_1/cd.jpg']")).click(Wait.Page_Load);;
			
	}
	
	public void verifyCD() throws Exception{
		String cd=findElement(By.xpath("//div[@class='devdetail-overview']/h7[2]")).getAttribute(Attributes.TEXT);
		_assert.contains(cd, "DevOps Type : Continuous Integration, Continuous Testing, Continuous Delivery","Continuous Delivery", true);
	}
	
	
	
	
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
		String cd_err=findElement(By.xpath("//div[@class='modal-body ']/div")).getAttribute(Attributes.TEXT);
		_assert.equals(cd_err,"Select maximum pipelines in CT pipeline","Select CD without CT",true);
		
	}
	
	public void codeRepo() throws Exception{
		findElement(By.xpath("//input[@value='SVN']")).click(Wait.Page_Load);
		
	}
	public void chooseCodeRepo() throws Exception{
		findElement(By.xpath("//button[@id='stageBuildServer']")).click(Wait.Page_Load);
		
	}
	public void verifyCodeRepo() throws Exception{
		String tool=findElement(By.xpath("//div[@class='tools-overview']/h7")).getAttribute(Attributes.TEXT);
		_assert.contains(tool, "SVN", "Code Repository",true);
		
	}
	
	public void codeRepo_err() throws Exception{
		String codeReperr=findElement(By.xpath("//div[@class='modal-body ']/div")).getAttribute(Attributes.TEXT);
		System.out.println(codeReperr);
		_assert.equals(codeReperr,"Select any Code Repository","Select any Code Repository",true);
	}
	
	public void buildServer() throws Exception{
		findElement(By.xpath("//input[@value='Jenkins']")).click(Wait.Page_Load);
		
	}
	
	public void choosebuildServer() throws Exception{
		findElement(By.xpath("//button[@id='stageBuildTool']")).click(Wait.Page_Load);
	}
	
	public void vm() throws Exception{
		findElement(By.xpath(".//*[@id='view_temp']/section/div[6]/div[2]/div[2]/label[1]/input")).click(Wait.Page_Load);
		
	}
	
	public void verifybuildServer() throws Exception{
		String buildserver=findElement(By.xpath("//div[@class='build-server-overview']/h7")).getAttribute(Attributes.TEXT);
		_assert.contains(buildserver,"Jenkins","Select Build Server",true);
	}
	
	public void buildServer_err() throws Exception{
		String buildserver_err=findElement(By.xpath("//div[@class='alert-body']")).getAttribute(Attributes.TEXT);
		System.out.println(buildserver_err);
		_assert.equals(buildserver_err,"Select any Build Server","Select any Build Server",true);
	}
	
	public void buildTool() throws Exception{
		findElement(By.xpath("//input[@value='Ant']")).click(Wait.Page_Load);
	}
	
	public void choosebuildTool() throws Exception{
		findElement(By.xpath("//button[@id='stagePreviewSave']")).click(Wait.Page_Load);
	}
	
	public void verifybuildTool() throws Exception{
		String buildtool=findElement(By.xpath("//div[@class='preview-save-overview']/h7")).getAttribute(Attributes.TEXT);
		//System.out.println(buildtool);
		_assert.contains(buildtool,"Ant","Verify Build Tool",true);
	}
	
	public void verifybuildTool_err() throws Exception{
		String buildTool_err=findElement(By.xpath("//div[@class='alert-body']")).getAttribute(Attributes.TEXT);
		System.out.println(buildTool_err);
		_assert.equals(buildTool_err,"Select any Build Tool","Select any Build Tool",true);
	}
	
	public void saveDesign() throws Exception{
		findElement(By.xpath("//button[@id='stage6']")).click(Wait.Page_Load);
	}
	
	public void verifyDesign() throws Exception{
		Thread.sleep(5000);
		_assert.contains(_Driver.getCurrentUrl(),"viewDevOpsTemplate","Preview and Save DevOps",true);
	}
}
