package drivers;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testng.SonnetTestNGBase;

import pom.AssignUserRole;
import pom.ChoosePipeline;
import pom.ChooseTools;
import pom.CloudOps;
import pom.DedicatedDevops;
import pom.DevopsDetails;
import pom.DevopsTab;
import pom.Login;
import pom.Organization;
import pom.Page;
import pom.Pipeline;
import pom.PreviewandSave;
import pom.SelectInfrastructure;

public class Demo extends SonnetTestNGBase {

	Page pg = new Page();
	// Object dedDevops to access methods of class DedicatedDevops
	DedicatedDevops dedDevops = new DedicatedDevops();
	Login login = new Login();
	Organization org = new Organization();
	SelectInfrastructure si = new SelectInfrastructure();
	DevopsDetails dd = new DevopsDetails();
	ChoosePipeline cp = new ChoosePipeline();
	DevopsTab dt = new DevopsTab();
	ChooseTools ct = new ChooseTools();
	PreviewandSave ps = new PreviewandSave();
	Pipeline pipe = new Pipeline();
	AssignUserRole aur = new AssignUserRole();
	CloudOps co = new CloudOps();

	@BeforeClass
	public void data() throws Exception {
		// pg.datainitialize();
		login.datainitialize();
	}

	@BeforeMethod
	public void openBrowser() throws Exception {
		pg.setup();

	}

	@AfterMethod(groups = { "Smoke", "Regression", "Functional" })
	public void exit() {
		pg.closeBrowser();
	}

	@Test(priority=1,groups={"Smoke","Regression","Functional"},description="Organisation",enabled=true)
	public void TC_01() throws Exception{
		_properties.setValue("test_case_id_service", 75);
		login.DevLogin("tc_one");
	    org.AccountValidation();
	}

	@Test(priority = 2, groups = { "Smoke", "Regression","Functional" }, description = "Pass Test case", enabled = true)
	public void TC_02() throws Exception {
		_properties.setValue("test_case_id_service", 76);
		login.DevLogin("tc_one");
	    org.ViewProjects();
	    dt.devops();
	    pipe.ct();
	    pipe.seltech();
	    pipe.selrep();
	    pipe.SelectPipelines();

	}
	
	@Test(priority=3,groups={"Smoke","Regression","Functional"},description="Organisation",enabled=true)
	public void TC_03() throws Exception{
		_properties.setValue("test_case_id_service", 77);
		login.DevLogin("tc_one");
	    org.organization();
	}

	

}
