package com.thetestingacademy.ex03_Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium10 {

    @Description("Open the URL and verify the heading")
    @Test

    public void test_Selenium03() throws Exception {

      //  WebDriver driver = new EdgeDriver();
        WebDriver driver = new FirefoxDriver();
driver.get("https://katalon-demo-cura.herokuapp.com/");
driver.manage().window().maximize();

if(driver.getPageSource().contains("Ramal Healthcare Service"))
    {

        System.out.println("CURA Healthcare Service is VISIBLE");
    Assert.assertTrue(true);

    }

else {


    throw new Exception("CURA Healthcare Service is NOT VISIBLE");

}
    }


}
