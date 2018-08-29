package code3月27;

public class Student {
	String name;
	int age;
	int weight;
	String gender;
	
	Computer computer;
	public void study(){
		System.out.println(name+"在学习");
	}
	public void sayHello(String sname){
		System.out.println(name+"向"+sname+"说：你好");
	}
	//构造方法
	public Student(){
		System.out.println("构造一个学生");
	}
}
