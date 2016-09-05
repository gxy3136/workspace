package mybatis;

import java.util.List;

import nwd.mybatis.test.web.model.Demo;
import nwd.mybatis.test.web.service.mapper.DemoMapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContextDaoTest.xml")
public class DemoMapperTest extends	AbstractTransactionalJUnit4SpringContextTests {
	
	@Autowired
	DemoMapper mapper;

	@Test
	public void testSelectAll() {
		List<Demo> list = mapper.selectAll();
		System.out.println(list.size());
	}

}
