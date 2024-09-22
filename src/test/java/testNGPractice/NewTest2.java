package testNGPractice;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest2 {
  @BeforeTest
   void test1() {
	  System.out.println("before test");
  }
  @BeforeSuite
  void test2() {
	  System.out.println("before suite");
 }
  @Test
  void test3() {
	  System.out.println("Bye");
 }
}
