package code3��28;
/**
 * ��������
 * @author zhengwei
 * ͬһ���࣬������������ͬ�������б�ͬ�����ͣ�������˳��ͬ��
 * ע�⣺ֻ�з���ֵ��ͬ�����ɷ��������ء�ֻ���βε����Ʋ�ͬ�������ɷ���������
 * ����ͨ����һ�������췽��Ҳ�������ء�
 * �����ǲ���������
 */
public class TestOverload {
	public int add(int a,int b){
		return a+b;
	}
	public static void main(String[] args) {
		MyMath m=new MyMath();
		int result=m.add(3, 5);
		System.out.println(result);
	}
}
class MyMath{
	int a;
	int b;
	int c;
	public int add(int a,int b){
		return a+b;
	}
	//����ֵ��ͬ�ǲ��������ص�
//	public double add(double a,int b){
//		return a+b;
//	}
	public int add(double a,int b){
		return (int) (a+b);
	}
	//�βε�����˳��һ����Ҳ����������
//	public int add(double b,int a){
//		return a+b;
//	}
	public int add(int b,double a){
		return (int) (a+b);
	}
	public int add(int a,int b,int c){
		return a+b+c;
	}
	//���췽��Ҳ��������
	public MyMath(){
		
	}
	public MyMath(int a){
		this.a=a;
	}
	public MyMath(int a,int b){
		this.a=a;
		this.b=b;
	}
}