package Selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://google.com");


		WebElement google = 	dr.findElement(By.name("q"));
		google.sendKeys("testleaf.herokuapp.com"+Keys.ENTER);
		dr.findElement(By.partialLinkText("Selenium Playground")).click();
		dr.manage().window().maximize();
		dr.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[5]/a/img")).click();
		
		
		WebElement dd6 = dr.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		Select multi = new Select(dd6);
		multi.selectByIndex(1);
		multi.selectByIndex(2);
		
		
	}

}
