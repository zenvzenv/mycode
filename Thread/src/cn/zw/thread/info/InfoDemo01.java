package cn.zw.thread.info;
/**
 * 
 * <p>Title:InfoDemo01</p>
 * Thread.currentThread()	��ǰ�߳�
 * setName()	��������
 * getName()	��ȡ����
 * isAlive()	�Ƿ���
 * @author zhengwei
 * @date 2017-5-11 ����8:01:15
 */
public class InfoDemo01 {
	public static void main(String[] args) throws InterruptedException {
		MyThread my=new MyThread();
		Thread t1=new Thread(my);
		t1.setName("�߳�һ");
		System.out.println(t1.getName());
		System.out.println(Thread.currentThread().getName());
		
		t1.start();
		System.out.println("�������״̬"+t1.isAlive());
		my.stop();
		Thread.sleep(1000);
		System.out.println("ֹͣ���״̬"+t1.isAlive());
	}
}
