package nwd.mybatis.test.web.controller;

import java.util.HashMap;
import java.util.Map;

import nwd.mybatis.test.web.model.Demo;
import nwd.mybatis.test.web.service.DemoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/sample")
public class DemoController {

	@Autowired
	private DemoService service;

	@RequestMapping("/queryData")
	@ResponseBody
	public Map<String, Object> queryData(
			@RequestParam(required = false, value = "userId") String userId,
			@RequestParam(required = false, value = "phone") String phone) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", "200");
		map.put("message", "��Ա");
		return map;
	}

	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		return modelAndView;
	}

	@RequestMapping("/test")
	@ResponseBody
	public ModelAndView test(@ModelAttribute Demo demo) {
		ModelAndView modelAndView = new ModelAndView();
		// Demo demo = new Demo(Utils.randomString(10));
		// service.saveDemo(demo);
		// List<Demo> list = service.selectAll();
		// for (Demo obj : list) {
		// System.out.println(obj.getId() + "|" + obj.getContent());
		// }
		// modelAndView.addObject("demos", list);
		System.out.println(demo.getId() + "-----" + demo.getTest()
				+ "---------" + demo.getContent());
		Demo demo2 = (Demo) service.selectById(demo.getId());
		if (demo2 != null)
			System.out.println(demo2.getId() + "|" + demo2.getContent());
		modelAndView.setViewName("hello");
		return modelAndView;
	}

	public static void main(String[] args) {
		String testCode = "Test";
		byte[] bytes = testCode.getBytes();
		for (byte b : bytes) {
			System.out.print(b);
		}
		System.out.println();
		System.out.println(testCode.getBytes());
	}
}