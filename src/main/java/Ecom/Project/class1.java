package Ecom.Project;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class class1 {
	@AfterMethod
	 public void fucn1()
	 {
		 
		 System.out.println("fun1 has been run ");
	 }
	@Test
	 public void fucn2()
	 {
		 
		 System.out.println("fun2 has been run ");
	 }

@BeforeMethod
	 public void fucn3()
	 {
		 
		 System.out.println("fun3 has been run ");
	 }
	@Test
	 public void fucn4()
	 {
		 
		 System.out.println("fun4 has been run ");
	 }

}
