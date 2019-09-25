package day1_selenium;

import org.testng.annotations.Test;

public class NewTest2 {
  @Test(priority=1,enabled=false)
  public void Login() {
	  System.out.println("LOGIN");
  }
  @Test(priority=2)
  public void Homepage() {
	  System.out.println("HOME PAGE");
  }
  @Test(priority=4)
  public void Logout() {
	  System.out.println("LOGOUT");
  }
  @Test(priority=3)
  public void Register() {
	  System.out.println("REGISTER");
  }
  @Test(priority=4)
  public void Nothing() {
	  System.out.println("NOTHING");
	  
  }
  @Test
  public void NG() {
	  System.out.println("NOT GIVEN");
  }
}
