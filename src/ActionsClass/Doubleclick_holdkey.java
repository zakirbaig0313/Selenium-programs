package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick_holdkey {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "E:\\\\\\\\drivers\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Actions/index.html#");
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement Doubleclick = driver.findElement(By.xpath("//*[@id=\"double-click\"]/h2"));
		
		act.doubleClick(Doubleclick).build().perform();
		
		Thread.sleep(10000);
		
		
		WebElement holdkey = driver.findElement(By.xpath("//*[@id=\"click-box\"]"));
		
		act.clickAndHold(holdkey).build().perform();
		
		
	//	System.out.println("ji");
	}

}
