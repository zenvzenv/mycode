package code3��26;
//���а������Ժͷ���
//����ķ�ʽ��֯���룬�Զ���ķ�ʽ��֯(��װ)����
//�����ϵͳ���Զ���ʼ�����ֲ�����ϵͳ�����Զ���ʼ��
/*
 * ջ���Ƚ�������Զ����������Ĵ洢�ռ䣩���𷿾ֲ�����
 * �ѣ��������Ĵ洢�ռ䣩�����new�����Ķ���
 * �����������ڶ��У������Ĵ�����Ϣ��static������������
 */
class Student{
	String name;
	int age;
	int weight;
	String gender;
	public void study(){
		System.out.println(name+"��ѧϰ");
	}
	public void sayHello(String sname){
		System.out.println(name+"��"+sname+"˵�����");
	}
}
public class TestOOP {
	//��̬������
//	private String name;
//	private int id;
//	private int age;
//	private int weight;
//	private String gender;
	//��̬�ķ���
//	public void study(){
//		System.out.println(name+"��ѧϰ��");
//	}
//	public void sayHello(String sname){
//		System.out.println(name+"��"+sname+"˵�����");
//	}
	public static void main(String[] args) {
		//ͨ���������class loader ����Student�ࡣ���غ��ڷ���ȥ������Student�����Ϣ
		Student s1=new Student();
		s1.name="֣ΰ";
		s1.study();
		s1.sayHello("zw");
	}
}
