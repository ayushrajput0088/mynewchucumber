package day1_selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("Test Annotation");
  }
  @Test
  public void f2() {
	  System.out.println("Test Annotation");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BEFORE METHOD");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AFTER METHOD");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("BEFORE CLASS");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AFTER CLASS");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("BEFORE TEST");
  }

  @AfterTest
  public void afterTest() {
 
	  System.out.println("AFTER TEST");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BEFORE SUITE");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("AFTER SUITE");
  }

}
