package mybatis;

import java.util.Map;

import nwd.mybatis.test.web.controller.DemoController;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContextTest.xml")
public class DemoControllerTest extends AbstractJUnit4SpringContextTests {
	@Autowired
	private DemoController controller;

	@Test
	public void testGetV() {
		Map<String, Object>  result = controller.login("10000", "13888888888");
		System.out.println("hello world |"+result);
	}
}
