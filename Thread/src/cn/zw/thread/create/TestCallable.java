package cn.zw.thread.create;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestCallable{
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//创建线程
		ExecutorService ser=Executors.newFixedThreadPool(2);
		Race torroies=new Race("乌龟", 1000);
		Race rabbit=new Race("兔子",500);
		//获取值
		Future<Integer> result1=ser.submit(torroies);
		Future<Integer> result2=ser.submit(rabbit);
		
		Thread.sleep(2000);
		torroies.setFlag(false);
		rabbit.setFlag(false);
		
		int num1=result1.get();
		int num2=result2.get();
		System.out.println("乌龟跑了-->"+num1+"步");
		System.out.println("兔子跑了-->"+num2+"步");
	}
}
class Race implements Callable{
	private String name;//名称
	private long time;//延时时间
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