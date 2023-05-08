package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.navigate().to("http://testleaf.herokuapp.com/pages/Link.html");
	 WebElement link1 = dr.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/a"));
	 link1.click();
	 dr.navigate().back();
	WebElement link2 =  dr.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/a"));
	
	String where = link2.getAttribute("href");
	System.out.println("this link is going to:"+where);
	WebElement link3  = dr.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/a"));
	link3.click();
	String title= dr.getTitle();
	System.out.println(title);	
	 if (title.contains("404")) {
		 System.out.println("link is broken");
	 }
	 else{
		 System.out.println("link not broken");
	 }
	 dr.navigate().back();
	 WebElement link4 = dr.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/a"));
	 link4.click();
	 dr.navigate().back();
	 List<WebElement> link5 = dr.findElements(By.tagName("a"));
	int size = link5.size();

	 System.out.println(size);

	}

}
