package cn.zw.oop.innerclass;

import cn.zw.oop.innerclass.Face.Nose;

public class Outer {
	public static void main(String[] args) {
		Face f=new Face();
		Nose n=f.new Nose();
		Face.Nose n1=f.new Nose();
		n.breath();
		Face.Ear e=new Face.Ear();
		e.listen();
	}
}
class Face{
	int type=20;
	String shape="������";
	static String color="����";
	class Nose{
		//String type;
		/*������static����*/void breath(){
			System.out.println("����");
			System.out.println(type);
			System.out.println(shape);
		}
	}
	static class Ear{//��̬�ڲ��࣬�����ھ�̬��Ա
		void listen(){
			System.out.println(color);
			System.out.println("������");
		}
	}
}