package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\\\\\\\drivers\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Actions/index.html#");
		
		driver.manage().window().maximize();
		
		// mouse over first link
		
		WebElement link_first = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[1]/button"));
		
		WebElement link1 = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[1]/div/a"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(link_first).contextClick(link1).click().build().perform();
		
		String text1 = driver.switchTo().alert().getText();
		
		System.out.println(text1);
		
		Thread.sleep(9000);
		
		driver.switchTo().alert().accept();
		
		// mouse over second link
		
WebElement second_link = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[2]/button"));
		
		WebElement link2 = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[2]/div/a"));
		
		act.moveToElement(second_link).contextClick(link2).click().build().perform();
		
		String text2 = driver.switchTo().alert().getText();
		
		System.out.println(text2);
		
		Thread.sleep(9000);
		
		driver.switchTo().alert().accept();
		
		// mouse over third link
		
WebElement third_link = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[3]/button"));
		
		WebElement link3 = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[3]/div/a[2]"));
		
		act.moveToElement(third_link).contextClick(link3).click().build().perform();
		
		String text3 = driver.switchTo().alert().getText();
		
		System.out.println(text3);
		
		Thread.sleep(9000);
		
		driver.switchTo().alert().accept();
		
		driver.close();

	}

}
