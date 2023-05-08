package InterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.google.com");
		dr.manage().window().maximize();
		dr.findElement(By.name("q")).sendKeys("selenium");
		JavascriptExecutor je = (JavascriptExecutor) dr;
		je.executeScript("history.go(0)");
								// location.reload()
		
	}

}
