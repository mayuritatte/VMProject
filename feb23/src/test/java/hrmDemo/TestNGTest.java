package hrmDemo;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.ReadConfigData;

public class TestNGTest {

    WebDriver driver;
    ReadConfigData conf;
    
    // pre-condition
    // Test
    // post-condition

    @Test
    public void login() throws Exception {

        System.out.println("login test case");
        
        //conf.getEmail();
        
        //locator --- id
        
        Thread.sleep(5000);
        WebElement txtEmail = driver.findElement(By.id("Email"));
        
        txtEmail.clear();
        
        Thread.sleep(5000);
        
        txtEmail.sendKeys(conf.getName());
        
        
        //locator - name
        driver.findElement(By.name("Password")).clear();
        Thread.sleep(5000);
        driver.findElement(By.name("Password")).sendKeys("admin");
        

    }

    @AfterTest
    public void closeApp() throws Exception {

        System.out.println("closing application");
        
        Thread.sleep(5000);
        driver.close();
    }

    @BeforeTest
    public void launchApp() throws Exception {

        System.out.println("launching application");
        
        driver =WebDriverManager.chromedriver().create();
        
        conf = new ReadConfigData();
        
        System.out.println(conf.getName());
        
        driver.get(ReadConfigData.getApplicationURL());
        
        //driver.
        
        
    }

}

