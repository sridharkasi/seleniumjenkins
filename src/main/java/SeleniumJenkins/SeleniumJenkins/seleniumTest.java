package SeleniumJenkins.SeleniumJenkins;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumTest {
	
	private WebDriver driver;
	@Test
	 public void launchbrowser(){
		
		 //WebDriverManager.chromedriver().setup();
		 //driver = new ChromeDriver();
		 
		driver = new HtmlUnitDriver();
		 driver.get("http://www.google.com");
	}

}
