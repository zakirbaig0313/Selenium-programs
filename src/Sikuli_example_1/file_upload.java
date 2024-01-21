package Sikuli_example_1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class file_upload {

	public static void main(String[] args) throws FindFailed {
		
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://webdriveruniversity.com/File-Upload/index.html");
		
		Actions act = new Actions(driver);
		
		act.click(driver.findElement(By.id("myFile"))).build().perform();
		
		Pattern p1 = new Pattern("C:\\Users\\HUSSAIN\\Desktop\\sikuli option\\textbox.PNG");
		Pattern p2 = new Pattern("C:\\Users\\HUSSAIN\\Desktop\\sikuli option\\openclick.PNG");
		//Pattern p3 = new Pattern("C:\\Users\\HUSSAIN\\Desktop\\sikuli option\\pic.PNG");
		
		Screen sc = new Screen();
		//sc.doubleClick(p3);
		sc.type(p1, "\"C:\\Users\\HUSSAIN\\Desktop\\zakir baig Automation testing\\zakir_sukuli.txt\"");
		sc.click(p2);
		
		driver.findElement(By.id("submit-button")).click();
		
		String element = driver.switchTo().alert().getText();
		System.out.println(element);
		driver.switchTo().alert().accept();
		
		
	}

}
