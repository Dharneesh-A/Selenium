package Selenium;


import org.openqa.selenium.Point;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://google.com");
		
		WebElement google = 	dr.findElement(By.name("q"));
		google.sendKeys("testleaf.herokuapp.com"+Keys.ENTER);
		dr.findElement(By.partialLinkText("Selenium Playground")).click();
		dr.manage().window().maximize();
		dr.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a/img")).click();

		//GET POSITION 
		WebElement bt1= dr.findElement(By.id("position"));
		Point xy = 	bt1.getLocation(); 
		int  x= xy.getX();
		int  y = xy.getY();
		System.out.println(x +" ,"+ y);
		// get color
	WebElement bt2 = dr.findElement(By.id("color"));	
	String color = bt2.getCssValue("background-color");
	
	System.out.println(color);
	// get size 
	
	WebElement bt3 = dr.findElement(By.id("size"));
	 int height = bt3.getSize().getHeight();
	 int width = bt3.getSize().getWidth();
	System.out.println(height +","+ width);
	
	}
}



