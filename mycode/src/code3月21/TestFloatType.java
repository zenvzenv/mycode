package code3月21;

public class TestFloatType {
	public static void main(String[] args){
		double d=3.14;//浮点型默认类型是double
		float f=6.28f;//float类型需加上f
		double d2=314e-1;
		System.out.println(d2);
		/*
		 * 浮点数有误差，应避免浮点数的比较
		 */
		float f2=0.1f;
		double d3=1/10;
		if(f2==d3){
			System.out.println("相等");
		}else{
			System.out.println("不相相等");
		}
	}
}
