package code3��22;

public class TestBinaryNum {
	public static void main(String[] args) {
		int a=13;
		int x=0x10;
		int y=010;
		System.out.println(a+x+y);
		/*
		 * java7�����ԡ������Ʒָ���
		 */
		int b=0b0000_0000_0000_0000_0000_0011;
		System.out.println(b);
		int b1=1_2332_1123;
		System.out.println(b1);
	}
}
