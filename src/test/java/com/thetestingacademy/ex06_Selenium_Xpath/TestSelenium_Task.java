package com.thetestingacademy.ex06_Selenium_Xpath;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium_Task {

    @Description("Verify free trial message ")
    @Test
    public void verify_free_trial_message() throws Exception {

   System.setProperty("webdriver.edge.driver", "C:\\Drivers\\msedgedriver.exe");
        EdgeOptions edgeOptions = new EdgeOptions();
        WebDriver driver =new EdgeDriver(edgeOptions);
        driver.get("https://www.idrive360.com/enterprise/login");
        Thread.sleep(3000);

      WebElement Username_input_box =driver.findElement(By.xpath("//input[@id='username']"));
      WebElement Password_input_box =driver.findElement(By.xpath("//input[@id='password']"));


        Username_input_box.sendKeys("augtest_040823@idrive.com");
        Password_input_box.sendKeys("123456");

        WebElement Sign_In_button =driver.findElement(By.xpath("//button[@id='frm-btn']"));
        Sign_In_button.click();

        Thread.sleep(10000);

WebElement text =driver.findElement(By.xpath("//h5[contains(text(),'Your free trial')]"));


Assert.assertEquals(text.getText(),"Your free trial has expired");

 Thread.sleep(4000);
driver.quit();


    }

}