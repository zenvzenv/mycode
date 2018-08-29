package cn.zw.thread.pro;
/**
 * 
 * <p>Title:Movie</p>
 * 一个场景，共同的资源
 * 生产者，消费者模式		信号灯法
 * wait():线程等待，释放锁，而sleep不释放锁
 * notify()/notifyAll()唤醒线程
 * @author zhengwei
 * @date 2017-5-11 下午8:30:28
 */
public class Movie {
	private String pic;
	//信号
	//flag-->T	生产者生产，消费者等待，生产完成后通知消费
	//flag-->F	消费者消费，生产者等待，消费完成后通知生产
	private boolean flag=true;
	/**
	 * 播放
	 * @param pic
	 */
	public synchronized void play(String pic){
		if (!flag) {	//生产者等待
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//开始生产
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("生产了："+pic);
		//生产完毕
		this.pic=pic;
		//通知消费
		this.notifyAll();
		//生产者停下
		this.flag=false;
	}
	public synchronized void watch(){
		if(flag){
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("消费了："+pic);
		//
		//通知生产
		this.notifyAll();
		//消费停止
		this.flag=true;
	}
}
