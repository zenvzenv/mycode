package cn.zw.thread.status;
/**
 * 
 * <p>Title:ThreadDeath</p>
 * <p>Description:�Լ������߳̽�������</p>
 * @author zhengwei
 * @date 2017-5-11 ����3:02:45
 */
public class ThreadStop {
	public static void main(String[] args) {
		Study stu=new Study();
		new Thread(stu).start();
		for (int i = 0; i < 100; i++) {
			if (50==i) {//�ⲿ����
				stu.stop();
			}
			System.out.println("play game ����");
		}
	}
}
class Study implements Runnable{
	//1.�߳����ж����߳��������ʶ
	private boolean flag=true;

	@Override
	public void run() {
		//�߳���ʹ�øñ�ʶ
		while(flag){
			System.out.println("study thread ����");
		}
	}
	public void stop(){
		this.flag=false;
	}
	
}