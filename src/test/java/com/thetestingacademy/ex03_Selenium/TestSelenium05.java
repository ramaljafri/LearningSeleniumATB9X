package com.thetestingacademy.ex03_Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium05 {

    @Description("OPen the App.vmo.com and Get the title")
    @Test

    public void test_Selenium03() {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://app.vwo.com");


    }



}
