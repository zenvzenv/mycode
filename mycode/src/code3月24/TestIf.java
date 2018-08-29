package code3月24;

public class TestIf {
	public static void main(String[] args) {
		double d=Math.random();//(0,1)
		int e=(int) (d*5);//[0,4]
		System.out.println(d);
		System.out.println(e);
		int e1=1+(int) (d*6);//[1,6]
		System.out.println(e1);
		if (e1>3) {
			System.out.println(e1+"为大数");
		}else{
			System.out.println(e1+"为小数");
		}
	}
}
