package exercise;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

    protected WebDriver driver;

    @Before
    public void launchApp() throws Exception {

        System.out.println("launch application");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

//        driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");
        driver.get("https://amazon.com");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        //Thread.sleep(4000);

    }

    @After
    public void closeApp() throws Exception {

        System.out.println("close application");
        Thread.sleep(7000);
        driver.close();
        // driver.quit();

    }

}


