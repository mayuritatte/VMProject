package exercise;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGExample {
    
	@BeforeTest
    public void launchapp() {
        System.out.println("launchapp");
        
    }

    
    @AfterTest
    public void closeapp() {
        System.out.println("closeApp");
        
    }
    
    @Test
    public void login() {
        
        System.out.println("login test case");
        
    }
    
    
    @Test
    public void logout() {
        
        System.out.println("logout test case");
        
    }
    
    
    @Test (priority =8)
    public void addItems() {
        
        System.out.println("addItems test case");
        
    }
    
    @Test (priority = -9)
    public void payment() {
        
        System.out.println("payment test case");
        
    }
}









