package com.thetestingacademy.ex01_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium01 {
@Description("Open the App.vmo.cm and get the title")
    @Test

    public void test_Selenium01(){

//Open a URL and print the title

        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://app.vwo.com");
        System.out.println( driver.getTitle());

    }






}
