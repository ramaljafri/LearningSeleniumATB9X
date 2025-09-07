package com.thetestingacademy.ex03_Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium03 {

    @Description("OPen the App.vmo.com and get the title")
    @Test

    public void test_Selenium03(){

//Selenium3
        // You need to Setup the Driver (browser)
        // System.get Property ("webdriver.gecko.driver","/path/geckdriver")

        //Selenium 4
        //Selenium Manager - utility - which can download the driver automatically
        // start and stop itself

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://google.com");

        



    }


}
