package com.thetestingacademy.ex03_Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium12 {

    @Description("Open the URL and verify the heading")
    @Test

    public void test_Selenium03() throws Exception {

      //  WebDriver driver = new EdgeDriver();
        WebDriver driver = new ChromeDriver();
driver.get("https://google.com/"); // this is used 95%

//   driver.get("google.com/"); // this wont work as HTTPS is mandatory !!!!!
// Use Navigation  method

        driver.navigate().to("https://bing.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();


    }


}
