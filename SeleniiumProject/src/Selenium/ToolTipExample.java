package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://google.com");
		dr.manage().window().maximize();
		WebElement google  = dr.findElement(By.name("q"));
		String title = google.getAttribute("title");
		System.out.println(title);
		dr.quit();
	}

}
