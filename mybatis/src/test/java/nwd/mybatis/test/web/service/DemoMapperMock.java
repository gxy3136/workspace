package nwd.mybatis.test.web.service;

import java.util.List;

import nwd.mybatis.test.web.model.Demo;
import nwd.mybatis.test.web.service.mapper.DemoMapper;

public class DemoMapperMock implements DemoMapper {

	public Integer selectMaxDemoId() {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer saveDemo(Demo demo) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Demo> selectAll() {
		System.out.println("query DB...");
		return null;
	}

	public Demo selectById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
