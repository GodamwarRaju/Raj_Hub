package org.flipkart.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
    WebDriver driver;
    public Homepage(WebDriver driver){
        this.driver=driver;
    }
    public String  homePageHeaderText(){
        return driver.findElement(By.xpath("//h3[text()='Welcome sump1']")).getText();
    }

}
