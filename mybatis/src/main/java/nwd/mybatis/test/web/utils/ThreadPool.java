package nwd.mybatis.test.web.utils;

import java.awt.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ThreadPool {
	class test {
		boolean s;

		public boolean isS() {
			return s;
		}

		public void setS(boolean s) {
			this.s = s;
		}

	}

	public class Aa {
		private int id;
		private String name;
		private String address;
		private String description;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Aa() {
		}

	}

	public static void main(String args[]) {
		ArrayList a = new ArrayList();
		a.add("1111111");
		a.add("1111111");
		a.add("1111111");
		a.add("1111111");
		System.out.println(a.size());
		// ExecutorService threadPool = Executors.newFixedThreadPool(2);
		// MyTask t1 = new MyTask("MT1");
		// MyTask t2 = new MyTask("MT2");
		// MyTask t3 = new MyTask("MT3");
		// threadPool.execute(t1);
		// threadPool.execute(t2);
		// threadPool.execute(t3);
		// for(;;){
		// System.out.println("hello");
		// }
		// try {
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// Date end = sdf.parse("2016-08-25 10:58:59");
		// Date now = new Date();
		// System.out.println(now.compareTo(end));
		// } catch (ParseException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
	}
}
