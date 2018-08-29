package code3月27;

public class Test1 {
	public static void main(String[] args) {
		//通过类加载器class loader 加载Student类。加载后在方法去就有了Student类的信息
		Student s1=new Student();
		s1.name="郑伟";
		s1.study();
		s1.sayHello("zw");
		
		Student s2=new Student();
		s1.name="zhengwei";
		s1.age=18;
	}
}
