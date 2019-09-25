package day1_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Zday2_Popup {
  @Test
  public void f() {
	  WebDriver driver= Zday2_driverutility.getDriver("chrome");
	  String url="http://demowebshop.tricentis.com";
	  driver.get(url);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(200000, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//input[@value='Search']")).click();
	  driver.manage().timeouts().implicitlyWait(1000000,TimeUnit.MINUTES);
	  Alert alt=driver.switchTo().alert();
	  driver.manage().timeouts().implicitlyWait(500000, TimeUnit.SECONDS);
	  System.out.println("alert text is "+alt.getText());
	  alt.accept();
	  driver.close();
  }
}
