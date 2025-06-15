package com.thetestingacademy.ex03_Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium14 {

    @Description("Open the URL and verify the heading")
    @Test

    public void test_Selenium03() throws Exception {

        WebDriver driver = new EdgeDriver();
        //  WebDriver driver = new ChromeDriver();

       driver.get("https://google.com/");


//Close - will close the current tab - not the session
       //session id != null
//       Thread.sleep(3000) ;
//       driver.close();
        Thread.sleep(5000) ;
        driver.quit();
       //quit will close all the tabs - session id ==null


    }


}
