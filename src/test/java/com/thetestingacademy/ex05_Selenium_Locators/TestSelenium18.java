package com.thetestingacademy.ex05_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium18 {

    @Description("Verify that with invalid email, pass , error message is shown ")
    @Test
    public void test_negative_Vwo_login() throws Exception {

   System.setProperty("webdriver.edge.driver", "C:\\Drivers\\msedgedriver.exe");
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");


        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com/#/login");


        //<a
        // href="https://vwo.com/free-trial/?utm_medium=website&amp;utm_source=login-page&amp;utm_campaign=mof_eg_loginpage"
        // class="text-link Td(n)"
        // data-qa="bericafeqo">Start a free trial
        // </a
        // >

        //Link Text - Full Text Match
      //  WebElement a_tag_free_trial=driver.findElement(By.linkText("Start a free trial"));
// Partial Match
        WebElement a_tag_free_trial=driver.findElement(By.partialLinkText("free trial"));
        a_tag_free_trial.click();

        // Start a free trial
        // a free trial
        //Start
        // free trial
        //trial
        //start


        Thread.sleep(3000);

driver.quit();


    }

}