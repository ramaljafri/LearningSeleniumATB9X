package com.thetestingacademy.ex03_Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium04 {

    @Description("OPen the App.vmo.com and get the title")
    @Test

    public void test_Selenium03(){

// ************ Web Driver Hierarchy *******
        // SearchContext (I) -> (2) -->  WebDriver (I) -> (10) -> RemoteWebDriver(C)(15) --> ChromiumDriver(C) 25 --> EdgeDriver(C) 45
// the more bottom we go the more functions we have -- i have 3 generations of wealth
//findelement
//findelements

        //If you are going by chrome - it is like this

        //SearchContext(I)
        //WebDriver(I)
        //RemoteWebDriver(C)
        //ChromiumDriver(C)
        //ChromeDriver(C)

        //If you are going by Edge - it is like this

        //SearchContext(I)
        //Webdriver(I)
        //RemoteWebDriver(C)
        //EdgeDriver(C)


//SearchContext - Interface -- FindElement and FindElements -GGF
//WebDriver-Interface - some incomplete functions -GF
//RemoteWebDriver - Class - It also has some fuunctions -F
// ChromeDriverFirefoxDriver,EdgeDriver,SafariDriver,InternetExplorerDriver - Classes


        //SearchContext driver = new ChromeDriver();
        //WebDriver driver =new ChromeDriver();
        //Remote WebDriver driver1 = new ChromeDriver();
        //ChromeDriver driver = new ChromeDriver();

        //Which one to use ??

 //       Scenarios

        //1. Do you want to run on Chrome or Edge ?

        // ChromeDriver driver = new ChromeDriver(); ~1%

        //2. Do you want to run on Chrome than change to Edge ?

        //WebDriver driver =new ChromeDriver();
        //driver= new EdgeDriver();  // 97%
        //driver = new FirefoxDriver();

//3. Do you want to run multiple browsers , aws machine ? 2%

        // Remote WebDriver driver1 = new ChromeDriver();



    }


}
