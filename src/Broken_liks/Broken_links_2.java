package Broken_liks;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_links_2 {

	public static void main(String[] args) throws IOException, InterruptedException {

		// Intiate driver
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize the window page
		driver.manage().window().maximize();

		// Implicit wait for 10 secs
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Open the URL of app
		// driver.get("https://demo.guru99.com/test/newtours/");
		driver.get("https://www.demo.guru99.com/V4/index.php");
		// driver.get("https://www.ardisenviro.com/");
		// driver.get("https://jqueryui.com/demos/");
		// driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		// Wait
		Thread.sleep(5000);

		// Capture links from a webpage
		// All links store the list class by using findElements not findElement
		List<WebElement> links = driver.findElements(By.tagName("a"));

		// Number of links size
		int size = links.size();
		System.out.println("No.of links in WebSite :- " + size + "Nos");

		// All links are open and check it is working or not (404 error)
		// by using for loop
		for (int i = 0; i < size; i++) {
			// by using href attribute we can get url of required link
			// get links one by one by sing loop system
			WebElement Element = links.get(i);

			// store the String varible
			String url = Element.getAttribute("href");

			// string into convert url by using URL class
			// URL link = new URL(url);
			URL link = new URL(url);

			// introduce new class HttpConnection open and click operation
			// Create a connection using url object "link"
			HttpsURLConnection httpcon = (HttpsURLConnection) link.openConnection();

			// wait time 2 sec
			Thread.sleep(2000);

			// connect to Httplink
			httpcon.connect();
			int rescode = httpcon.getResponseCode();

			// condiotion of below 400 code will be valid link and above 400 is broken link
			// broken link is 4XX and 5XX
			// 4XX is clint Error
			// 5XX is server Error
			if (rescode > 400) {
				System.out.println(url + "---> is Broken link");
			} else {
				System.out.println(url + "---> is Valid link");
			}

		}

	}

}
