package cn.zw.oop.callback;

/**
 * 测试回调,模版方法构造函数，本质是多态
 * @author zhengwei
 *
 */

public class PaintFrame {
	public static void drawFrame(IMyFrame f){
		System.out.println("启动线程");
		System.out.println("增加循环");
		System.out.println("查看消息栈");
		//画窗口
		f.paint();//钩子
		
		System.out.println("启动缓存，增加效率");
	}
	public static void main(String[] args) {
		drawFrame(new GameFrame01());
	}
}
//class GameFrame01 extends MyFrame{
//	public void paint(){
//		System.out.println("GameFrame01.paint()");
//		System.out.println("画窗口01");
//	}
//}
//class GameFrame02 extends MyFrame{
//	public void paint(){
//		System.out.println("GameFrame02.paint()");
//		System.out.println("画窗口02");
//	}
//}
class GameFrame01 implements IMyFrame{
	public void paint(){
		System.out.println("GameFrame01.paint()");
		System.out.println("画窗口01");
	}
}
class GameFrame02 implements IMyFrame{
	public void paint(){
		System.out.println("GameFrame02.paint()");
		System.out.println("画窗口02");
	}
}