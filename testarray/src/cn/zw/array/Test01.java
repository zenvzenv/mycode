package cn.zw.array;
/**
 * 测试数组，数组也是对象
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
		c[0]=new Car("奔驰");//类类型的数组，需要new一个对象来复制
		
		System.out.println(c.length);//length是数组的长度属性
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
