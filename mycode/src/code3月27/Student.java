package code3��27;

public class Student {
	String name;
	int age;
	int weight;
	String gender;
	
	Computer computer;
	public void study(){
		System.out.println(name+"��ѧϰ");
	}
	public void sayHello(String sname){
		System.out.println(name+"��"+sname+"˵�����");
	}
	//���췽��
	public Student(){
		System.out.println("����һ��ѧ��");
	}
}
