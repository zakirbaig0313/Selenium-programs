package TestNG_prjc;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_1 {
	
	public static WebDriver driver;
	@Test
	public void openapplication()
	{
		System.setProperty(Util.chromeset, Util.chromedrive);
		driver = new ChromeDriver();
		
		driver.get(Util.Baseurl);
		
		System.out.println("lanched application");
	}
	@Test
	public void login() throws InterruptedException {
		
			//UserID 
			WebElement Uid = driver.findElement(By.name("uid"));
			Uid.clear();
			Uid.sendKeys(Util.userid);
			
			
				
			//Password
			WebElement Upsd =driver.findElement(By.name("password"));
			Upsd.clear();
			Upsd.sendKeys(Util.password);
			
			
			
			//Thread.sleep(1000);
			assertEquals(Util.userid, Util.fuserid);
			assertEquals(Util.password, Util.fpassword);
			if(Util.userid.equalsIgnoreCase(Util.fuserid) && Util.password.equalsIgnoreCase(Util.fpassword))
			{
				System.out.println("login application");
				//login button
				driver.findElement(By.name("btnLogin")).click();
				
				String titlepage =driver.getTitle();
				System.out.println(titlepage);
				
				if(titlepage.equalsIgnoreCase(Util.exptitle))
				{
					System.out.println("Test Case-1:- Title of the page:- Passed");
				}
				else
				{
					System.out.println("Test Case-1:- Tile of the page :- Filed");
				}
				WebElement Midelement = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td"));
				String managerid = Midelement.getText();
				String sub = managerid.substring(9,managerid.length());
				assertTrue(sub.equals(Util.expmanagerid));
				System.out.println(sub);
				
			}
			else
			{
				
				System.out.println("login Unseccessfully");
				
			}
			
	}
	
	@Test
	public void closeallication()
	{
		driver.quit();
		System.out.println("close application");
	}

	public static void main(String[] args) throws InterruptedException {
		
		Test_1 obj = new Test_1();
		obj.openapplication();
		obj.login();
		obj.closeallication();

	}

}
