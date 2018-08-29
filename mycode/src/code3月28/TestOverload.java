package code3月28;
/**
 * 测试重载
 * @author zhengwei
 * 同一个类，方法名可以相同，参数列表不同（类型，个数，顺序不同）
 * 注意：只有返回值不同不构成方法的重载。只有形参的名称不同，不构成方法的重载
 * 与普通方法一样，构造方法也可以重载。
 * 核心是不构成歧义
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
	//返回值不同是不构成重载的
//	public double add(double a,int b){
//		return a+b;
//	}
	public int add(double a,int b){
		return (int) (a+b);
	}
	//形参的类型顺序一样，也不构成重载
//	public int add(double b,int a){
//		return a+b;
//	}
	public int add(int b,double a){
		return (int) (a+b);
	}
	public int add(int a,int b,int c){
		return a+b+c;
	}
	//构造方法也可以重载
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