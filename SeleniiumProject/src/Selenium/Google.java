package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://google.com");
		
	WebElement google = 	dr.findElement(By.name("q"));
		google.sendKeys("testleaf.herokuapp.com"+Keys.ENTER);
		dr.findElement(By.partialLinkText("Selenium Playground")).click();
		dr.manage().window().maximize();
		dr.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img")).click();
		
		
	
		// TEXT BOX 1 
		WebElement tb1 = 	dr.findElement(By.id("email"));
		tb1.sendKeys("hello@gmail.com");
		//TEXT BOX 2
		 WebElement tb2 = dr.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		 tb2.sendKeys("hello");
		 //TEXTBOX 3
		 WebElement tb3 = dr.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input"));
		 String s= tb3.getAttribute("value");
		 System.out.println(s);
		 //TEXTBOX 4
		WebElement tb4 =  dr.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
		 tb4.clear();
		 //TEXTBOX 5
		 WebElement tb5  = dr.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
		boolean b=  tb5.isEnabled();
		 System.out.println(b);
		
		
		 
		 
		 
		
		
	}

}
