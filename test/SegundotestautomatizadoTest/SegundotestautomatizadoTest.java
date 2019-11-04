/**
 * @author EmitoSanti
 */

package SegundotestautomatizadoTest;

// Generated Junit
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

// Generated by Selenium IDE
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import org.openqa.selenium.support.ui.Select;

public class SegundotestautomatizadoTest {
    ChromeDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    public SegundotestautomatizadoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        // Seteo de driver de Chrome
        System.setProperty( "webdriver.chrome.driver", "D:\\chromedriver.exe");
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    
    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void hello() {
   
        // Test name: Segundo test-automatizado
        // Step # | name | target | value
        
        // Direccionar a la web a testear
        // 1 | open | http://newtours.demoaut.com/ |  
        driver.get("http://newtours.demoaut.com/");
        
        // Logueo a la web
        // 2 | assertElementPresent | name=userName |  
        {
          List<WebElement> elements = driver.findElements(By.name("userName"));
          assert(elements.size() > 0);
        }
        
        // 3 | type | name=userName | userTestAutom | 
        driver.findElement(By.name("userName")).sendKeys("userTestAutom");
        
        // 4 | assertElementPresent | name=password | 
        {
          List<WebElement> elements = driver.findElements(By.name("password"));
          assert(elements.size() > 0);
        }
        // 5 | type | name=password | passTestAutom
        driver.findElement(By.name("password")).sendKeys("passTestAutom");
        
        // 6 | click | name=login | 
        driver.findElement(By.name("login")).click();
        
        // Log out
        // 7 | verifyElementPresent | link=SIGN-OFF | 
        {
          List<WebElement> elements = driver.findElements(By.linkText("SIGN-OFF"));
          assert(elements.size() > 0);
        }
        
        // 8 | click | link=SIGN-OFF |  | 
        driver.findElement(By.linkText("SIGN-OFF")).click();
        System.out.println( "Usuario deslogueado" );
    }
}
