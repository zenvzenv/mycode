package cn.zw.oop.inherit;

/**
 * 测试继承
 * @author zhengwei
 * 提高代码的复用性，集成后子类会得到父类的所有属性和方法，但是除了父类的构造方法
 * 一个类只有一个直接父类（单继承）
 * java的多继承可以通过接口来实现
 * java.lang.Object是所有类的父类
 *
 */

public class Animal {
	String eye;
	
	public void run(){
		System.out.println("奔跑");
	}
	public void eat(){
		System.out.println("进食");
	}
	public void sleep(){
		System.err.println("ZzZzZz");
	}
}
class Mammal extends Animal{
	//扩展自Animal
	public void taisheng(){
		System.out.println("我是胎生");
	}
}
class Bird extends Animal{
	public void eggSheng(){
		System.out.println("我是卵生");
	}
	public void run(){//方法重写
		System.out.println("飞呀飞");
	}
}