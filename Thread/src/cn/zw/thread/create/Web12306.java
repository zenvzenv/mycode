package cn.zw.thread.create;

public class Web12306 implements Runnable{
	private int num=100;

	@Override
	public void run() {
		while(true){
			if (num<=0) {
				break;
			}
			System.out.println(Thread.currentThread().getName()+"������"+num--);
		}
	}
	public static void main(String[] args) {
		//��ʵ��ɫ
		Web12306 web=new Web12306();
		//��������������ʵ��ɫ
		Thread t1=new Thread(web,"��ţ1");
		Thread t2=new Thread(web,"��ţ2");
		Thread t3=new Thread(web,"��ţ3");
		//�����߳�
		t1.start();
		t2.start();
		t3.start();
		
	}
}
