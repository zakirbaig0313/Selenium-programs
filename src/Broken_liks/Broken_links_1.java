package Broken_liks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_links_1 {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// driver.get("https://demo.guru99.com/test/newtours/");
		// driver.get("https://automationpanda.com/2021/12/29/want-to-practice-test-automation-try-these-demo-sites/");
		// driver.get("https://webdriveruniversity.com/");
		driver.get("http://websites.milonic.com/newtours.demoaut.com");
		// Thread.sleep(4000);
		// driver.switchTo().window("a");

		List<WebElement> links = driver.findElements(By.tagName("a"));

		int size = links.size();

		System.out.println("No.of links in website:- " + size);

		System.out.println();
		System.out.println();

		for (int i = 0; i < size; i++) {
			WebElement element = links.get(i);

			String url = element.getAttribute("href");

			URL link = new URL(url);

			HttpURLConnection Httpcon = (HttpURLConnection) link.openConnection();

			// Thread.sleep(2000);

			Httpcon.connect();

			int rescode = Httpcon.getResponseCode();

			if (rescode > 400) {
				System.out.println(i + " " + url + "---> is broken link");
			} else {
				System.out.println(i + " " + url + "---> is Valid link");
			}
		}

	}

}
