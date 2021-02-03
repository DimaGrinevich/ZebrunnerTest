package com.solvd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;

    private WebElement loginField;
    private WebElement passField;
    private WebElement loginButton;
    private WebElement registerWindowButton;

    public LoginPage(WebDriver webDriver){
        this.driver = webDriver;
        this.driver.get("https://web.facebook.com/?_rdc=1&_rdr");
        loginField = driver.findElement(By.xpath("//input[@name='email']"));
        passField = driver.findElement(By.xpath("//input[@name='pass']"));
        loginButton = driver.findElement(By.xpath("//button[@name='login']"));
       // registerWindowButton = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
    }

    public void login(String login, String password){
        loginField.sendKeys(login);
        passField.sendKeys(password);
        loginButton.click();
    }

    public void register(){

    }
}
