package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "E:\\\\\\\\drivers\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
			
		driver.switchTo().frame(0);
		WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		
		//act.moveToElement(slider).dragAndDropBy(slider, 100, 0).build().perform(); //another methods to sliding
		act.clickAndHold(slider).moveToElement(slider, 50, 0).build().perform();
		Thread.sleep(10000);
		act.clickAndHold(slider).moveToElement(slider, 350, 0).build().perform();
		Thread.sleep(10000);
		act.clickAndHold(slider).moveToElement(slider, -400, 0).build().perform();
		

	}

}
