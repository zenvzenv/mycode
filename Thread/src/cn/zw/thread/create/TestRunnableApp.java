package cn.zw.thread.create;
/**
 * 
 * <p>Title:TestRunnableApp</p>
 * @author zhengwei
 * @date 2017-5-11 下午2:00:23
 */
public class TestRunnableApp {
	public static void main(String[] args) {
		//创建真实角色
		TestRunnable te=new TestRunnable();
		//创建代理角色+真实角色引用
		Thread proxy=new Thread(te);
		//调用start()方法
		proxy.start();
		for (int i = 0; i < 1000; i++) {
			System.out.println("唱着歌");
		}
	}
}
