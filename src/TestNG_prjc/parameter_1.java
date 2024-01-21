package TestNG_prjc;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class parameter_1 {
	
	WebDriver driver;
	@Parameters("url")
	@BeforeTest
	public void lanchedapplication(String url)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	@Parameters({"x","y"})
	@Test
	public void login(int x,int y)
	{
		System.out.println("Test_1");
		//int a = x;
		//int b = y;
		int z;
		    z = x+y;
				System.out.println(z);
				assertTrue(true);
	}
	@Parameters({"a","b"})
	@Test
	public void add(int a,int b)
	{
		int c = a+b;
		System.out.println("Test_2");
		System.out.println(c);
	}
	@AfterTest
	public void closedapplication()
	{
		driver.close();
	}

}
