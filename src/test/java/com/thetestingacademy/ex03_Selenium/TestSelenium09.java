package com.thetestingacademy.ex03_Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium09 {

    @Description("Open the URL")
    @Test

    public void test_Selenium03() {

      //  WebDriver driver = new EdgeDriver();
        WebDriver driver = new FirefoxDriver();
      driver.get("https://google.com"); // get request is used to open the url
      Assert.assertEquals(driver.getTitle(),"Google");


    }

}
