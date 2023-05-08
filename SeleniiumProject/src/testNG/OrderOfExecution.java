package testNG;

import org.testng.annotations.Test;
// TO SEARCH SOMETHING IN GOOGLE
public class OrderOfExecution {
	@Test(priority=0)
	// WITHOUT USING PRIORITY ATTRIBUTE IT WILL ACCORDING TO ALPHABETIC ORDER OF METHODS
	public void PressPowerButton() {
	System.out.println("System Started");
	
}
	@Test(priority=1)
	public void StartChrome() {
	System.out.println("Chrome Started");
}
	@Test(priority=2)
	public void Search(){
	System.out.println("Search what you want ");
	}
}
