package testNGPractice;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertionPractice {
  @Test
  public void f() {
	  //hard asset
	  System.out.println("Started");
	  int a=10;
	  int b=20;
	  Assert.assertEquals(a<b, false, "a is less than b");
	  //Assert.assertEquals(a, b);
	  b=10;
	  Assert.assertEquals(a, b);
	  System.out.println("completed");
	  
	  
  }
  
  @Test
  public void g() {
	  //soft assert
	  System.out.println("startd for soft assert");
	  SoftAssert as=new SoftAssert();
	  as.assertEquals(1, 2);
	  as.assertTrue(true);
	  as.assertEquals(2>3,true,"3 is greater that 2");
	  System.out.println("completed soft assert");
	  as.assertAll();
	  
	  
  }
  
 
}
