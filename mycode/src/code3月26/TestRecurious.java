package code3��26;
//���Եݹ�
public class TestRecurious {
	static int a=0;
	public static void test01(){
		a++;
		System.out.println("test01="+a);
		if(a<=10){		//�ݹ�ͷ
			test01();
		}else{			//�ݹ���
			System.out.println("over");
		}
	}
	public static void test02(){
		System.out.println("test02");
	}
	/*
	 * 1.����ݹ�ͷ��ʲôʱ�򲻵����Լ������û�еݹ�ͷ��������ѭ��
	 * 2.�ݹ��壺ʲôʱ����Ҫ��������
	 */
	public static long f(int x){
		if(x==1){//�ݹ�ͷ
			return 1;
		}else{//�ݹ���
			return x*f(x-1);
		}
	}
	public static int f2(int x){
		if(x==1){
			return x;
		}else{
			return x+f2(x-1);		
		}
	}
	public static void main(String[] args) {
		test01();
		long s=f(10);
		System.out.println(s);
		int sum=f2(100);
		System.out.println(sum);
	}
}
