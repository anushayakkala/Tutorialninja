package com.numpyselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TutorialNinja {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/index.php");
		driver.manage().window().maximize();
		
		/*
		 * JavascriptExecutor js=(JavascriptExecutor)driver;
		 * js.executeScript("window.scrollBy(100,100)","");
		 */
		 
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement currency=driver.findElement(By.xpath("//span[text()='Currency']"));
		currency.click();
		
		 driver.findElement(By.xpath("//button[@name='EUR']")).click() ;
		 
		 WebElement cam=driver.findElement(By.xpath("//img[@title='Canon EOS 5D']"));
			cam.click();
			WebElement addtocart=driver.findElement(By.id("button-cart"));
			addtocart.click();
			WebElement bug=driver.findElement(By.id("input-option226"));
			System.out.println("could not select the list "+bug.getText());
			driver.navigate().back();
			WebElement iphone=driver.findElement(By.linkText("iPhone"));
			iphone.click();
			WebElement quantity=driver.findElement(By.id("input-quantity"));
			quantity.clear();
			quantity.sendKeys("2");
			WebElement buttonkart=driver.findElement(By.id("button-cart"));
			buttonkart.click();
			Thread.sleep(2000);
			WebElement success=driver.findElement(By.xpath("//div[text()='Success: You have added ']"));
			String s=success.getText();
			System.out.println(s);
			Thread.sleep(2000);
			WebElement totalkart=driver.findElement(By.id("cart-total"));
			totalkart.click();
			
			WebElement viewkart=driver.findElement(By.xpath("//i[@class='fa fa-shopping-cart']"));
			viewkart.click();
			
			Thread.sleep(1000);
			
			WebElement update=driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
			update.clear();
			update.sendKeys("3");
			
			
			WebElement eco=driver.findElement(By.xpath("(//table[@class='table table-bordered'])[3]//tr[2]//td[2]"));
			String e=eco.getText();
			System.out.println(e);
			
			
			WebElement vat=driver.findElement(By.xpath("(//table[@class='table table-bordered'])[3]//tr[3]//td[2]"));
			String e1=vat.getText();
			System.out.println(e1);
			
			WebElement checkout=driver.findElement(By.linkText("Checkout"));
			checkout.click();
			
			WebElement error=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
			String s1=error.getText();
			System.out.println(s1);
			
			WebElement remove=driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
			remove.clear();
			
			driver.navigate().to("http://tutorialsninja.com/demo/index.php");
		
			
			
	}
}
