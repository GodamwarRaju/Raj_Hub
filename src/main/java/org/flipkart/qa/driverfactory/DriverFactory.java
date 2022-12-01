package org.flipkart.qa.driverfactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    WebDriver driver;
    public WebDriver initDriver(String browser){
        if (browser.equals("Chrome")){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }
        else if (browser.equals("Edge")){
            WebDriverManager.edgedriver().setup();
            driver=new EdgeDriver();
        }
        else if (browser.equals("Firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        }
        else
        {
            System.out.println("Please Enter a Correct Browser : Chrome, Edge,Firefox");
            System.exit(0);
        }
        return driver;
    }
}
