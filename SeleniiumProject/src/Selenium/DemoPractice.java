package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://demo.automationtesting.in/Index.html");
		dr.manage().window().maximize();
		WebElement bt = dr.findElement(By.xpath("//*[@id=\'btn2\']"));
		bt.click();
		WebElement fn = dr.findElement(By.xpath("//*[@id=\'basicBootstrapForm\']/div[1]/div[1]/input")); 
		fn.click();
		fn.sendKeys("surya");
		WebElement ln = dr.findElement(By.xpath("//*[@id=\'basicBootstrapForm\']/div[1]/div[2]/input")); 
		ln.sendKeys("surya");
		WebElement add = dr.findElement(By.xpath("//*[@id=\'basicBootstrapForm\']/div[2]/div/textarea"));
		add.sendKeys("coimbatore");
		WebElement mail = dr.findElement(By.xpath("//*[@id=\'eid\']/input"));
		mail.sendKeys("abc.gamil.com");
		WebElement ph = dr.findElement(By.xpath("//*[@id=\'basicBootstrapForm\']/div[4]/div/input"));
		ph.sendKeys("1234567890");
		WebElement select = dr.findElement(By.id("checkbox1"));
		select.click();
		WebElement select1 = dr.findElement(By.id("checkbox2"));
		select1.click();
		WebElement select2 = dr.findElement(By.id("checkbox3"));
		//select2.click();
		if(select2.isSelected()) {
			select2.click();
		}
		boolean bool = select.isSelected();
		System.out.println(bool);
		WebElement dd = dr.findElement(By.id("Skills"));
		Select sel = new Select(dd);
		sel.selectByValue("Java");
		
		
		WebElement ch = dr.findElement(By.xpath("//*[@id=\'basicBootstrapForm\']/div[5]/div/label[1]/input"));
		ch.click();
		//Male
	}

}
