package nwd.mybatis.test.web.controller.test;

public class TestController {
	public static void main(String[] args) {
		try {
			if (1 == 1) {
				System.out.println("444444444444444444444");
				throw new Exception("��ӷ�����Ϣʧ��");
			}
			System.out.println("3333333333");
		} catch (Exception e) {
			System.out.println("sssss");
		}
	}
}
