package com.thetestingacademy.ex05_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium19 {

    @Description("Verify that with invalid email, pass , error message is shown ")
    @Test
    public void test_negative_Vwo_login() throws Exception {

   System.setProperty("webdriver.edge.driver", "C:\\Drivers\\msedgedriver.exe");
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");


        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://vwo.com/free-trial");

        WebElement EmailInputBox = driver.findElement(By.id("page-v1-step1-email"));
        EmailInputBox.sendKeys("ddddsdd");

        //<input
        // class="Cur(p) Flxs(0) M(0) Pos(r) T(2px)"
        // type="checkbox"
        // name="gdpr_consent_checkbox"
        // id="page-free-trial-step1-cu-gdpr-consent-checkbox"
        // value="true"
        // data-qa="page-free-trial-step1-gdpr-consent-checkbox"
        // data-gtm-form-interact-field-id="1">

        WebElement checkbox_policy = driver.findElement(By.name("gdpr_consent_checkbox"));
    checkbox_policy.click();

        List<WebElement> ButtonList = driver.findElements(By.tagName("button"));
        ButtonList.get(0).click(); // but avoid using tagname as it gives you multiple things
 // <button
        // type="submit"
        // class="button W(100%) btn-modal-form-submit"
        // data-qa="page-su-submit"
        // value="">Create a Free Trial Account
        // </button>

        WebElement error_message = driver.findElement(By.className("invalid-input+Op(1)"));
Assert.assertEquals(error_message.getText(),"The email address you entered is incorrect.");

// you can use part of a classs that is unique
 // <div
        // class="C(--color-red) Fz(--font-size-12) Trsp(--Op) Trsdu(0.15s) Op(0) invalid-input+Op(1)
        // invalid-reason">The email address you entered is incorrect.
        // </div
        // >



        Thread.sleep(3000);

driver.quit();


    }

}