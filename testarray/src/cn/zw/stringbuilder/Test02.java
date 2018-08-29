package cn.zw.stringbuilder;
/**
 * 测试StringBuilder的一些常用方法
 * @author zhengwei
 *
 */
public class Test02 {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("adfafafjsefsefgksegse");
		sb.delete(3, 5);//报头不包尾
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		StringBuffer sb2=new StringBuffer();
		
	}
}
