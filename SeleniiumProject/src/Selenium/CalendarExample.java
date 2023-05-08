package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://demo.automationtesting.in/Datepicker.html");
		WebElement date = dr.findElement(By.id("datepicker1"));
		date.click();
		WebElement date1 = dr.findElement(By.xpath("//a[@class='ui-datepicker-prev ui-corner-all']"));
		date1.click();
		WebElement date2 = dr.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/table/tbody/tr[2]/td[1]/a"));
		date2.click();
	
	}

}
