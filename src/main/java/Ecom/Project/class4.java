package Ecom.Project;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class class4 {
	@Test(groups={"Smoke"})
	 public void fucn1()
	 {
		 
		 System.out.println("f ");
	 }
     @Parameters({"url"})
     @Test
	 public void fucn2(String url)
	 {
		 
		 System.out.println("f1");
		 System.out.print(url);
	 }
	 public void fucn3()
	 {
		 
		 System.out.println("f3 ");
	 }
     @Test
	 public void fucn4()
	 {
		 
		 System.out.println("f4");
	 }


}
