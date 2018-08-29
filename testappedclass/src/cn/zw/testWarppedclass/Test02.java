package cn.zw.testWarppedclass;
/**
 * 
 * <p>Title:Test02</p>
 * <p>Description:测试自动装箱和自动拆箱</p>
 * @author zhengwei
 * @date 2017-4-15 下午9:42:33
 */
public class Test02 {
	public static void main(String[] args) {
		Integer a1=new Integer(1000);
		Integer a2=1000;//jdk5.0之后支持自动装箱，编译器帮我们改进代码,Integer a=new Interage(1000);
		Integer b=2000;
		int c=new Integer(1500);//编译器改进：new Integer(1500),intValue();
		int d=b;//int d=b.intValue();
		
		Integer d1=1234;
		Integer d2=1234;
		System.out.println(d1==d2);//内容一样，但是对象的地址不一样
		System.out.println(d1.equals(d2));//比较内容
		System.out.println("*************************");
		Integer d3=123;//[-128,127]之间的数，仍然当作基本数据类型来使用
		Integer d4=123;
		System.out.println(d3==d4);
		System.out.println(d3.equals(d4));
	}
}
