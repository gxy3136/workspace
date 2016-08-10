package nwd.mybatis.test.web.model;

public class Demo {
	private int id;
	private String content;
	private String test;

	public Demo() {
		super();
	}

	public Demo(int id, String content) {
		super();
		this.id = id;
		this.content = content;
	}

	public Demo(String content) {
		super();
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public int getId() {
		return id;
	}

	public String getTest() {
		return test;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTest(String test) {
		this.test = test;
	}

}
