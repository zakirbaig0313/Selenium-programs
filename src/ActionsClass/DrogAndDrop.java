package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrogAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "E:\\\\\\\\drivers\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Actions/index.html#");
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement sourse = driver.findElement(By.xpath("//*[@id=\"draggable\"]/p/b"));
		
		WebElement target = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		//act.clickAndHold(sourse).moveToElement(target).release().build().perform();
		
		Thread.sleep(10000);
		
		act.dragAndDrop(sourse, target).build().perform();
	}
}