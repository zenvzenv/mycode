package cn.zw.thread.status;
/**
 * 
 * <p>Title:JoinDemo</p>
 * <p>Description:Join���ϲ��߳�</p>
 * @author zhengwei
 * @date 2017-5-11 ����7:43:43
 */
public class JoinDemo extends Thread{
	public static void main(String[] args) throws InterruptedException {
		JoinDemo jd=new JoinDemo();
		Thread t=new Thread(jd);//����
		t.start();//׼������
		//CPU����		����
		for (int i = 0; i < 1000; i++) {
			if (50==i) {
				t.join();//main����
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
