package cn.zw.others.en;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 
 * <p>Title:TestEnumeration</p>
 * Enumeration的使用
 * 1.判断 hasMoreElements()
 * 2.获取nextElement()
 * 
 * Vector的element()方法
 * 
 * @author zhengwei
 * @date 2017-5-6 上午10:41:52
 */
public class TestEnumeration {
	public static void main(String[] args) {
		Vector<String> vector=new Vector<String>();
		vector.add("javase");
		vector.add("html");
		vector.add("oracle");
		//遍历该Vector
		Enumeration<String> en=vector.elements();
		while(en.hasMoreElements()){
			System.out.println(en.nextElement());
		}
	}
}
