package testNG;

import org.testng.annotations.Test;

public class HandlingDependency {
		@Test(enabled=true)
		//IF IT IS TRUE DEPENDING TESTCASE WILL RUN
		//IF IT IS FALSE DEPENDING TESTCASE WONT RUN
		public void class10() {
		System.out.println("10th pass");
		
	}
		@Test(dependsOnMethods = "class10")
		// DEPENDS ON CLASS10
		public void class12() {
		System.out.println("12th pass");
	}
		@Test(dependsOnMethods = "class12")
		//DEPENDS ON CLASS12
		public void college(){
		System.out.println("entered college");
		}
	}

