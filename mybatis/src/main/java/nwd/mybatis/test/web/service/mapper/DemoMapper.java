package nwd.mybatis.test.web.service.mapper;

import java.util.List;

import nwd.mybatis.test.web.model.Demo;

public interface DemoMapper {
	public Integer selectMaxDemoId();

	public Integer saveDemo(Demo demo);

	public List<Demo> selectAll();

	public Demo selectById(int id);

}
