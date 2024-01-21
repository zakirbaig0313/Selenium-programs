// this link run prgram amazon_1 

package Projects_all;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_1 {

	public static WebDriver driver;

	public void openBrowser() {

		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		// driver.switchTo().newWindow(WindowType.TAB);
		// driver.get("https://www.amazon.in/");
		// driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

	}

	public void main(String srch) {
		driver.findElement(By.name("q")).sendKeys(srch);
		driver.findElement(By.className("L0Z3Pu")).click();

		for (int i = 2; i < 10; i++) {
			System.out.println("hi");
			WebElement element = driver.findElement(
					By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div["+i+"]/div/div/div/a/div[2]/div[1]/div[1]"));
			String text = element.getText();
			 System.out.println(text);

			if (text.equalsIgnoreCase(srch)) {
				// WebElement element1
				// =driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div["+i+"]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
				System.out.println(text);
				WebElement element1 = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div["
						+ i + "]/div/div/div/a/div[2]/div[2]/div[1]/div[1]/div[1]"));
				String text1 = element1.getText();
				System.out.println(text1);

				i = 0;
			} else {
				System.out.println("it not fond");

			}
		}
		// driver.switchTo().frame(0);

	}

}
