package cn.zw.oop.inherit;

/**
 * ���Լ̳�
 * @author zhengwei
 * ��ߴ���ĸ����ԣ����ɺ������õ�������������Ժͷ��������ǳ��˸���Ĺ��췽��
 * һ����ֻ��һ��ֱ�Ӹ��ࣨ���̳У�
 * java�Ķ�̳п���ͨ���ӿ���ʵ��
 * java.lang.Object��������ĸ���
 *
 */

public class Animal {
	String eye;
	
	public void run(){
		System.out.println("����");
	}
	public void eat(){
		System.out.println("��ʳ");
	}
	public void sleep(){
		System.err.println("ZzZzZz");
	}
}
class Mammal extends Animal{
	//��չ��Animal
	public void taisheng(){
		System.out.println("����̥��");
	}
}
class Bird extends Animal{
	public void eggSheng(){
		System.out.println("��������");
	}
	public void run(){//������д
		System.out.println("��ѽ��");
	}
}