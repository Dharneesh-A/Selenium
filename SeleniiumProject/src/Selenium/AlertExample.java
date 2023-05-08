package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://testleaf.herokuapp.com/pages/Alert.html");
		
		// ALERT BOX
		WebElement alert1 = dr.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		alert1.click();
		Alert a= dr.switchTo().alert();
	
		a.accept();
		
		//ALERT 2
		WebElement alert2 = dr.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		alert2.click();
		Alert b= dr.switchTo().alert();
		
		b.dismiss();
		
		//ALERT 3
		
		WebElement alert3 = dr.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		alert3.click();
		Alert c= dr.switchTo().alert();
		
		c.sendKeys("hello");
		c.accept();
		
	}

}
