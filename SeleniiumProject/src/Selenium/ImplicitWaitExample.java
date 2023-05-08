package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ImplicitWaitExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dr.manage().window().maximize();
		dr.get("https://www.amazon.in");
		WebElement tb = dr.findElement(By.id("twotabsearchtextbox"));
		
		tb.sendKeys("vega trimmer"+Keys.ENTER);
		WebElement text =dr.findElement(By.xpath("//*[contains(text(),'P1')]"));
		text.click();
		WebElement img =dr.findElement(By.xpath("//*[@id=\'a-autoid-15-announce\']/div/div[2]"));
		img.click();
		
	}

}
