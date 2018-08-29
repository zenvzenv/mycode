package cn.zw.thread.info;
/**
 * 
 * <p>Title:InfoDemo02</p>
 * 优先级：不是绝对的优先级，只是概率变高
 * MAX_PRIORITY		10
 * NORM_PRIORITY	5(默认)
 * MIN_PRIORITY		0
 * 
 * setPriority()设置优先级
 * getProiroty()获取优先级
 * @author zhengwei
 * @date 2017-5-11 下午8:08:02
 */
public class InfoDemo02 {
	public static void main(String[] args) throws InterruptedException {
		MyThread mt1=new MyThread();
		MyThread mt2=new MyThread();
		
		Thread t1=new Thread(mt1,"zw1");
		Thread t2=new Thread(mt2,"zw2");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		
		Thread.sleep(100);
		mt1.stop();
		mt2.stop();
	}
}
