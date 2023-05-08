package Selenium;

import java.io.File;

public class FileExample {

	public static void main(String[] args) {
		File file = new File("D:\\DHARNEESH");
		File [] total = file.listFiles();
		for (File files : total) {
			if (files.getName().equals("Signature.jpg")) {
				System.out.println("file is presented");
				
		}
			
			
		}
	}

}
