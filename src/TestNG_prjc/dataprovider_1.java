package TestNG_prjc;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider_1 {

	@Test(dataProvider = "testdata")
	public void add(int x, int y, int z) {
		int result = x + y + z;
		System.out.println("add:- " + result);
	}

	@Test(dataProvider = "testdata")
	public void even(int x, int y, int z) {
		int result = x * y * z;
		System.out.println("even:- " + result);
	}

	@DataProvider(name = "testdata")
	public Object[][] data() {
		Object[][] test = new Object[4][3];

		test[0][0] = 12;
		test[0][1] = 20;
		test[0][2] = 20;

		test[1][0] = 20;
		test[1][1] = 40;
		test[1][2] = 40;

		test[2][0] = 30;
		test[2][1] = 70;
		test[2][2] = 40;

		test[3][0] = 2;
		test[3][1] = 3;
		test[3][2] = 40;

		return test;
	}

}
