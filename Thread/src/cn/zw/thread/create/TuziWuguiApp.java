package cn.zw.thread.create;
/**
 * 
 * <p>Title:TuziWuguiApp</p>
 * <p>Description:</p>
 * @author zhengwei
 * @date 2017-5-11 下午1:21:27
 */
public class TuziWuguiApp {
	public static void main(String[] args) {
		//创建线程对象
		Tuzi tuzi=new Tuzi();
		Wugui wugui=new Wugui();
		
		//调用start方法，加入线程组
		tuzi.start();//避孕药调用run()方法
		wugui.start();
		
		for (int i = 0; i <100; i++) {
			System.out.println("main--->"+i);
		}
	}
}
