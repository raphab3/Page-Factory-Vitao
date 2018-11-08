package ubtech.core;

import static ubtech.core.DriverFactory.killDriver;

import org.junit.After;

public class BaseTest {
	
	@After
	public void finishTest() {
		if(Properties.CLOSER_BROWSER) {
			killDriver();
		}
		
	}

}
