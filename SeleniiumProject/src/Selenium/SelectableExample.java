package Selenium;

import java.util.*;
import java.lang.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://demo.automationtesting.in/Selectable.html");
		List<WebElement> select = dr.findElements(By.xpath("//*[@id=\'Default\']/ul/li"));
		Actions action = new Actions(dr);
		action.keyDown(Keys.SHIFT).click(select.get(0));
		action.keyDown(Keys.SHIFT).click(select.get(1)).build().perform();
	}

}
