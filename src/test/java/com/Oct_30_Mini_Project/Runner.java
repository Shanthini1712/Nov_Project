package com.Oct_30_Mini_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Runner extends Baseclass {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=getBrowser("chrome");
		
		getURL("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		WebElement women = driver.findElement(By.xpath("(//a[@class='sf-with-ul'])[1]"));
		a.moveToElement(women).perform();
		
		WebElement casualdress = driver.findElement(By.xpath("(//a[text()='Casual Dresses'])[1]"));
		casualdress.click();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,800)");
		
		Thread.sleep(3000);
		
		WebElement casualimg = driver.findElement(By.xpath("//a[@title='Printed Dress']"));
		a.moveToElement(casualimg).build().perform();
		
		WebElement addcart = driver.findElement(By.xpath("//a[@title='Add to cart']"));
		addcart.click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement prochkout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		prochkout.click();
		
		WebElement quantity = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		quantity.sendKeys("4");
		
		JavascriptExecutor js1=(JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,800)");
		
		WebElement checkout = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		checkout.click();
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email_create']"));
		email.sendKeys("rameshanu@gmail.com");
		
		WebElement createacc = driver.findElement(By.xpath("//button[@id='SubmitCreate']"));
		createacc.click();
		
		Thread.sleep(3000);
		WebElement usrname = driver.findElement(By.id("email"));
		usrname.sendKeys("rameshanu@gmail.com");
		
		WebElement pwd = driver.findElement(By.id("passwd"));
		pwd.sendKeys("Automation");
		
		WebElement submit = driver.findElement(By.id("SubmitLogin"));
		submit.click();
		
		WebElement adress = driver.findElement(By.name("processAddress"));
		adress.click();
		
		WebElement agree = driver.findElement(By.xpath("//div[@id='uniform-cgv']"));
		agree.click();
		
		WebElement finalchkout = driver.findElement(By.name("processCarrier"));
		finalchkout.click();
	}

}



