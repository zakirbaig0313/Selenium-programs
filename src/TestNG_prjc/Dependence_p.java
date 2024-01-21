package TestNG_prjc;

import org.testng.annotations.Test;

public class Dependence_p {
	@Test
	public void function() {
		// System.out.println(5/0);
		System.out.println("function");
	}

	@Test(dependsOnMethods = "function")
	public void function1() {
		// System.out.println(5/0);
		System.out.println("function1");
	}

	@Test(dependsOnMethods = { "function", "function1" })
	public void function2() {
		//System.out.println(5/0);
		System.out.println("function2");
	}

	@Test(dependsOnMethods = { "function", "function2" })
	public void function3() {

		System.out.println("function3");
	}

}
