package cn.zw.thread.create;
/**
 * 
 * <p>Title:TuziWuguiApp</p>
 * <p>Description:</p>
 * @author zhengwei
 * @date 2017-5-11 ����1:21:27
 */
public class TuziWuguiApp {
	public static void main(String[] args) {
		//�����̶߳���
		Tuzi tuzi=new Tuzi();
		Wugui wugui=new Wugui();
		
		//����start�����������߳���
		tuzi.start();//����ҩ����run()����
		wugui.start();
		
		for (int i = 0; i <100; i++) {
			System.out.println("main--->"+i);
		}
	}
}
