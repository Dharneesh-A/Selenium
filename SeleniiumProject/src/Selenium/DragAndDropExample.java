package Selenium;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://leafground.com/drag.xhtml;jsessionid=node06x4nqrbagopw10oidfg2ysq86431772.node0");
		dr.manage().window().maximize();
		WebElement from = dr.findElement(By.xpath("//*[@id=\'form:drag_content\']/p"));
		WebElement to = dr.findElement(By.id("form:drop_content"));
		
		Actions action = new Actions(dr);
		//action.clickAndHold(from).moveToElement(to).release(to).build().perform();
		action.dragAndDrop(from, to).build().perform();   // easy method
	}

}
