package Selenium;

import java.time.Duration;

import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.amazon.in");
		WebElement tb = dr.findElement(By.id("twotabsearchtextbox"));
		tb.sendKeys("vega trimmer"+Keys.ENTER);
		//WebElement text =dr.findElement(By.xpath("//*[contains(text(),'P1')]"));
		//text.click();
		Wait<WebDriver> wait = new FluentWait<WebDriver>(dr).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
	WebElement tb1=	wait.until(new Function<WebDriver, WebElement>(){
			public WebElement apply(WebDriver dr) {
				WebElement tb;
				return  dr.findElement(By.xpath("//*[contains(text(),'P1')]"));				
			}
		});
	tb1.click();
		}
	}

