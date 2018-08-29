package code3月28;

public class TestStaticStudent {
	String name;
	int id;
	static int ss;
	public static void printSS(){
		System.out.println(ss);
	}
	public void study(){
		System.out.println(name+"在学习");
	}
	public void sayHello(String sname){
		System.out.println(name+"向"+sname+"说：你好");
	}
}
