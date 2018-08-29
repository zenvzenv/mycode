package code3月26;
//类中包含属性和方法
//以类的方式组织代码，以对象的方式组织(封装)数据
//类变量系统会自动初始化，局部变量系统不会自动初始化
/*
 * 栈（先进后出，自动分配连续的存储空间）：尊房局部变量
 * 堆（不连续的存储空间）：存放new出来的对象
 * 方法区：是在堆中，存放类的代码信息，static变量，常量池
 */
class Student{
	String name;
	int age;
	int weight;
	String gender;
	public void study(){
		System.out.println(name+"在学习");
	}
	public void sayHello(String sname){
		System.out.println(name+"向"+sname+"说：你好");
	}
}
public class TestOOP {
	//静态的数据
//	private String name;
//	private int id;
//	private int age;
//	private int weight;
//	private String gender;
	//动态的方法
//	public void study(){
//		System.out.println(name+"在学习！");
//	}
//	public void sayHello(String sname){
//		System.out.println(name+"向"+sname+"说：你好");
//	}
	public static void main(String[] args) {
		//通过类加载器class loader 加载Student类。加载后在方法去就有了Student类的信息
		Student s1=new Student();
		s1.name="郑伟";
		s1.study();
		s1.sayHello("zw");
	}
}
