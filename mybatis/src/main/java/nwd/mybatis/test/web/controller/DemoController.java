package nwd.mybatis.test.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nwd.mybatis.test.web.model.Demo;
import nwd.mybatis.test.web.service.DemoService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;

@Controller
@RequestMapping("/sample")
public class DemoController {

	protected Logger logger = Logger.getLogger(DemoController.class);

	@Autowired
	private DemoService service;

	@RequestMapping("/login")
	@ResponseBody
	public Map<String, Object> login(
			@RequestParam(required = false, value = "userId") String userId,
			@RequestParam(required = false, value = "phone") String phone) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			List<Demo> list = service.selectAll();
			result.put("code", "1000");
			result.put("message", "�ɹ�");
			result.put("model", list);
		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}

	public void testGetV1() {
		System.out.println("This is developer brach...");
	}

	@RequestMapping("/checkUser")
	@ResponseBody
	public Map<String, Object> checkUser(
			@RequestParam(required = false, value = "userId") String userId,
			@RequestParam(required = false, value = "phone") String phone) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			System.out.println("hello");
		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}

	@RequestMapping("/vote")
	@ResponseBody
	public Map<String, Object> vote(
			@RequestParam(required = false, value = "userId") String userId,
			@RequestParam(required = false, value = "phone") String phone) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			System.out.println("hello");
		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}

	/**
	 * @param requestBody
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/bind")
	public Map<String, Object> bind(@RequestBody JSONObject requestBody) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {

		} catch (Exception e) {
			logger.error(e);
		}
		return result;
	}

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

}
