package org.flipkart.qa.utils;

import com.fasterxml.jackson.databind.annotation.JsonAppend;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropConfig {
    Properties prop;
    public Properties initPropConfig(){
        File file=new File("E:\\FlipkartFramWork\\src\\main\\java\\org\\flipkart\\qa\\driverfactory\\ProgConfig.properties");
        String basePath=System.getProperty("user.dir");
        String rootPath="\\src\\main\\java\\org\\flipkart\\qa\\driverfactory\\ProgConfig.properties";
        String fullPath=basePath+rootPath;
        System.out.println(fullPath);
        try{
            FileInputStream fis=new FileInputStream(file);
            prop=new Properties();
            prop.load(fis);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return prop;
    }
}
