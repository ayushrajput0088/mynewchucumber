package day1_selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assesrt {
  @Test
  public void f() {
	  Assert.assertTrue("Hello".startsWith("h"));	  
  }
  @Test
  public void f1() {
	  Assert.assertFalse("Hello".startsWith("EL"));	  
  }
  @Test
  public void f2() {
	  Assert.assertEquals(10,10);	  
  }
  @Test
  public void f3() {
	  Assesrt obj=null;
	  Assesrt obj2=obj;
	  Assert.assertNull(obj2);	  
  }
  @Test
  public void f4() {
	  Assesrt obj3=null;
	  Assesrt obj4=obj3;
	  Assert.assertSame(obj3,obj4);  
  }
	  @Test
	  public void f5() {
		  Assesrt obj=new Assesrt();
		  Assesrt obj1=new Assesrt();
		  Assert.assertSame(obj,obj1);	  
	  }
}
