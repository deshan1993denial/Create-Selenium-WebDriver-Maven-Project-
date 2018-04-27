package com.automation;


import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class LoadTest01 
{
	
	private WebDriver driver;

    @BeforeClass
    public void beforeClass() {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\deshanr\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
    	
        driver = new ChromeDriver();
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

    @Test
    public void verifySearchButton() {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://www.google.com");
      WebElement ele=  driver.findElement(By.xpath("//*[@id=\"lst-ib\"]"));
      ele.sendKeys("Harthik Pandya");
      
  
     

        
    }
}
