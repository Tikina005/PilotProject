package src.test.java.com.CucumberPilot;

import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
   @Test
   public void testCase1() {
	   System.setProperty("webdriver.gecko.driver", "./src/test/resources/geckodriver.exe");
	   FirefoxDriver driver = new FirefoxDriver();
	   driver.get("http://google.com");
   }
   
}
