package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParllelExecutionExample {
	@Test
	public void opengoole() {
		 System.setProperty("webdriver.chrome.driver",
				  "D:\\chrome\\chromedriver.exe "); 
				  WebDriver dr  = new ChromeDriver();
				  dr.get("https:\\www.google.com");
				  dr.quit();
	}
@Test
public void openamazon() {
	System.setProperty("webdriver.chrome.driver",
			  "D:\\chrome\\chromedriver.exe "); 
			  WebDriver dr  = new ChromeDriver();
			  dr.get("https:\\www.amazon.in");
			  dr.quit();
	}
}
