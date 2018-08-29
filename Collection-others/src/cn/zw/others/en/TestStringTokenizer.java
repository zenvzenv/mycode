package cn.zw.others.en;

import java.util.StringTokenizer;

/**
 * 
 * <p>Title:TestStringTokenizer</p>
 * StringTokenizer是Enumeration的子类
 * 作用与String.spilt()相似，字符串的分割
 * 但是StringTokenzier不支持正则表达式
 * @author zhengwei
 * @date 2017-5-6 上午10:48:22
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
