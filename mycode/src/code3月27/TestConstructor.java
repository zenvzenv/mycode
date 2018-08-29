package code3月27;

/*
 * 构造方法是一种特殊的方法：
 * 1.通过new来调用
 * 2.构造器没有返回值，但是不能定义返回类型(返回的类型肯定是本类)，不能在构造器里调用return
 * 3.如果我们没有定义构造器，系统则会自动定义一个无参的构造函数
 * 4.构造器的方法和类名保持一直
 * 5.作用：通过构造方法初始化对象的属性和构造该类的对象
 */

public class TestConstructor {
	public static void main(String[] args) {
		Student s=new Student();
	}
}
