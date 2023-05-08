package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://testleaf.herokuapp.com/pages/frame.html");
		dr.manage().window().maximize();
		
		
		dr.switchTo().frame(0);
		WebElement bt1 = dr.findElement(By.id("Click"));
		bt1.click();
		String text =  bt1.getText();
		System.out.println(text);
		
		dr.switchTo().defaultContent();
		
		dr.switchTo().frame(1);
		dr.switchTo().frame("frame2");
		
		WebElement bt2 = dr.findElement(By.id("Click1"));
		bt2.click();
		
		dr.switchTo().defaultContent();
		
		List<WebElement> bt3 = dr.findElements(By.tagName("iframe"));
		int size = bt3.size();
		System.out.println(size);
		dr.quit();
	}

	
}
