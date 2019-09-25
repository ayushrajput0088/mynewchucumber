package day1_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest3 {
	WebDriver driver=null;
  @Test
  public void BrowserLaunch()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6B.01.16\\Desktop\\B_D\\@files\\chromedriver.exe");
	  driver =new ChromeDriver();
	  String url="http://www.google.com";
	  driver.get(url);
  }
}
