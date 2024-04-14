package com.seleniumPractice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumBasics {
    public static  void main(String[] args) {

        WebDriver driver =new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
        driver.navigate().to("https://www.amazon.in/");
        driver.navigate().back();

    }




}
