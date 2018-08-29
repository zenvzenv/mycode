package cn.zw.thread.create;
/**
 * 推荐使用实现Runnable接口方法创建线程
 * 1.避免单继承带来的局限性
 * 2.便于共享资源
 * <p>Title:TestRunnable</p>
 * 使用Runnable创建线程
 * 1.类实现Runnable接口，重现run()--->真实角色
 * 2.启动多线程  使用静态代理
 * 	a.创建真实角色
 * 	b，创建代理角色+真实角色引用
 * 	c.调用start()方法
 * @author zhengwei
 * @date 2017-5-11 下午1:42:25
 */
public class TestRunnable implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("吃着火锅");
		}
	}
}
