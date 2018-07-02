package drivers;

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

public class Driver extends SonnetTestNGBase {
	Page pg=new Page();
	//Object dedDevops to access methods of class DedicatedDevops
	DedicatedDevops dedDevops=new DedicatedDevops();
	Login login=new Login();
	Organization org=new Organization();
	SelectInfrastructure si=new SelectInfrastructure();
	DevopsDetails dd=new DevopsDetails();
	ChoosePipeline cp=new ChoosePipeline();
	DevopsTab dt=new DevopsTab();
	ChooseTools ct=new ChooseTools();
	PreviewandSave ps=new PreviewandSave();
	Pipeline pipe=new Pipeline();
	AssignUserRole aur=new AssignUserRole();
	CloudOps co = new CloudOps();
	
	
@BeforeClass
public void data() throws Exception{
	//pg.datainitialize();
	login.datainitialize();
}
	
@BeforeMethod
public void openBrowser() throws Exception{
	pg.setup();
	
}

/*@AfterMethod(groups={"Smoke","Regression","Functional"})
 
public void exit(){
	pg.closeBrowser();
}*/

/*********05/07/2016*************/

@Test(priority=1,groups={"Smoke","Regression","Functional"},description="Login",enabled=true)
public void TC_53() throws Exception{
	_properties.setValue("test_case_id_service", "1246");
    login.DevLogin("tc_one");
	//dt.devops();
	
}

@Test(priority=2,groups={"Smoke","Regression","Functional"},description="Select Account and Project",enabled=true)
public void TC_36() throws Exception{
	_properties.setValue("test_case_id_service", "1163");	
	login.DevLogin("tc_one");
    org.organization();
}

@Test(priority=3,groups={"Smoke","Regression","Functional"},description="Select Template",enabled=true)
public void TC_01() throws Exception{
	_properties.setValue("test_case_id_service", "1128");
	login.DevLogin("tc_one");
	si.viewProjects();
	dt.devops();
	si.selectTemplate();
	
}

@Test(priority=4,groups={"Smoke","Regression","Functional"},description="Select Template Error",enabled=true)
public void TC_02() throws Exception{
	_properties.setValue("test_case_id_service", "1129");
	login.DevLogin("tc_one");
	si.viewProjects();
	dt.devops();
	si.selectTemplate_err();
	
}


@Test(priority=5,groups={"Smoke","Regression","Functional"},description="Select Technology",enabled=true)
public void TC_03() throws Exception{
	_properties.setValue("test_case_id_service", "1130");
	login.DevLogin("tc_one");
	//org.organization();
	si.viewProjects();
	dt.devops();
	si.selectTemplate();
	pg.selectTechnology();
	pg.devopsDetails();
	pg.verifyTechnology();
}



@Test(priority=6, groups={"Smoke","Regression","Functional"}, description="Login", enabled=true)
public void TC_54() throws Exception{
	_properties.setValue("test_case_id_service", "1181");
	login.login_QA_01("tc_invalidpwd");
	
}

@Test(priority=9, groups={"Smoke","Regression","Functional"}, description="Invalid password", enabled=true)
public void TC_57() throws Exception{
	_properties.setValue("test_case_id_service", "1184");
	login.login_QA_04("tc_invalidpwd");
}
/**
@Test(priority=7, groups={"Smoke","Regression","Functional"}, description="Invalid Credentials", enabled=true)
public void TC_55() throws Exception{
	_properties.setValue("test_case_id_service", "1182");
	login.login_QA_02("tc_invalidcred");
	
}

@Test(priority=8, groups={"Smoke","Regression","Functional"}, description="Invalid Credentials", enabled=true)
public void TC_56() throws Exception{
	_properties.setValue("test_case_id_service", "1183");
	login.login_QA_03();
	
}

	
}
@Test(priority=10, groups={"Smoke","Regression","Functional"}, description="Login", enabled=true)
public void TC_58() throws Exception{
	_properties.setValue("test_case_id_service", "1185");
	login.login_QA_05();
	
}


@Test(priority=11, groups={"Smoke","Regression","Functional"}, description="Login", enabled=true)
public void TC_59() throws Exception{
	_properties.setValue("test_case_id_service", "1186");
	login.login_QA_06();
	
}

@Test(priority=12, groups={"Smoke","Regression","Functional"}, description="Login", enabled=true)
public void TC_60() throws Exception{
	_properties.setValue("test_case_id_service", "1187");
	login.login_QA_07();
	
}

@Test(priority=13, groups={"Smoke","Regression","Functional"}, description="Login", enabled=true)
public void TC_61() throws Exception{
	_properties.setValue("test_case_id_service", "1188");
	login.login_QA_08();
	
}
@Test(priority=14, groups={"Smoke","Regression","Functional"}, description="Invalid Login", enabled=true)
public void TC_62() throws Exception{
	_properties.setValue("test_case_id_service", "1189");
	login.login_QA_09();
	
}

@Test(priority=15, groups={"Smoke","Regression","Functional"}, description="Invalid Login", enabled=true)
public void TC_63() throws Exception{
	_properties.setValue("test_case_id_service", "1190");
	pg.login_11();
	
}

@Test(priority=16, groups={"Smoke","Regression","Functional"}, description="Forgot Password", enabled=true)
public void TC_64() throws Exception{
	_properties.setValue("test_case_id_service", "1706");
	pg.login_12();
	
}**/



/*********06/07/2016*************/
	

@Test(priority=17, groups={"Smoke","Regression","Functional"}, description="Select Technology Error Message", enabled=true)
public void TC_04() throws Exception{
	_properties.setValue("Test_case_id_service", "1131");
	login.DevLogin("tc_one");
	si.viewProjects();
	dt.devops();
	dd.selectTechnology_err();
}

@Test(priority=18, groups={"Smoke","Regression","Functional"}, description="Select CI DevOps", enabled=true)
public void TC_05() throws Exception
{
	_properties.setValue("Test_case_id_service", "1132");
	login.DevLogin("tc_one");
	si.viewProjects();
	dt.devops();
	si.selectTemplate();
	dd.selectTechnology();
	dd.selectCI();
	dd.verifyCI();
}

@Test(priority=19, groups={"Smoke","Regression","Functional"}, description="Select CD DevOps", enabled=true)
public void TC_06() throws Exception
{
	_properties.setValue("Test_case_id_service", "1133");
	login.DevLogin("tc_one");
	si.viewProjects();
	dt.devops();
	si.selectTemplate();
	dd.selectTechnology();
	dd.selectCD();
	dd.devopsDetails();
	dd.verifyCD();
}

@Test(priority=20, groups={"Smoke","Regression","Functional"}, description="Select CI Pipeline", enabled=true)
public void TC_08() throws Exception
{
	_properties.setValue("Test_case_id_service", "1135");
	login.DevLogin("tc_one");
	si.viewProjects();
	dt.devops();
	si.selectTemplate();
	dd.selectTechnology();
	dd.selectCI();
	cp.selectCIPipeline();
	cp.choosePipeline();
	
	
}

@Test(priority=21, groups={"Smoke","Regression","Functional"}, description="Select CD Pipeline", enabled=true)
public void TC_09() throws Exception
{
	_properties.setValue("Test_case_id_service", "1136");
	login.DevLogin("tc_one");
	si.viewProjects();
	dt.devops();
	si.selectTemplate();
	dd.selectTechnology();
	dd.selectCD();
	dd.devopsDetails();
	dd.verifyCD();
	cp.selectCDPipeline();
	
	
}

@Test(priority=22, groups={"Smoke","Regression","Functional"}, description="Select CD Pipeline Error message", enabled=true)
public void TC_12() throws Exception
{
	_properties.setValue("Test_case_id_service", "1139");
	login.DevLogin("tc_one");
	si.viewProjects();
	dt.devops();
	si.selectTemplate();
	dd.selectTechnology();
	dd.selectCD();
	dd.devopsDetails();
	dd.verifyCD();
	cp.selectCDPipeline_err();
	
	
}

@Test(priority=23,groups={"Smoke","Regression","Functional"},description="Select Code Repository", enabled=true)
public void TC_13() throws Exception{
	_properties.setValue("Test_case_id_service", "1140");
	login.DevLogin("tc_one");
	si.viewProjects();
	dt.devops();
	si.selectTemplate();
	dd.selectTechnology();
	dd.selectCI();
	cp.selectCIPipeline();
	cp.choosePipeline();
	ct.codeRepo();
	ct.chooseCodeRepo();
	ct.verifyCodeRepo();	
}


@Test(priority=24,groups={"Smoke","Regression","Functional"},description="Select Code Repository error message", enabled=true)
public void TC_14() throws Exception{
	_properties.setValue("Test_case_id_service", "1141");
	login.DevLogin("tc_one");
	si.viewProjects();
	dt.devops();
	si.selectTemplate();
	dd.selectTechnology();
	pg.selectCI();
	cp.selectCIPipeline();
	cp.choosePipeline();
	ct.chooseCodeRepo();
	ct.codeRepo_err();
	
	
}

/**************07/07/2017******************/
@Test(priority=25, groups={"Smoke","Regression","Functional"},description="Select Build Server", enabled=true)
public void TC_15() throws Exception{
	_properties.setValue("Test_case_id_service", "1142");
	login.DevLogin("tc_one");
	si.viewProjects();
	dt.devops();
	si.selectTemplate();
	dd.selectTechnology();
	dd.selectCI();
	cp.selectCIPipeline();
	cp.choosePipeline();
	ct.codeRepo();
	ct.chooseCodeRepo();
	ct.buildServer();
	ct.vm();
	ct.choosebuildServer();
	ct.verifybuildServer();
	
}

@Test(priority=26, groups={"Smoke","Regression","Functional"}, description="Select Build Server Error Message", enabled=true)
public void TC_16() throws Exception{
	_properties.setValue("Test_case_id_service", "1143");
	login.DevLogin("tc_one");
	si.viewProjects();
	dt.devops();
	si.selectTemplate();
	dd.selectTechnology();
	dd.selectCI();
	cp.selectCIPipeline();
	cp.choosePipeline();
	ct.codeRepo();
	ct.chooseCodeRepo();
	ct.choosebuildServer();
	ct.buildServer_err();
	
	
}

@Test(priority=27, groups={"Smoke","Regression","Functional"}, description="Select Build Server without VM", enabled=true)
public void TC_17() throws Exception{
	_properties.setValue("Test_case_id_service", "1144");
	login.DevLogin("tc_one");
	si.viewProjects();
	dt.devops();
	si.selectTemplate();
	dd.selectTechnology();
	dd.selectCI();
	cp.selectCIPipeline();
	cp.choosePipeline();
	ct.codeRepo();
	ct.chooseCodeRepo();
	ct.buildServer();
	ct.choosebuildServer();	
	
}

@Test(priority=28, groups={"Smoke","Regression","Functional"},description="Select Build Tool", enabled=true)
public void TC_18() throws Exception{
	
	_properties.setValue("Test_case_id_service", "1145");
	login.DevLogin("tc_one");
	si.viewProjects();
	dt.devops();
	si.selectTemplate();
	dd.selectTechnology();
	dd.selectCI();
	cp.selectCIPipeline();
	cp.choosePipeline();
	ct.codeRepo();
	ct.chooseCodeRepo();
	ct.buildServer();
	ct.vm();
	ct.choosebuildServer();
	ct.buildTool();
	ct.choosebuildTool();
	ct.verifybuildTool();
}

@Test(priority=29, groups={"Smoke","Regression","Functional"},description="Select Build Tool Error",enabled=true)
public void TC_19() throws Exception{
	_properties.setValue("Test_case_id_service", "1146");
	login.DevLogin("tc_one");
	si.viewProjects();
	dt.devops();
	si.selectTemplate();
	dd.selectTechnology();
	dd.selectCI();
	cp.selectCIPipeline();
	cp.choosePipeline();
	ct.codeRepo();
	ct.chooseCodeRepo();
	ct.buildServer();
	ct.vm();
	ct.choosebuildServer();
	ct.choosebuildTool();
    ct.verifybuildTool_err();
}


/***********13/07/2017****************/

@Test(priority=30, groups={"Smoke","Regression","Functional"}, description="Save Design", enabled=true)
public void TC_20() throws Exception{
	_properties.setValue("Test_case_id_service", "1147");
	login.DevLogin("tc_one");
	si.viewProjects();
	dt.devops();
	si.selectTemplate();
	dd.selectTechnology();
	dd.selectCI();
	cp.selectCIPipeline();
	cp.choosePipeline();
	ct.codeRepo();
	ct.chooseCodeRepo();
	ct.buildServer();
	ct.vm();
	ct.choosebuildServer();
	ct.buildTool();
	ct.choosebuildTool();
	ct.verifybuildTool();
	ps.saveDesign();
	ps.verifyDesign();
	
}


@Test(priority=31, groups={"Smoke","Regression","Functional"}, description="Select Template Proceed", enabled=true)
public void TC_25() throws Exception{
	_properties.setValue("Test_case_id_service", "1152");
	login.DevLogin("tc_one");
	si.viewProjects();
	dt.devops();
	si.selectTemplate();
	dd.selectTechnology();
	dd.selectCI();
	cp.selectCIPipeline();
	cp.choosePipeline();
	ct.codeRepo();
	ct.chooseCodeRepo();
	ct.buildServer();
	ct.vm();
	ct.choosebuildServer();
	ct.buildTool();
	ct.choosebuildTool();
	ct.verifybuildTool();
	ps.saveDesign();
	Thread.sleep(2000);
	ps.verifyDesign();
	dedDevops.deployTemplate();	
	dedDevops.selectTemplate();
	dedDevops.selectTemplateproceed();
	
	
}


@Test(priority=32, groups={"Smoke","Regression","Functional"}, description="Add Cloud Service", enabled=true)
public void TC_68() throws Exception{
	_properties.setValue("Test_case_id_service", "1195");
	login.DevLogin("tc_one");
	si.viewProjects();
	dt.devops();
	si.selectTemplate();
	dd.selectTechnology();
	dd.selectCI();
	cp.selectCIPipeline();
	cp.choosePipeline();
	ct.codeRepo();
	ct.chooseCodeRepo();
	ct.buildServer();
	ct.vm();
	ct.choosebuildServer();
	ct.buildTool();
	ct.choosebuildTool();
	ct.verifybuildTool();
	ps.saveDesign();
	Thread.sleep(2000);
	ps.verifyDesign();
	dedDevops.deployTemplate();
	dedDevops.selectTemplate();
	dedDevops.selectTemplateproceed();
	dedDevops.addCloudService();	
}


@Test(priority=33, groups={"Smoke","Regression","Functional"}, description="Add storage account", enabled=true)
public void TC_69() throws Exception{
	_properties.setValue("Test_case_id_service", "1196");
	login.DevLogin("tc_one");
	si.viewProjects();
	dt.devops();
	si.selectTemplate();
	//dd.selectTechnology();
	//dd.selectCI();
	cp.selectCIPipeline();
	cp.choosePipeline();
	ct.codeRepo();
	ct.chooseCodeRepo();
	ct.buildServer();
	ct.vm();
	ct.choosebuildServer();
	ct.buildTool();
	ct.choosebuildTool();
	ct.verifybuildTool();
	ps.saveDesign();
	ps.verifyDesign();
	dedDevops.deployTemplate();
	dedDevops.selectTemplate();
	dedDevops.selectTemplateproceed();
	dedDevops.addStorageAccount();
	//record the storage added alert message
	dedDevops.verifyStorageAccount();
	
}


@Test(priority=34, groups={"Smoke","Regression","Functional"}, description="To add new Account", enabled=true)
public void TC_70() throws Exception{
	login.DevLogin("tc_one");
    org.AddAccDetails();
 }

@Test(priority=35, groups={"Smoke","Regression","Functional"}, description="To create project", enabled=true)
public void TC_71() throws Exception{
	login.DevLogin("tc_one");
 org.CreateProject();
 }

@Test(priority=35, groups={"Smoke","Regression","Functional"}, description="To view project", enabled=true)
public void TC_72() throws Exception{
	login.DevLogin("tc_one");
   org.ViewProjects();
 }


@Test(priority=36, groups={"Smoke","Regression","Functional"}, description="To add new User with single account", enabled=true)
public void TC_73() throws Exception{
	login.DevLogin("tc_one");
	aur.settingTab();
	aur.AddUser();
	
}
@Test(priority=37, groups={"Smoke","Regression","Functional"}, description="To add Existing user", enabled=true)
public void TC_74() throws Exception{
	login.DevLogin("tc_one");
	aur.settingTab();
	aur.AddExistingUser();
}

@Test(priority=38, groups={"Smoke","Regression","Functional"}, description="To add new User with multipleAccout", enabled=true)
public void TC_75() throws Exception{
	login.DevLogin("tc_one");
	aur.settingTab();
	aur.AddUserMultiAcc();
}

@Test(priority=37, groups={"Smoke","Regression","Functional"}, description="Edit user", enabled=true)
public void TC_76() throws Exception{
	login.DevLogin("tc_one");
	aur.settingTab();
	aur.EditUser();
}

@Test(priority=38, groups={"Smoke","Regression","Functional"}, description="To Edit user with no account", enabled=true)
public void TC_77() throws Exception{
	login.DevLogin("tc_one");
	aur.settingTab();
    aur.SelectAccError();
}

@Test(priority=39 , groups={"Smoke","Regression","Functional"}, description="To select the CT pipeline and identify error message", enabled=true)
public void TC_78() throws Exception{
	
login.DevLogin("tc_one");
dt.devops();
pipe.ct();
pipe.seltech();
pipe.selrep();
pipe.chosect();
pipe.catchcterr();
}

@Test(priority=39 , groups={"Smoke","Regression","Functional"}, description="CT Pipeline overview", enabled=true)
public void TC_79() throws Exception{
	
login.DevLogin("tc_one");
dt.devops();
pipe.ct();
pipe.seltech();
pipe.selrep();
pipe.chosect();
pipe.pipelineOverview();

}

@Test(priority=40 , groups={"Smoke","Regression","Functional"}, description="configureCTDevops", enabled=true)
public void TC_80() throws Exception{
	
login.DevLogin("tc_one");
dt.devops();
pipe.ct();
pipe.seltech();
pipe.selrep();
pipe.chosect();
pipe.pipelineOverview();
pipe.Configure();
}

@Test(priority=41, groups={"Smoke","Regression","Functional"}, description="To delete user", enabled=true)
public void TC_81() throws Exception{
	login.DevLogin("tc_one");
	aur.settingTab();
   aur.DeleteUser();
}

@Test(priority=42, groups={"Smoke","Regression","Functional"}, description="To delete user", enabled=true)
public void TC_82() throws Exception{
	login.DevLogin("tc_one");
	org.ViewProjects();
	co.CloudOpsDesign();
}


}
