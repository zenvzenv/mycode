package cn.zw.stringbuilder;
/**
 * ����StringBuilder��һЩ���÷���
 * @author zhengwei
 *
 */
public class Test02 {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("adfafafjsefsefgksegse");
		sb.delete(3, 5);//��ͷ����β
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		StringBuffer sb2=new StringBuffer();
		
	}
}
