package cn.zw.others.en;

import java.util.StringTokenizer;

/**
 * 
 * <p>Title:TestStringTokenizer</p>
 * StringTokenizer��Enumeration������
 * ������String.spilt()���ƣ��ַ����ķָ�
 * ����StringTokenzier��֧��������ʽ
 * @author zhengwei
 * @date 2017-5-6 ����10:48:22
 */
public class TestStringTokenizer {
	public static void main(String[] args) {
		String emailStr="zw@qq.com;zw@live.com;zw.@163.com";
		StringTokenizer token=new StringTokenizer(emailStr, ";");
		while(token.hasMoreElements()){
			System.out.println(token.nextElement());
		}
	}
}
