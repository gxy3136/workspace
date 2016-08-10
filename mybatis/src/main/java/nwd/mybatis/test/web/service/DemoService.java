package nwd.mybatis.test.web.service;

import java.util.List;

import nwd.mybatis.test.web.model.Demo;

public interface DemoService {

	public List<Demo> selectAll();

	public Demo selectById(int id);

	public Integer saveDemo(Demo demo);
}
