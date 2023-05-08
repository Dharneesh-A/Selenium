package InterviewQuestions;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MaximizeWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--start-maximized");		
		WebDriver dr = new ChromeDriver(option);
		dr.get("https://www.google.com");
		/*
		 * Dimension dimension = new Dimension(1366, 768);
		 * dr.manage().window().setSize(dimension);
		 */
		
	}

}
