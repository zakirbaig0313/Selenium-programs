package Broken_liks;

import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Broken_links_3 {

	public static void main(String[] args) throws IOException,InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://websites.milonic.com/newtours.demoaut.com");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		int size = links.size();
		System.out.println(size);
		
		for(int i=0; i<size; i++)
		{
			WebElement element = links.get(i);
			String url = element.getAttribute("href");
			
			URL link = new URL(url);
			HttpURLConnection httpcon = (HttpURLConnection) link.openConnection();
			
			httpcon.connect();
			int rescode = httpcon.getResponseCode();
			System.out.println(rescode);
			String str=httpcon.getResponseMessage();
			
			System.out.println(str);
		}

	}

}
