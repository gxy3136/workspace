package nwd.mybatis.test.web.timerjob;

import org.springframework.stereotype.Component;

@Component
public class SynchronizeVoteInfo {
	public void doIt() {

		System.out.println("不继承QuartzJobBean方式-调度进行中...");
	}
}
