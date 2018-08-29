package cn.zw.thread.create;
/**
 * 
 * <p>Title:Demo01</p>
 * 模拟龟兔赛跑
 * 1.创建多线程		继承Thread+重写run()线程体
 * 2.使用线程，创建子类对象，调用对象的start()方法来启动线程
 * @author zhengwei
 * @date 2017-5-11 下午1:07:31
 */
public class Tuzi extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("兔子跑了"+i+"步");
		}
	}
}
class Wugui extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("乌龟跑了"+i+"步");
		}
	}
}