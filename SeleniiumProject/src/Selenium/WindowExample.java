package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://testleaf.herokuapp.com/pages/Window.html");
		
		dr.manage().window().maximize();
		
		String str = dr.getWindowHandle();
		
		
		WebElement bt1 = dr.findElement(By.id("home"));
		bt1.click();
		
		Set<String> s = dr.getWindowHandles();
		
		for (String newwindow : s) {
			dr.switchTo().window(newwindow);
			
		}
		WebElement link =    dr.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img"));
		link.click();
		dr.close();
		
		dr.switchTo().window(str);
		
		WebElement bt2 = dr.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		bt2.click();
		int no = dr.getWindowHandles().size();
		System.out.println("no of window opened "+no);
		
		WebElement bt3 = dr.findElement(By.id("color"));
		bt3.click();
		
		Set<String> button3 = 	dr.getWindowHandles();
		for (String allwindow : button3) {
			if(! allwindow.equals(str)) {
				dr.switchTo().window(allwindow);
				dr.close();
				//dr.quit();
			}
				
			
		}
		
		
		
		
		
		
		
	}

}