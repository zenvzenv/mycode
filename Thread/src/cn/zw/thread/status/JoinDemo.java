package cn.zw.thread.status;
/**
 * 
 * <p>Title:JoinDemo</p>
 * <p>Description:Join：合并线程</p>
 * @author zhengwei
 * @date 2017-5-11 下午7:43:43
 */
public class JoinDemo extends Thread{
	public static void main(String[] args) throws InterruptedException {
		JoinDemo jd=new JoinDemo();
		Thread t=new Thread(jd);//新生
		t.start();//准备就绪
		//CPU调度		运行
		for (int i = 0; i < 1000; i++) {
			if (50==i) {
				t.join();//main阻塞
			}
			System.out.println("main..."+i);
		}
	}
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("join..."+i);
		}
	}
	
}
