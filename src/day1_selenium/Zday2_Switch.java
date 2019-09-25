package day1_selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Zday2_Switch {
  @Test
  public void f() 
  {
	  WebDriver driver= Zday2_driverutility.getDriver("chrome");
	  driver.get("http://demo.guru99.com/popup.php");
	  //driver.get(url);
	  driver.manage().window().maximize();
	  driver.findElement(By.linkText("Click Here"));
	  Set<String> windows=driver.getWindowHandles();
	  Iterator<String> it=windows.iterator();
	  String parentwindow=it.next();
	  String childwindow=it.next();
	  driver.switchTo().window(childwindow);
	  driver.findElement(By.name("emailid")).sendKeys("aravindmca57@gmail.com");
	  driver.findElement(By.name("btnLogin")).click();
	  System.out.println("url of the page"+driver.getCurrentUrl());
	  driver.close();
	  driver.switchTo().window(parentwindow);
	  System.out.println("parent window title is "+driver.getTitle());
	  
  }
}
