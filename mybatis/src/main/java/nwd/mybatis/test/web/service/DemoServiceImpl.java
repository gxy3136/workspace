package nwd.mybatis.test.web.service;

import java.util.List;

import nwd.mybatis.test.web.model.Demo;
import nwd.mybatis.test.web.service.mapper.DemoMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

	@Autowired
	private DemoMapper mapper;

	public List<Demo> selectAll() {
		List<Demo> demos;
		demos = mapper.selectAll();
		return demos;
	}

	public Demo selectById(int id) {
		Demo demo = mapper.selectById(id);
		return demo;
	}

	public Integer saveDemo(Demo demo) {
		Integer id = mapper.selectMaxDemoId();
		demo.setId(id);
		return mapper.saveDemo(demo);
	}
}
