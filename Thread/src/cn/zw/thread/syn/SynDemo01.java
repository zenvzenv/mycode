package cn.zw.thread.syn;
/**
 * 
 * <p>Title:SynDemo01</p>
 * 单例设计模式
 * 确保一个类只有一个对象
 * 懒汉式		double checking
 * 1.构造器私有化，避免外部直接创建对象
 * 2.声明一个私有的构造方法
 * 3.创建一个对外的公共的静态方法，访问变量，如果没有对象，创建该对象
 * 
 * @author zhengwei
 * @date 2017-5-11 下午9:10:59
 */
public class SynDemo01 {
	public static void main(String[] args) {
		JvmThread t1=new JvmThread(100);
		JvmThread t2=new JvmThread(500);
		t1.start();
		t2.start();
	}
}
class JvmThread extends Thread{
	private long time;
	public JvmThread(){
	}
	public JvmThread(long time){
		this.time=time;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"--->创建"+Jvm.getInstance(time));
	}
}
class Jvm{
	//声明一个私有的静态变量
	private static Jvm instance =null;
	//构造器私有化，避免外部直接创建对象
	private Jvm(){
		
	}
	//创建一个对外的公开的静态方法，用来访问变量，如果变量没有对象，创建该对象
	public static Jvm getInstance(long time){
		//两次检查，提高效率
		if(null==instance){
			synchronized(Jvm.class){
				if (null==instance) {
					try {
						Thread.sleep(time);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					instance=new Jvm();
				}
			}
		}
		return instance;
	}
}