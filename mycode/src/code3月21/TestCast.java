package code3��21;
//�����Զ�ת�ͺ�ǿ��ת��
public class TestCast {
	public static void main(String[] args) {
//		byte b=123;
//		//byte b2=300;
//		//char c=-1;//0~65535
//		char c2='a';
//		int i=c2;
//		long L=123321;
//		float f=L;
//		int i2=100;
//		char c3=(char) i2;
		
		//���ʽ����������������
		int a=3;
		long b=4;
		double d=3.14;
		int c=(int) (a+b);//�����еĶ�Ԫ������������������������⣬int����Ϊlong
		float f=(float) (a+d);
		
		int money=1000000000;
		int year=20;
		long total=(long)money*year;//��ת�ͺ����
		System.out.println(total);
		
		//һ����70���������ٴ�
		long times=70*60*24*365*70;
		System.out.println(times);
		long times1=70L*60*24*365*70;
		System.out.println(times1);
	}

}
