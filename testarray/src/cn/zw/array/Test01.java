package cn.zw.array;
/**
 * �������飬����Ҳ�Ƕ���
 * @author zhengwei
 * 
 *
 */
public class Test01 {
	public static void main(String[] args) {
		int[] a=new int[3];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		double[] d=new double[3];
		Car[] c=new Car[10];
		c[0]=new Car("����");//�����͵����飬��Ҫnewһ������������
		
		System.out.println(c.length);//length������ĳ�������
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
