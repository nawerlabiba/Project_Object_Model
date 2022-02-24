package step_definitions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends Base {
	
	@Before
	public void setup() {
		ChromeOptions option = new ChromeOptions(); 
		option.setHeadless(false);
		WebDriverManager.chromedriver().setup();
		browser = new ChromeDriver(option);
		System.out.println(browser);
	}
	
	@After
	public void tearDown() {
		browser.close();
	}
	

}
