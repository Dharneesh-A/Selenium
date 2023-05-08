package InterviewQuestions;
import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotExample {

	public static void main(String[] args) throws IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.google.com");
		dr.manage().window().maximize();
		/*
		 * TakesScreenshot ss = (TakesScreenshot) dr; File file =
		 * ss.getScreenshotAs(OutputType.FILE); File designation = new
		 * File("D://seleniumss.png"); FileHandler.copy(file, designation);
		 */
		//ANOTHER WAY USING ROBOT CLASS
		Robot robo = new Robot();
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect = new Rectangle(size);
		BufferedImage buff = robo.createScreenCapture(rect);
		File desination = new File("D://screenshot.png");
		ImageIO.write(buff, "png", desination);
		 
	
	
	}
	
}
