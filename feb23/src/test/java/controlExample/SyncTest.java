package controlExample;



import java.util.concurrent.TimeUnit;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import controlExample.BaseTest;

public class SyncTest extends BaseTest {
	public WebDriver driver;
	  @Test
	    public void enterValues() throws Exception {
	    driver.findElement(By.id("text3")).sendKeys("Enter name");
	        
	               
	    }

}
