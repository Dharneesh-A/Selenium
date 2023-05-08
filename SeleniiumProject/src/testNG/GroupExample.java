package testNG;

import org.testng.annotations.Test;

public class GroupExample {
	@Test(groups = {"apple"})
public void appleXR() {
		System.out.println("AppleXR");
	}
	@Test(groups = {"apple"})
public void apple13() {
		System.out.println("Apple13");
	}
	@Test(groups = {"oppo"})
public void oppoA9() {
		System.out.println("oppoA9");
	}
@Test(groups = {"oppo"})
public void oppoF11() {
	System.out.println("oppoF11");
}
@Test(groups = {"vivo"})
public void vivoA9() {
	System.out.println("vivoA9");
}
@Test(groups = {"vivo"})
public void vivo21() {
	System.out.println("vivo21");
}
@Test(groups = {"nokia"})
public void nokia1() {
	System.out.println("nokia1");
}
@Test(groups = {"nokia"})
public void nokia2() {
	System.out.println("nokia2");
}
}
