package com.Oct_30_Mini_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {

	public static WebDriver driver;
	
	public static WebDriver getBrowser(String type) {
            if(type.equalsIgnoreCase("chrome")) {
            	System.setProperty("wedriver.chrome.driver",System.getProperty("user.dir") + "//Driver//chromedriver.exe");
            	driver=new ChromeDriver();
            }
            else if(type.equalsIgnoreCase("firefox")) {
            	System.setProperty("wedriver.gecko.driver",System.getProperty("user.dir") + "//Driver//firefoxdriver.exe");
            	driver=new FirefoxDriver();
            }    
            return driver;
            }
	 public static void getURL(String url) {
    	 driver.get(url);          
	}        
         public void inputValueElement(WebElement element,String value) {
              element.sendKeys(value);
		}
         public void ClickOnElement(WebElement element) {
  		   element.click();
  	}
         public void dropdown(String type,WebElement element,String value) {
                Select s=new Select(element);
                if(type.equalsIgnoreCase("byValue"))
                {
                	s.selectByValue(value);
                }
                else if(type.equalsIgnoreCase("byVisibleText"))
                {
                	s.selectByVisibleText(value);
                }
                else if(type.equalsIgnoreCase("byIndex"))
                {
                	int index=Integer.parseInt(value);
					s.selectByIndex(index);
                }
         }
}
		
        
         

