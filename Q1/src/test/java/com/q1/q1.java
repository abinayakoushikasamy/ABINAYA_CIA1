package com.q1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class q1 {
	
     public static void main(String[] args) throws  InterruptedException 
     {
    	  System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
    	  WebDriver driver;
  		  ChromeOptions co=new ChromeOptions();
  		  co.addArguments("--remote-allow-origins=*");
		  driver=new ChromeDriver(co);
		  driver.navigate().to("https://www.amazon.in/boAt-Airdopes-190-Breathing-Signature/dp/B0BBTYDK6Y?th=1");
		  driver.manage().window().maximize();
		  WebElement addtocart=driver.findElement(By.id("add-to-cart-button"));
		  addtocart.click();
		  Thread.sleep(5000);
		  
		  WebElement cartbutton=driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input"));
		  cartbutton.click();
		  Thread.sleep(5000);
		  WebElement qty= driver.findElement(By.id("a-autoid-0-announce"));
		  qty.click();
		  Thread.sleep(5000);
//		  WebElement delete = driver.findElement(By.xpath("//*[@id=\"quantity_0\"]"));
//		  delete.click();
//		  Thread.sleep(5000);
          WebElement proceedtobuy=driver.findElement(By.name("proceedToRetailCheckout"));
		  proceedtobuy.click();
		  System.out.print("Checked out Sucessfully");
		  
     }
}