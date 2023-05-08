package Selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutoCompleteExample {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://google.com");
		dr.manage().window().maximize();
		
		WebElement tb1 =dr.findElement(By.name("q"));
			tb1.sendKeys("selenium");
		
;		List<WebElement> option = dr.findElements(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div/ul/li"));
		System.out.println(option.size());
	
		for (WebElement list : option) {
			String l = list.getText();
			System.out.println(l);
			if (l.equalsIgnoreCase("selenium testing")) {
			list.click();
			break;
			}
		}
	}
}

