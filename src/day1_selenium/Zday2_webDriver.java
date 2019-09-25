package day1_selenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Zday2_webDriver {
  @Test
  public void f() {
	  
	  WebDriver driver= Zday2_driverutility.getDriver("chrome");
	  String url="http://10.232.237.143:443/TestMeApp/fetchcat.htm";
	  driver.get(url);
	  driver.manage().window().maximize();
	  driver.navigate().refresh();
	  System.out.println("the title of the webpage is "+driver.getTitle());
  }
}
