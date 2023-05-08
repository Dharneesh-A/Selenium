package InterviewQuestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearchSuggestions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	        //By suggestionsLocator = By.cssSelector(".erkvQe");
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@jsname='bw4e9b']//following::li")));

	        // Find search suggestions element and print the suggestions
			
			  List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@jsname='bw4e9b']//following::li")); 
			  for
			  (WebElement suggestion : suggestions) {
			 System.out.println(suggestion.getText()); }
			
			/*
			 * List<WebElement> gs =
			 * driver.findElements(By.xpath("//ul[@jsname='bw4e9b']//following::li"));
			 * System.out.println(gs.size()); for (WebElement webElement : gs) {
			 * System.out.println(webElement.getText()); }
			 */

	}
	
	
}
