package cn.zw.thread.create;
/**
 * 
 * <p>Title:TestRunnableApp</p>
 * @author zhengwei
 * @date 2017-5-11 ����2:00:23
 */
public class TestRunnableApp {
	public static void main(String[] args) {
		//������ʵ��ɫ
		TestRunnable te=new TestRunnable();
		//���������ɫ+��ʵ��ɫ����
		Thread proxy=new Thread(te);
		//����start()����
		proxy.start();
		for (int i = 0; i < 1000; i++) {
			System.out.println("���Ÿ�");
		}
	}
}
