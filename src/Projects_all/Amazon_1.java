package Projects_all;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_1 {
	public static WebDriver driver;

	public void openBrowser() {

		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		// driver.get("https://www.flipkart.com/");
		// driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.in/");

	}

	public void main(String srch) {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(srch);
		driver.findElement(By.id("nav-search-submit-button")).click();

		for (int i = 10; i > 0; i--) {
			WebElement element = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div["
					+ i + "]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
			String text = element.getText();
			// System.out.println(text);

			if (text.equalsIgnoreCase(srch)) {
				// WebElement element1
				// =driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div["+i+"]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
				System.out.println(text);
				WebElement element1 = driver
						.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[" + i
								+ "]/div/div/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[1]/div/a/span/span[2]/span[2]"));
				String text1 = element1.getText();
				System.out.println(text1);

				i = 0;
			} else {
				System.out.println("it not fond");

			}
		}
		// driver.switchTo().frame(0);

	}

	public static void main(String[] args) {

		
		
		  Amazon_1 obj = new Amazon_1();
		  
		  obj.openBrowser(); obj.main("Apple iPhone 12 (64GB) - Black");
		 

		
		  //Flipkart_1 obj1 = new Flipkart_1();
		  
		  //obj1.openBrowser(); obj1.main("APPLE iPhone 11 (Black, 128 GB)");
		 
	}

}
