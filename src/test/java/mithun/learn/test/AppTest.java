package mithun.learn.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mithun.learn.samples.services.AppImpl;

public class AppTest {
	ApplicationContext applicationContext;
	AppImpl appImpl;
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("Spring-Config.xml");
		appImpl = (AppImpl)applicationContext.getBean("appImpl");
	}

	@Test
	public void testGetLocations() {
		assertNotNull(appImpl.getLocations());
	}

}
