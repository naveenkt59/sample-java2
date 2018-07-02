package pom;

import java.util.Iterator;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


import com.base.Attributes;
import com.base.Wait;
import com.lib.TestDataSource;
import com.lib.data.DataFormat;

import test.webdriver.SonnetElement;

public class Login extends SonnetElement {
TestDataSource login_data=new TestDataSource();
TestDataSource Password_data=new TestDataSource();
	
	public void datainitialize() throws Exception{
		/*String csvpath=_properties.getValue("data");
		login_data.open(DataFormat.CSV,csvpath);*/
		login_data.open(DataFormat.Excel, _properties.getValue("login_data"), _properties.getValue("sheet_name"), 1);
		
		login_data.open(DataFormat.Excel, _properties.getValue("login_data"), _properties.getValue("sheet_pwd"), 1);
		
	}
	
	
	
	
	

	public void login_QA() throws Exception{
		login_data.SetFilterTo(1);
		_Driver.manage().deleteAllCookies();
		navigateTo(_properties.getValue("url"));
		
		findElement(By.xpath("//input[@id='userName_Input_Id']")).sendKeys("sangamesh.b@sonata-software.com");
		findElement(By.xpath(".//*[@id='passWord_Input_Id']")).sendKeys("Google12#4");
		_Driver.findElement(By.xpath(".//*[@id='bg']/table/tbody/tr/td/div/section/main/img")).click();
		Thread.sleep(4000);
		
		String parenthandle= _Driver.getWindowHandle();
		System.out.println(parenthandle);
		Set<String> handles=_Driver.getWindowHandles();
		System.out.println(handles);
		
		for(String handle: handles)
		{
			//System.out.println("I am after for");
			if(!handle.equals(parenthandle))
			{
				
				//System.out.println("I am here");
				_Driver.switchTo().window(handle);
				//_Driver.manage().deleteAllCookies();
				Thread.sleep(3000);
				_Driver.findElement(By.xpath("//*[@id='cred_userid_inputtext']")).clear();
				_Driver.findElement(By.xpath("//*[@id='cred_userid_inputtext']")).sendKeys(login_data.GetData("username"));
				Thread.sleep(3000);
				_Driver.findElement(By.xpath("//*[@id='cred_password_inputtext']")).clear();
				_Driver.findElement(By.xpath("//*[@id='cred_password_inputtext']")).sendKeys(login_data.GetData("password"));
				Thread.sleep(3000);
				_Driver.findElement(By.xpath("//*[@id='cred_sign_in_button']")).click();
				Thread.sleep(3000);
				 //_assert.contains(_Driver.getCurrentUrl(),"accounts","Login successful",true);
				//System.out.println("Switching to parent window");
				 Thread.sleep(3000);
				_Driver.switchTo().window(parenthandle);
			}
		}
		
		
	}
	
	
	
	
	
	
	public void login_QA_01(String tc_id) throws Exception{
		login_data.SetFilterTo(tc_id);
		
		_Driver.manage().deleteAllCookies();
		Thread.sleep(3000);
		navigateTo(_properties.getValue("url"));
		findElement(By.xpath(".//*[@id='bg']/table/tbody/tr/td/div/section/main/img")).click(Wait.Page_Load);
		Thread.sleep(3000);
		
		String  parent= _Driver.getWindowHandle();
		System.out.println(parent);
		Set<String> handles= _Driver.getWindowHandles();
		System.out.println(handles);
		Thread.sleep(3000);
		
		
		
		Iterator<String> I1= handles.iterator();
		while(I1.hasNext())
		{
		 
		   String child_window=I1.next();
		   if(!parent.equals(child_window))
		   {
		   _Driver.switchTo().window(child_window);
		    
		   System.out.println(_Driver.switchTo().window(child_window).getTitle());
		   
		   Thread.sleep(2000);
		   findElement(By.xpath("//input[@id='i0116']")).sendKeys(login_data.GetData("rapidun"));
		
		  findElement(By.xpath("//input[@id='idSIButton9']")).click();;
		
		  Thread.sleep(2000);
		  findElement(By.xpath("//input[@id='i0118']")).sendKeys(login_data.GetData("rapidpwd"));
		  
		  Thread.sleep(2000);
		  findElement(By.xpath("//input[@id='idSIButton9']")).click(Wait.Page_Load);
		  // findElement(By.cssSelector("button[id='cred_sign_in_button']")).click(Wait.Page_Load);
		
		   Thread.sleep(2000);
		   _assert.contains(_Driver.getCurrentUrl(),"login.microsoftonline.com","Invalid Login",true);
		   _Driver.switchTo().window(parent);
		   
		
		   }
		
		
	}
		
		
	}
	
	
	
	
	public void login_QA_02(String tc_id) throws Exception{
    	login_data.SetFilterTo(tc_id);
		
		_Driver.manage().deleteAllCookies();
		
		navigateTo(_properties.getValue("url"));
		findElement(By.xpath(".//*[@id='bg']/table/tbody/tr/td/div/section/main/img")).click(Wait.Page_Load);
		Thread.sleep(3000);
		
		String  parent= _Driver.getWindowHandle();
		System.out.println(parent);
		Set<String> handles= _Driver.getWindowHandles();
		System.out.println(handles);
		Thread.sleep(3000);
		
		
		
		Iterator<String> I1= handles.iterator();
		while(I1.hasNext())
		{
		 
		   String child_window=I1.next();
		   if(!parent.equals(child_window))
		   {
		   _Driver.switchTo().window(child_window);
		    
		   System.out.println(_Driver.switchTo().window(child_window).getTitle());
		  Thread.sleep(2000);
		  findElement(By.xpath("//input[@id='i0116']")).sendKeys(login_data.GetData("rapidun"));
		  Thread.sleep(2000);
		  findElement(By.xpath("//input[@id='idSIButton9']")).click();
		  Thread.sleep(2000);
		  findElement(By.xpath("//input[@id='i0118']")).sendKeys(login_data.GetData("rapidpwd"));
		  Thread.sleep(2000);
		  
		   findElement(By.cssSelector("//input[@id='idSIButton9']")).click(Wait.Page_Load);
		   Thread.sleep(2000);
		   _assert.contains(_Driver.getCurrentUrl(),"login.microsoftonline.com","Invalid Login",true);
		   
		   _Driver.switchTo().window(parent);
		   
		   System.out.println(_Driver.getCurrentUrl());
		
		   }
		
		
	}
		
		
	}
	
	
	
	public void login_QA_03() throws Exception{
		login_data.SetFilterTo(5);
		
		_Driver.manage().deleteAllCookies();
		navigateTo(_properties.getValue("url"));
		findElement(By.xpath(".//*[@id='bg']/table/tbody/tr/td/div/section/main/img")).click(Wait.Page_Load);
		Thread.sleep(3000);
		
		String  parent= _Driver.getWindowHandle();
		System.out.println(parent);
		Set<String> handles= _Driver.getWindowHandles();
		System.out.println(handles);
		Thread.sleep(3000);
		
		
		
		Iterator<String> I1= handles.iterator();
		while(I1.hasNext())
		{
		 
		   String child_window=I1.next();
		   if(!parent.equals(child_window))
		   {
		   _Driver.switchTo().window(child_window);
		    
		   System.out.println(_Driver.switchTo().window(child_window).getTitle());
		   
		  findElement(By.xpath("//input[@id='cred_userid_inputtext']")).sendKeys(login_data.GetData("username"));
		  Thread.sleep(2000);
		  findElement(By.xpath("//input[@id='cred_password_inputtext']")).sendKeys(login_data.GetData("password"));
		  Thread.sleep(2000);
		 
		   findElement(By.cssSelector("button[id='cred_sign_in_button']")).click(Wait.Page_Load);
		   Thread.sleep(2000);
		   _assert.contains(_Driver.getCurrentUrl(),"login.microsoftonline.com","Invalid Login",true);
		   _Driver.switchTo().window(parent);
		   
		   System.out.println(_Driver.getCurrentUrl());
		
		   }
		
		
	}
		
		
	}
	
	
	
	public void login_QA_04(String tc_id) throws Exception{
		login_data.SetFilterTo(tc_id);
		
	_Driver.manage().deleteAllCookies();
		navigateTo(_properties.getValue("url"));
		findElement(By.xpath(".//*[@id='bg']/table/tbody/tr/td/div/section/main/img")).click(Wait.Page_Load);
		Thread.sleep(3000);
		
		String  parent= _Driver.getWindowHandle();
		System.out.println(parent);
		Set<String> handles= _Driver.getWindowHandles();
		System.out.println(handles);
		Thread.sleep(3000);
		
		
		
		Iterator<String> I1= handles.iterator();
		while(I1.hasNext())
		{
		 
		   String child_window=I1.next();
		   if(!parent.equals(child_window))
		   {
		   _Driver.switchTo().window(child_window);
		    
		   System.out.println(_Driver.switchTo().window(child_window).getTitle());
	
		   findElement(By.xpath("//input[@id='i0116']")).sendKeys(login_data.GetData("rapidun"));
		  Thread.sleep(2000);
		   findElement(By.xpath("//input[@id='idSIButton9']")).click();
		   Thread.sleep(2000);
		  findElement(By.xpath("//input[@id='i0118']")).sendKeys(login_data.GetData("password"));
		  findElement(By.xpath("//input[@id='idSIButton9']")).click(Wait.Page_Load);
		  Thread.sleep(2000);
		 _assert.contains(_Driver.getCurrentUrl(),"accounts","Login successful",true);
		   _Driver.switchTo().window(parent);
		   
		 
		
		   }
		
		
	}
		
		
	}
	
	
	public void login_QA_05() throws Exception{
		login_data.SetFilterTo(2);
		
		_Driver.manage().deleteAllCookies();
		navigateTo(_properties.getValue("url"));
		findElement(By.xpath(".//*[@id='bg']/table/tbody/tr/td/div/section/main/img")).click(Wait.Page_Load);
		Thread.sleep(3000);
		
		String  parent= _Driver.getWindowHandle();
		System.out.println(parent);
		Set<String> handles= _Driver.getWindowHandles();
		System.out.println(handles);
		Thread.sleep(3000);
		
		
		
		Iterator<String> I1= handles.iterator();
		while(I1.hasNext())
		{
		 
		   String child_window=I1.next();
		   if(!parent.equals(child_window))
		   {
		   _Driver.switchTo().window(child_window);
		    
		   System.out.println(_Driver.switchTo().window(child_window).getTitle());
		   
		  findElement(By.xpath("//input[@id='cred_userid_inputtext']")).sendKeys(login_data.GetData("rapidun"));
		  Thread.sleep(2000);
		  findElement(By.xpath("//input[@id='idSIButton9']")).click();
		  findElement(By.xpath("//input[@id='cred_password_inputtext']")).sendKeys(login_data.GetData("rapidpwd"),Keys.ENTER);
		  Thread.sleep(2000);
		  _assert.contains(_Driver.getCurrentUrl(),"login.microsoftonline.com","Invalid Login",true);
		  
		   _Driver.switchTo().window(parent);
		   
	
		   }
		
		
	}
		
		
	}
	
	
	
	public void login_QA_06() throws Exception{
		login_data.SetFilterTo(3);
		
		_Driver.manage().deleteAllCookies();
		navigateTo(_properties.getValue("url"));
		findElement(By.xpath(".//*[@id='bg']/table/tbody/tr/td/div/section/main/img")).click(Wait.Page_Load);
		Thread.sleep(3000);
		
		String  parent= _Driver.getWindowHandle();
		System.out.println(parent);
		Set<String> handles= _Driver.getWindowHandles();
		System.out.println(handles);
		Thread.sleep(3000);
		
		
		
		Iterator<String> I1= handles.iterator();
		while(I1.hasNext())
		{
		 
		   String child_window=I1.next();
		   if(!parent.equals(child_window))
		   {
		   _Driver.switchTo().window(child_window);
		    
		   System.out.println(_Driver.switchTo().window(child_window).getTitle());
		   
		  findElement(By.xpath("//input[@id='cred_userid_inputtext']")).sendKeys(login_data.GetData("username"));
		  Thread.sleep(2000);
		  findElement(By.xpath("//input[@id='cred_password_inputtext']")).sendKeys(login_data.GetData("password"),Keys.ENTER);
		  Thread.sleep(2000);
		  
		  _assert.contains(_Driver.getCurrentUrl(),"login.microsoftonline.com","Invalid Login",true);
		   _Driver.switchTo().window(parent);
		   
		   
		
		   }
		
		
	}
		
		
	}
	
	
	public void login_QA_07() throws Exception{
		login_data.SetFilterTo(4);
		
		_Driver.manage().deleteAllCookies();
		navigateTo(_properties.getValue("url"));
		findElement(By.xpath(".//*[@id='bg']/table/tbody/tr/td/div/section/main/img")).click(Wait.Page_Load);
		Thread.sleep(3000);
		
		String  parent= _Driver.getWindowHandle();
		System.out.println(parent);
		Set<String> handles= _Driver.getWindowHandles();
		System.out.println(handles);
		Thread.sleep(3000);
		
		
		
		Iterator<String> I1= handles.iterator();
		while(I1.hasNext())
		{
		 
		   String child_window=I1.next();
		   if(!parent.equals(child_window))
		   {
		   _Driver.switchTo().window(child_window);
		    
		   System.out.println(_Driver.switchTo().window(child_window).getTitle());
		   
		  findElement(By.xpath("//input[@id='cred_userid_inputtext']")).sendKeys(login_data.GetData("username"));
		  Thread.sleep(2000);
		  findElement(By.xpath("//input[@id='cred_password_inputtext']")).sendKeys(login_data.GetData("password"),Keys.ENTER);
		  Thread.sleep(2000);
		  _assert.contains(_Driver.getCurrentUrl(),"login.microsoftonline.com","Invalid Login",true);
		  
		   _Driver.switchTo().window(parent);
		   
		  
		
		   }
		
		
	}
		
		
	}
	
	
	
	public void login_QA_08() throws Exception{
		login_data.SetFilterTo(4);
		
		_Driver.manage().deleteAllCookies();
		navigateTo(_properties.getValue("url"));
		findElement(By.xpath(".//*[@id='bg']/table/tbody/tr/td/div/section/main/img")).click(Wait.Page_Load);
		Thread.sleep(3000);
	
		String  parent= _Driver.getWindowHandle();
		System.out.println(parent);
		Set<String> handles= _Driver.getWindowHandles();
		System.out.println(handles);
		Thread.sleep(3000);
		
		
		
		Iterator<String> I1= handles.iterator();
		while(I1.hasNext())
		{
		 
		   String child_window=I1.next();
		   if(!parent.equals(child_window))
		   {
		   _Driver.switchTo().window(child_window);
		    
		   System.out.println(_Driver.switchTo().window(child_window).getTitle());
		   
		   Thread.sleep(2000);
		   findElement(By.cssSelector("button[id='cred_sign_in_button']")).click(Wait.Page_Load);
		   Thread.sleep(2000);
		   
		   String err08=findElement(By.xpath("//div[@class='client_error_msg 30127']")).getAttribute(Attributes.TEXT);
		   _assert.contains(err08, "To sign in, start by entering a user ID.","To sign in, start by entering a user ID.",true);
		   _Driver.switchTo().window(parent);
		   
		   
		
		   }
		
		
	}
		
		
	}
	
	
	
	
	public void login_QA_09() throws Exception{
		login_data.SetFilterTo(1);
		
		_Driver.manage().deleteAllCookies();
		navigateTo(_properties.getValue("url"));
		findElement(By.xpath(".//*[@id='bg']/table/tbody/tr/td/div/section/main/img")).click(Wait.Page_Load);
		Thread.sleep(3000);
		
		String  parent= _Driver.getWindowHandle();
		System.out.println(parent);
		Set<String> handles= _Driver.getWindowHandles();
		System.out.println(handles);
		Thread.sleep(3000);
		
		
		
		Iterator<String> I1= handles.iterator();
		while(I1.hasNext())
		{
		 
		   String child_window=I1.next();
		   if(!parent.equals(child_window))
		   {
		   _Driver.switchTo().window(child_window);
		    
		   System.out.println(_Driver.switchTo().window(child_window).getTitle());
		   
		
		  findElement(By.xpath("//input[@id='cred_password_inputtext']")).sendKeys(login_data.GetData("password"));
		  Thread.sleep(2000);
		 
		  findElement(By.cssSelector("button[id='cred_sign_in_button']")).click(Wait.Page_Load);
		  Thread.sleep(2000);
		   
		   String err09=findElement(By.xpath("//div[@class='client_error_msg 30127']")).getAttribute(Attributes.TEXT);
		   _assert.contains(err09, "To sign in, start by entering a user ID.","To sign in, start by entering a user ID.",true);
		   
		   
		   
		   _Driver.switchTo().window(parent);
		   
		   
		
		   }
		
		
	}
		
		
	}
	
	
	
	
	public void login_QA_10() throws Exception{
		login_data.SetFilterTo(1);
		
		_Driver.manage().deleteAllCookies();
		navigateTo(_properties.getValue("url"));
		findElement(By.xpath(".//*[@id='bg']/table/tbody/tr/td/div/section/main/img")).click(Wait.Page_Load);
		Thread.sleep(3000);
		
		String  parent= _Driver.getWindowHandle();
		System.out.println(parent);
		Set<String> handles= _Driver.getWindowHandles();
		System.out.println(handles);
		Thread.sleep(3000);
		
		
		
		Iterator<String> I1= handles.iterator();
		while(I1.hasNext())
		{
		 
		   String child_window=I1.next();
		   if(!parent.equals(child_window))
		   {
		   _Driver.switchTo().window(child_window);
		    
		   System.out.println(_Driver.switchTo().window(child_window).getTitle());
		   
		  findElement(By.xpath("//input[@id='cred_userid_inputtext']")).sendKeys(login_data.GetData("username"));
		  Thread.sleep(2000);
		  
		  findElement(By.cssSelector("button[id='cred_sign_in_button']")).click(Wait.Page_Load);
		  Thread.sleep(2000);
		   
		   
		   String err10=findElement(By.xpath("//div[@class='client_error_msg 30111']")).getAttribute(Attributes.TEXT);
		   _assert.contains(err10, "Please enter your password.","Please enter your password.",true);
		   
		   _Driver.switchTo().window(parent);
		 
		   }
		
	}
		
	}
	
	
	
	public void DevLogin(String tc_id) throws Exception{
		login_data.SetFilterTo(tc_id);
		_Driver.manage().deleteAllCookies();

		navigateTo("http://172.29.79.89:3001");
		findElement(By.xpath("//input[@id='userName_Input_Id']")).sendKeys("mahima.d@sonata-software.com");
		
		_Driver.findElement(By.xpath("//input[@name='password']")).sendKeys(login_data.GetData("password"));
		findElement(By.id("login_Button1")).click(Wait.Page_Load);
	}
	
	public void InvalidLogin(String tc_id) throws Exception{
		login_data.SetFilterTo(tc_id);
		_Driver.manage().deleteAllCookies();

		navigateTo("http://172.29.79.89:3001");

		findElement(By.xpath("//input[@id='me_Input_Id']")).sendKeys("abc1@abc.com");
		_Driver.findElement(By.xpath("//input[@name='password']")).sendKeys(login_data.GetData("password"));
		findElement(By.id("login_Button1")).click(Wait.Page_Load);
	}
	
	
	
	public void LoginL() throws Exception{


	/*login_data.SetFilterTo(1);
	_Driver.manage().deleteAllCookies();*/
	navigateTo("http://172.29.79.64:3000/oauth");
	
	findElement(By.xpath(".//*[@id='userName_Input_Id']")).sendKeys("sangamesh.b@sonata-software.com");
	findElement(By.xpath(".//*[@id='passWord_Input_Id']")).sendKeys("Guide12#4");
	_Driver.findElement(By.xpath(".//*[@id='bg']/table/tbody/tr/td/div/section/main/img")).click();
	Thread.sleep(4000);
	
	String parenthandle= _Driver.getWindowHandle();
	System.out.println(parenthandle);
	Set<String> handles=_Driver.getWindowHandles();
	System.out.println(handles);
	
	for(String handle: handles)
	{
		//System.out.println("I am after for");
		if(!handle.equals(parenthandle))
		{
			
			//System.out.println("I am here");
			_Driver.switchTo().window(handle);
			//_Driver.manage().deleteAllCookies();
			Thread.sleep(3000);
			findElement(By.id("i0116")).sendKeys("test_instance@node1directory.onmicrosoft.com");
			findElement(By.id("idSIButton9")).click(Wait.Page_Load);
			Thread.sleep(8000);
			findElement(By.id("i0118")).sendKeys("Rapid12#4");
			
			findElement(By.id("idSIButton9")).click(Wait.Page_Load);
			Thread.sleep(8000);
			findElement(By.id("idBtn_Back")).click(Wait.Page_Load);
			 Thread.sleep(3000);
		//	_Driver.switchTo().window(parenthandle);
		}
	}
	}}


