package day1_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Zday2_driverutility {
  @Test
  public static WebDriver getDriver(String browser)
  {
	  if(browser.equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6B.01.16\\Desktop\\B_D\\@files\\chromedriver.exe");
		  return new ChromeDriver();
	  }
	  else if(browser.equals("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\training_b6B.01.16\\Desktop\\B_D\\@files\\geckodriver.exe");
		  return new FirefoxDriver();
	  }
	  else if (browser.equals("ie"))
	  {
		  System.setProperty("webdriver.ie.driver","C:\\Users\\training_b6B.01.16\\Desktop\\B_D\\@files\\IEDriverServer.exe");
		  return new InternetExplorerDriver();
	  }
	  else
	  {
		  return null;
	  }
  }
}
