package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestSuiteExample {
	
	WebDriver dr;
	  long starttime; 
	  long endtime;
	 
	  @BeforeSuite 
	  public void google() { starttime= System.currentTimeMillis();
	  System.setProperty("webdriver.chrome.driver",
	  "D:\\chrome\\chromedriver.exe "); 
	 dr = new ChromeDriver(); }
	  
	@Test
	public void opengoogle() {
		dr.get("http://google.com");
	}
	 
	  @Test public void openyoutube() { 
		  dr.get("http://youtube.com"); 
		  }
	  
	  @Test public void openamazon() { 
		  dr.get("http://amazon.in"); 
		  }
	  
	 @AfterSuite 
	 public void time(){ 
		 dr.quit(); endtime =
	  System.currentTimeMillis(); long total = starttime-endtime;
	 System.out.println("time is "+total); 
	 }
	 
//	@Test
//	public void opengoogle() {
//		long starttime = System.currentTimeMillis();
//		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe ");
//		WebDriver dr = new ChromeDriver();
//		dr.get("http://google.com");
//		dr.quit();
//		long endtime = System.currentTimeMillis();
//		long total = starttime - endtime;
//		System.out.println("time is " + total);
//	}
//	@Test
//	public void openyou() {
//		long starttime = System.currentTimeMillis();
//		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe ");
//		WebDriver dr = new ChromeDriver();
//		dr.get("http://youtube.com");
//		dr.quit();
//		long endtime = System.currentTimeMillis();
//		long total = starttime - endtime;
//		System.out.println("time is " + total);
//	}
//	@Test
//	public void openamazon() {
//		long starttime = System.currentTimeMillis();
//		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe ");
//		WebDriver dr = new ChromeDriver();
//		dr.get("http://amazon.in");
//		dr.quit();
//		long endtime = System.currentTimeMillis();
//		long total = starttime - endtime;
//		System.out.println("time is " + total);
//	}
}
