package cn.zw.thread.status;


public class ThreadSleepDemo02 {
	public static void main(String[] args) {
		//真实角色
		Web12306 web=new Web12306();
		//创建代理，引用真实角色
		Thread t1=new Thread(web,"黄牛1");
		Thread t2=new Thread(web,"黄牛2");
		Thread t3=new Thread(web,"黄牛3");
		//启动线程
		t1.start();
		t2.start();
		t3.start();
	}
}
class Web12306 implements Runnable{
	private int num=100;

	@Override
	public void run() {
		while(true){
			if (num<=0) {
				break;
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"抢到了"+num--);
		}
	}
}