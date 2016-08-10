package mybatis;

import nwd.mybatis.test.web.model.Demo;
import nwd.mybatis.test.web.service.DemoService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContextTest.xml")
public class DemoServiceTest extends AbstractJUnit4SpringContextTests {
	@Autowired
	private DemoService service;

	@Test
	public void testGetV() {
		Demo demo = service.selectById(1);
		System.out.println(demo.getId() + "----" + demo.getContent());
	}
}
