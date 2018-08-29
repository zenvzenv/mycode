package cn.zw.thread.info;
/**
 * 
 * <p>Title:InfoDemo01</p>
 * Thread.currentThread()	当前线程
 * setName()	设置名称
 * getName()	获取名称
 * isAlive()	是否存活
 * @author zhengwei
 * @date 2017-5-11 下午8:01:15
 */
public class InfoDemo01 {
	public static void main(String[] args) throws InterruptedException {
		MyThread my=new MyThread();
		Thread t1=new Thread(my);
		t1.setName("线程一");
		System.out.println(t1.getName());
		System.out.println(Thread.currentThread().getName());
		
		t1.start();
		System.out.println("启动后的状态"+t1.isAlive());
		my.stop();
		Thread.sleep(1000);
		System.out.println("停止后的状态"+t1.isAlive());
	}
}
