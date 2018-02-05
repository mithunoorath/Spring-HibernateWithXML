package mithun.learn.test;

//import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import mithun.config.MithunConfig;
import mithun.learn.samples.App;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {MithunConfig.class})

public class AppTest {

	@Autowired
	private App app;
	
	
	@Test
	public void testPrintMessage() {
		Integer messageToTest = 1000;
		assertFalse(!app.printMessage(messageToTest));
		
	}

}
