package TestNG_prjc;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ilesteners.class)
public class ileseners_mainclass {

	@Test
	public void set() {

		System.out.println("ji");
		System.out.println("hi");
		
	}
}
