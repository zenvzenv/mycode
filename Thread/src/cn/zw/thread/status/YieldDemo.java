package cn.zw.thread.status;
/**
 * 
 * <p>Title:YieldDemo</p>
 * <p>Description:yeildÔÝÍ£Ïß³Ì</p>
 * @author zhengwei
 * @date 2017-5-11 ÏÂÎç7:54:01
 */
public class YieldDemo extends Thread{
	public static void main(String[] args) {
		YieldDemo yd=new YieldDemo();
		Thread t=new Thread(yd);
		yd.start();
		for (int i = 0; i < 100; i++) {
			if(i%20==0){
				Thread.yield();
			}
			System.out.println("main..."+i);
		}
	}
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("yeild..."+i);
		}
	}
}
