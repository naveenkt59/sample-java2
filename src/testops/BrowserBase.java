package testops;

import test.webdriver.SonnetElement;

public class BrowserBase extends SonnetElement{
	
	public void setup() throws Exception{
		invokeBrowser(_properties.getValue("browser_name"));
		
	}

	public void browserClose() {
		_Driver.quit();
	}
	
}
