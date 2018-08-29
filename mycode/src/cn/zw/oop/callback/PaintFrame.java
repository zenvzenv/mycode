package cn.zw.oop.callback;

/**
 * ���Իص�,ģ�淽�����캯���������Ƕ�̬
 * @author zhengwei
 *
 */

public class PaintFrame {
	public static void drawFrame(IMyFrame f){
		System.out.println("�����߳�");
		System.out.println("����ѭ��");
		System.out.println("�鿴��Ϣջ");
		//������
		f.paint();//����
		
		System.out.println("�������棬����Ч��");
	}
	public static void main(String[] args) {
		drawFrame(new GameFrame01());
	}
}
//class GameFrame01 extends MyFrame{
//	public void paint(){
//		System.out.println("GameFrame01.paint()");
//		System.out.println("������01");
//	}
//}
//class GameFrame02 extends MyFrame{
//	public void paint(){
//		System.out.println("GameFrame02.paint()");
//		System.out.println("������02");
//	}
//}
class GameFrame01 implements IMyFrame{
	public void paint(){
		System.out.println("GameFrame01.paint()");
		System.out.println("������01");
	}
}
class GameFrame02 implements IMyFrame{
	public void paint(){
		System.out.println("GameFrame02.paint()");
		System.out.println("������02");
	}
}