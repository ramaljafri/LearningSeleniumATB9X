package com.thetestingacademy.ex05_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class TestSelenium17 {

    @Description("Verify that with invalid email, pass , error message is shown ")
    @Test
    public void test_negative_Vwo_login() throws Exception {

   System.setProperty("webdriver.edge.driver", "C:\\Drivers\\msedgedriver.exe");
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");


        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com/#/login");

       // 1. Find the email input box and enter the email
       // <input open HTML Tag
        // type="email"
        // class="text-input W(100%)"
        // name="username"
        // id="login-username"
        // data-qa="hocewoqisi"
        // > Close tag
        WebElement emailInputBox = driver.findElement(By.id("login-username"));
emailInputBox.sendKeys("admin@admin.com");

        //2. Find the password inputboc and enter the password

//<input
// type="password"
// class="text-input W(100%)"
// name="password"
// id="login-password"
// data-qa="jobodapuxe"
// >
        WebElement PasswordInputBox = driver.findElement(By.name("password"));
        PasswordInputBox.sendKeys("admin");


        //3. Find the submit button and click on it

    // <button
        // type="submit"
        // id="js-login-btn"
        // class="btn btn--primary btn--inverted W(100%) H(48px) Fz(16px)"
        // onclick="login.login(event)" data-qa="sibequkica">
        //<span class="icon loader hidden"
        // data-qa="zuyezasugu"></span>
        //<span data-qa="ezazsuguuy">Sign in</span>
        //</button>
        WebElement buttonSubmit = driver.findElement(By.id("js-login-btn"));
buttonSubmit.click();

        Thread.sleep(3000);
        //4. Find the invalid error message and verify

//div
// class="notification-box-description"
// id="js-notification-box-msg"
// data-qa="rixawilomi">Your email, password, IP address or location did not match
// </div
// >
WebElement error_Message = driver.findElement(By.className("notification-box-description"));
Assert.assertEquals(error_Message.getText(),"Your email, password, IP address or location did not match");

driver.quit();


    }

}