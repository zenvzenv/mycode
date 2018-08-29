package code3月29;

public class TestObject {
	public static void main(String[] args) {
		Object obj=new Object();
		Object obj2=new Object();
		System.out.println(obj.toString());
		System.out.println(obj.toString());
		System.out.println(obj==obj2);
		System.out.println(obj.equals(obj2));
		/**
		 * 重写：方法定义一样，但实现的内容不一样
		 * 每个方法都有两个隐式参数this和super
		 */
		Mobile m=new Mobile();
		System.out.println(m.toString());//方法的重写
	}
}
