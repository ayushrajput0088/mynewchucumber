package day1_selenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAss {
  @Test
  public void f() {
	  SoftAssert sa=new SoftAssert();
	  
	  System.out.println("Checking 1nd validation");
	  sa.assertFalse(18<9);
	  
	  System.out.println("Checking 2st validation");
	  sa.assertTrue(9<18);
	  
	  System.out.println("Checking 3rd validation");
	  sa.assertEquals(10, 10);
	  
	  sa.assertAll();
	  
  }
}
