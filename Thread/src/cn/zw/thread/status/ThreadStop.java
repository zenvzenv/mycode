package cn.zw.thread.status;
/**
 * 
 * <p>Title:ThreadDeath</p>
 * <p>Description:自己定义线程结束方法</p>
 * @author zhengwei
 * @date 2017-5-11 下午3:02:45
 */
public class ThreadStop {
	public static void main(String[] args) {
		Study stu=new Study();
		new Thread(stu).start();
		for (int i = 0; i < 100; i++) {
			if (50==i) {//外部干涉
				stu.stop();
			}
			System.out.println("play game ……");
		}
	}
}
class Study implements Runnable{
	//1.线程类中定义线程体结束标识
	private boolean flag=true;

	@Override
	public void run() {
		//线程体使用该标识
		while(flag){
			System.out.println("study thread ……");
		}
	}
	public void stop(){
		this.flag=false;
	}
	
}