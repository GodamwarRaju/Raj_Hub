import io.github.bonigarcia.wdm.WebDriverManager;
import org.flipkart.qa.driverfactory.DriverFactory;
import org.flipkart.qa.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestBase  {
    DriverFactory df;
    WebDriver driver;
    LoginPage loginPage;
    @BeforeMethod
    public void beforeMethod(){
        this.driver=driver;
        df=new DriverFactory();
        driver=df.initDriver("Chrome");
        driver.get("http://spglobalsolutions.in/tool2/login.php");
        loginPage=new LoginPage(driver);
    }
    @AfterMethod
    public void closeTheBrowser(){
        driver.quit();
    }
}
