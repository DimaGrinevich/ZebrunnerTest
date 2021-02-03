package com.solvd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    private WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver","/Users/dhrynevich/Desktop/selenium/chromedriver");
        driver = new ChromeDriver();
    }

    @AfterClass
    public void afterTest(){
        driver.quit();
    }

    @Test
    public void testIncorrectLogin(){

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Dima","777");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='_9ay7']"))!=null,
                "Didn't get or couldn't find negative response");
    }

}
