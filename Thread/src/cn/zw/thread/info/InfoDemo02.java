package cn.zw.thread.info;
/**
 * 
 * <p>Title:InfoDemo02</p>
 * ���ȼ������Ǿ��Ե����ȼ���ֻ�Ǹ��ʱ��
 * MAX_PRIORITY		10
 * NORM_PRIORITY	5(Ĭ��)
 * MIN_PRIORITY		0
 * 
 * setPriority()�������ȼ�
 * getProiroty()��ȡ���ȼ�
 * @author zhengwei
 * @date 2017-5-11 ����8:08:02
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
