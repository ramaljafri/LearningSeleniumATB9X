package com.thetestingacademy.ex05_Selenium_Locators;

import io.qameta.allure.Description;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Ketalon_Task {

    @Description("Verify that with invalid email, pass , error message is shown ")
    @Test
    public void Ketalon_Appointment() throws Exception {

        System.setProperty("webdriver.edge.driver", "C:\\Drivers\\msedgedriver.exe");
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

// 1- Go to Ketalon URL
        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");
//2- Click Button "Make Appointment"

        WebElement a_tag_button = driver.findElement(By.linkText("Make Appointment"));
        a_tag_button.click();
        Thread.sleep(1000);
//3- Enter Credentials

        WebElement UserName_Input = driver.findElement(By.id("txt-username"));
        UserName_Input.sendKeys("John Doe");
        WebElement Password_Input = driver.findElement(By.id("txt-password"));
        Password_Input.sendKeys("ThisIsNotAPassword");

//4- Click Login button

        WebElement SubmitButton = driver.findElement(By.id("btn-login"));
        SubmitButton.click();

//5- Verify the Current URL

        // Assert that the Current_URL is equal to the expected URL
// If the condition is FALSE → TestNG will throw an error and show the message
// If the condition is TRUE → the assertion passes, and we print a success message

        String Current_URL = driver.getCurrentUrl();
        Assert.assertEquals(
                Current_URL,
                "https://katalon-demo-cura.herokuapp.com/#appointment",
                "Validation failed: URL is not as expected!"
        );

        System.out.println("Validation passed: Current URL is as expected.");
//
        Thread.sleep(3000);
        driver.quit();

    }

}