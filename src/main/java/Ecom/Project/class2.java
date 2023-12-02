package Ecom.Project;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class class2 {
	
	
	
	@BeforeSuite
	 public void f()
	 {
		 
		 System.out.println("1 has been run ");
	 }
	@Test
	 public void f2()
	 {
		 
		 System.out.println("2 has been run ");
	 }
	@AfterSuite
	 public void f1()
	 {
		 
		 System.out.println("3 has been run ");
	 }
	@Test
	 public void f3()
	 {
		 
		 System.out.println("4 has been run ");
	 }

}
