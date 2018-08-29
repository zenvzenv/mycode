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
	String shape="国字脸";
	static String color="红润";
	class Nose{
		//String type;
		/*不能用static修饰*/void breath(){
			System.out.println("呼吸");
			System.out.println(type);
			System.out.println(shape);
		}
	}
	static class Ear{//静态内部类，类似于静态成员
		void listen(){
			System.out.println(color);
			System.out.println("我在听");
		}
	}
}