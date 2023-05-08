package testNG;
import org.testng.Assert;
import org.testng.annotations.*;
public class AssertionExample {
	String name = "surya";
	boolean bool = true;
@Test
public void checkEquual() {
	
	
	//Assert.assertEquals(name, "surya");
	Assert.assertTrue(bool,"this is true");
	
	}

}
