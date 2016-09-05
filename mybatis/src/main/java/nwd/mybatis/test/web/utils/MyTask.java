package nwd.mybatis.test.web.utils;

public class MyTask implements Runnable {
	private String taskName;

	public MyTask(String taskName) {
		this.taskName = taskName;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("task  " + taskName + " start work");
		for (int i = 0; i < 30; i++) {
			System.out.println("[" + taskName + "_" + i + "]");
		}
		System.out.println("task " + taskName + " end work");
	}

}
