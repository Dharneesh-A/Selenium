package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.ilovepdf.com/pdf_to_word");
	WebElement bt =
			dr.findElement(By.id("pickfiles"));
	bt.click();
	
	
	//selecting the file to upload
	StringSelection select = new StringSelection("D:\\DHARNEESH\\DHARNEESH RESUME.pdf");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
	
	// robot class is used to perform keyboard actions
	Robot robo = new Robot();
	robo.keyPress(KeyEvent.VK_CONTROL);
	robo.keyPress(KeyEvent.VK_V);
	robo.keyRelease(KeyEvent.VK_V);
	robo.keyRelease(KeyEvent.VK_CONTROL);
//	robo.keyPress(KeyEvent.VK_ENTER);
//	robo.keyRelease(KeyEvent.VK_ENTER);
	
	}

}
