package code3��27;

public class Test1 {
	public static void main(String[] args) {
		//ͨ���������class loader ����Student�ࡣ���غ��ڷ���ȥ������Student�����Ϣ
		Student s1=new Student();
		s1.name="֣ΰ";
		s1.study();
		s1.sayHello("zw");
		
		Student s2=new Student();
		s1.name="zhengwei";
		s1.age=18;
	}
}
