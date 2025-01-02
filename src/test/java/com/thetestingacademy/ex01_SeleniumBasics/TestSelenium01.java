package com.thetestingacademy.ex01_SeleniumBasics;

import org.openqa.selenium.firefox.FireFoxDriver;
import org.testng.annotations.Test;

public class TestSelenium01 {

    @Test

    public void test_Selenium01(){

//Open a URL and print the title

        FireFoxDriver driver = new FireFoxDriver();
        driver.get("https://app.vmo.com");
        System.out.println( driver.getTitle());

    }






}
