import java.util.Enumeration;

import javax.swing.tree.TreeNode;


public class Test02 {
	public Test02(){
		System.out.println("第一个构造方法");
	}
	public Test02(int n){
		this();
		System.out.println("第二个构造方法");
	}
	public Test02(boolean flag){
		this(1);
		System.out.println("第三个构造方法");
	}
	public static void main(String[] args) {
//		Test02 t=new Test02(true);
//		String str="abccdefcg";
//		String[] strs=str.split("c");
//		for(int i=0;i<strs.length;i++){
//			System.out.println(strs[i]);
//		}
//		System.out.println(strs.length);
//		System.out.println(str.indexOf("d"));
//		System.out.println(str.substring(5, 6));//左开右闭
//		StringBuilder buf=new StringBuilder("Beijing2008");
//		buf.insert(7, "@");
//		System.out.println(buf);
//		int x=2;
//		int y=(x++)/3;
//		y=x/3;
//		System.out.println(y);
		double x=5.1;
		System.out.println(Math.ceil(x));
	}
}
