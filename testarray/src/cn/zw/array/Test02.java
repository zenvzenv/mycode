package cn.zw.array;
/**
 * 测试数组的基本语法
 * @author zhengwei
 *
 */
public class Test02 {
	public static void main(String[] args){
		//声明数组
		int[] a;
		int b[];
		//创建数组
		a=new int[4];
		b=new int[5];
		//初始化数组
		//1.默认初始化，数组元素相当于对象的成员变量，默认的规则跟成员变量相同
		//2.动态初始化:
//		a[0]=23;
//		a[1]=24;
//		a[2]=25;
//		a[3]=26;
		for (int i = 0; i < a.length; i++) {
			a[i]=i*12;
		}
		//3.今天初始化
		int[] c={13,45,78};
		Car[] cars={
						new Car("奔驰"),
						new Car("兰博基尼"),
						new Car("宝马")
					};
		Car c2=new Car("奔驰");
		System.out.println(c2==cars[0]);
	}
}
