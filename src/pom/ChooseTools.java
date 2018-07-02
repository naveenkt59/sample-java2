package pom;

import org.openqa.selenium.By;

import com.base.Attributes;
import com.base.Wait;

import test.webdriver.SonnetElement;

public class ChooseTools extends SonnetElement {
	public void codeRepo() throws Exception{
		findElement(By.xpath("//input[@value='SVN']")).click(Wait.Page_Load);
		
	}
	public void chooseCodeRepo() throws Exception{
		findElement(By.xpath("//button[@id='stageBuildServer']")).click(Wait.Page_Load);
		
		
	}
	public void verifyCodeRepo() throws Exception{
		String tool=findElement(By.xpath("//section[@class='templates']/div[3]/div/div[2]/div[2]/h7")).getAttribute(Attributes.TEXT);
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
		System.out.println(buildtool);
		_assert.contains(buildtool,"Ant","Verify Build Tool",true);
		
	}
	
	public void verifybuildTool_err() throws Exception{
		String buildTool_err=findElement(By.xpath("//div[@class='alert-body']")).getAttribute(Attributes.TEXT);
		System.out.println(buildTool_err);
		_assert.equals(buildTool_err,"Select any Build Tool","Select any Build Tool",true);
	}
	
	

}
