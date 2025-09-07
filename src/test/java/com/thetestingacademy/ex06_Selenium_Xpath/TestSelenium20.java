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

public class TestSelenium20 {

    @Description("Verify that with valid email, pass on test_ketalon_login ")
    @Test
    public void test_ketalon_login() throws Exception {

   System.setProperty("webdriver.edge.driver", "C:\\Drivers\\msedgedriver.exe");
        EdgeOptions edgeOptions = new EdgeOptions();
        WebDriver driver =new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com");
        WebElement make_appointment_btn =driver.findElement(By.xpath("//a [@id='btn-make-appointment']"));

        make_appointment_btn.click();

        Thread.sleep(3000);

        // easiest way is to use id
      WebElement Username_input_box =driver.findElement(By.xpath("//input[@id='txt-username']"));
       // WebElement Password_input_box =driver.findElement(By.xpath("//input[@id='txt-password']"));
// or use List , Elements and placeholder

        List <WebElement> Password_input_box =driver.findElements(By.xpath("//input[@placeholder='Password']"));


        Username_input_box.sendKeys("John Doe");
        Password_input_box.get(1).sendKeys("ThisIsNotAPassword");

        WebElement Login_button =driver.findElement(By.xpath("//button[@id='btn-login']"));
        Login_button.click();
Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");

        Thread.sleep(4000);
driver.quit();


    }

}