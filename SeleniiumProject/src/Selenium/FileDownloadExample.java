package Selenium;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownloadExample {

	public static void main(String[] args) {
		// ASSUME THE DOOWNLOADED FILE IS RESUME UPDATED
		//FILE LOCATION IS D:\DHARNEESH\RESUME
		// GOING TOO VERIFY THE ABOVE FILE IS PRESENTED IN THE LOCATION
		File file = new File("D:\\DHARNEESH\\RESUME");
		File[] a=file.listFiles();
		for (File string : a) {
			if(string.getName().equalsIgnoreCase("Resume Updated.pdf")) {
				System.out.println("presented");
				break;
			}
		}
	}

}
