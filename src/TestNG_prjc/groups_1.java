package TestNG_prjc;

import org.junit.Ignore;
import org.testng.annotations.Test;

public class groups_1 {

	@Test(groups = { "raju", "zakir" })
	public void f() {

		System.out.println("f");
	}

	@Test(groups = { "zakir" })
	public void f1() {

		System.out.println("f1");
	}

	@Test(groups = { "raju", "zakir" })
	public void f2() {

		System.out.println("f2");
	}

	@Test(groups = { "raju", "love" })
	public void f3() {

		System.out.println("f3");
	}

	@Test(groups = { "raju" })
	public void f4() {

		System.out.println("f4");
	}

	@Test(groups = { "raju", "love" })
	public void f5() {

		System.out.println("f5");
	}
}
