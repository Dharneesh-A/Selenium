package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitwaitExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.flipkart.com");
		WebElement alert = dr.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		alert.click();
		WebElement tb =dr.findElement(By.xpath("//input[@name='q']"));
		tb.sendKeys("vega trimmer"+Keys.ENTER);
		
		WebDriverWait wait = new WebDriverWait(dr,Duration.ofSeconds(10));
		WebElement ew =	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'S2')]"+Keys.ENTER)));
		ew.click();

		
	}

}
