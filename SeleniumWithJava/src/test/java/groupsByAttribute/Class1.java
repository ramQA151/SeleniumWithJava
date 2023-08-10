package groupsByAttribute;

import org.testng.annotations.Test;

public class Class1 {

	@Test (groups= {"Smoke"})
	public void TestMethod1() {
		System.out.println("Demo 1 test method");
	}
	@Test
	public void TestMethod2() {
		System.out.println("Demo 2 test method");
	}
	@Test
	public void TestMethod3() {
		System.out.println("Demo 3 test method");
		
	}
}
