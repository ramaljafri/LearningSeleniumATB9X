package com.thetestingacademy.ex03_Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium07 {

    @Description("Open the URL")
    @Test

    public void test_Selenium03() {

      //  WebDriver driver = new EdgeDriver();
        WebDriver driver = new FirefoxDriver();
      driver.get("https://google.com"); // get request is used to open the url
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
driver.manage().window().maximize();
        driver.manage().window().minimize();


    }

}
