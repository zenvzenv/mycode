package cn.zw.testWarppedclass;
/**
 * 
 * <p>Title:Test02</p>
 * <p>Description:�����Զ�װ����Զ�����</p>
 * @author zhengwei
 * @date 2017-4-15 ����9:42:33
 */
public class Test02 {
	public static void main(String[] args) {
		Integer a1=new Integer(1000);
		Integer a2=1000;//jdk5.0֮��֧���Զ�װ�䣬�����������ǸĽ�����,Integer a=new Interage(1000);
		Integer b=2000;
		int c=new Integer(1500);//�������Ľ���new Integer(1500),intValue();
		int d=b;//int d=b.intValue();
		
		Integer d1=1234;
		Integer d2=1234;
		System.out.println(d1==d2);//����һ�������Ƕ���ĵ�ַ��һ��
		System.out.println(d1.equals(d2));//�Ƚ�����
		System.out.println("*************************");
		Integer d3=123;//[-128,127]֮���������Ȼ������������������ʹ��
		Integer d4=123;
		System.out.println(d3==d4);
		System.out.println(d3.equals(d4));
	}
}
