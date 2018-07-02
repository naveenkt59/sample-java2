package drivers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testng.SonnetTestNGBase;

import testops.BrowserBase;
import testops.Build;
import testops.Environment;
import testops.Project;
import testops.Requirements;
import testops.TestCases;
import testops.TestPlans;
import testops.TestRun;
import testops.TestopsLogin;

public class Testopia extends SonnetTestNGBase{
	BrowserBase bb=new BrowserBase();
	TestopsLogin log=new TestopsLogin();
	Project proj=new Project();
	TestPlans tp=new TestPlans();
	Requirements req=new Requirements();
	TestCases tc=new TestCases();
	TestRun tr=new TestRun();
	Environment env=new Environment();
	Build build=new Build();
	
	@BeforeClass
	public void data() throws Exception{
		log.initializeData();
		proj.datainitialize();
		tp.datainitialize();
		req.datainitialize();
		tc.datainitialize();
		tr.datainitialize();
		build.datainitialize();
		env.datainitialize();
	}
	
	@BeforeMethod
	public void beforeStart() throws Exception{
		bb.setup();
	}

	@Test(priority=1)
	public void createProject() throws Exception{
		_properties.setValue("test_case_id_service", "1105");
		log.login("tc_login");
		proj.projects("tc_login");
		proj.addComponent("tc_login");
		proj.addVersion("tc_login");
	}
	
	@Test(priority=2)
	public void createReq() throws Exception{
		_properties.setValue("test_case_id_service", "77");
		log.login("tc_login");
		tp.goToDashboard();
		req.selectProject();
		req.createReq("tc_login");
	}
	
	@Test(priority=3)
	public void createPlan() throws Exception{
		_properties.setValue("test_case_id_service", "1107");
		log.login("tc_login");
		tp.goToDashboard();
		tp.createPlan("tc_login");
	}
	
	
	
	@Test(priority=4)
	public void createTC() throws Exception{
		_properties.setValue("test_case_id_service", "1108");
		log.login("tc_login");
		tp.goToDashboard();
		tc.goToTC();
		tc.createTC("tc_login");
	}
	@Test(priority=5)
	public void createEnvironment() throws Exception{
		_properties.setValue("test_case_id_service", "1110");
		log.login("tc_login");
		tp.goToDashboard();
		req.selectProject();
		env.createEnv("tc_login");
		
	}
	
	
	@Test(priority=6)
	public void createBuild() throws Exception{
		_properties.setValue("test_case_id_service", "1109");
		log.login("tc_login");
		tp.goToDashboard();
		req.selectProject();
		build.createBuild("tc_login");
		
	}
	
	@Test(priority=7)
	public void createTestRun() throws Exception{
	//	_properties.setValue("test_case_id_service", "1111");
		log.login("tc_login");
		tp.goToDashboard();
		tr.goToTestRun();
		tr.creteRun("tc_login");
	}
	
	
	
	
	
	@AfterMethod
	public void tearDown() throws Exception{
		bb.browserClose();
		}
	
}
