package cn.zw.thread.create;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestCallable{
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//�����߳�
		ExecutorService ser=Executors.newFixedThreadPool(2);
		Race torroies=new Race("�ڹ�", 1000);
		Race rabbit=new Race("����",500);
		//��ȡֵ
		Future<Integer> result1=ser.submit(torroies);
		Future<Integer> result2=ser.submit(rabbit);
		
		Thread.sleep(2000);
		torroies.setFlag(false);
		rabbit.setFlag(false);
		
		int num1=result1.get();
		int num2=result2.get();
		System.out.println("�ڹ�����-->"+num1+"��");
		System.out.println("��������-->"+num2+"��");
	}
}
class Race implements Callable{
	private String name;//����
	private long time;//��ʱʱ��
	private boolean flag=true;
	private int step=0;
	public Race() {
		super();
	}
	public Race(String name, long time) {
		super();
		this.name = name;
		this.time = time;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public int getStep() {
		return step;
	}
	public void setStep(int step) {
		this.step = step;
	}
	@Override
	public Object call() throws Exception {
		while(flag){
			Thread.sleep(time);
			step++;
		}
		return step;
	}
}