package org.flipkart.qa.driverfactory;

import org.flipkart.qa.utils.PropConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Properties;

public class TestDriver {
    public static void main(String[] args)  {
        WebDriver driver;
        Properties prop;

        DriverFactory d=new DriverFactory();
        PropConfig propConfig=new PropConfig();
        prop=propConfig.initPropConfig();
        //converting into a String
        String browser=prop.get("browser").toString();
        String url=prop.get("url").toString();
        //Initialize the Browser
        driver=d.initDriver(browser);
        driver.get(url);

        WebDriverWait wait=new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("_2doB4z")));
        driver.findElement(By.className("_2doB4z")).click();

        WebElement searchBar=driver.findElement(By.name("q"));
        searchBar.sendKeys("Iphone 12");
        searchBar.submit();
    }
}
