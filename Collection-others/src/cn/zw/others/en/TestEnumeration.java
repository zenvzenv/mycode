package cn.zw.others.en;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 
 * <p>Title:TestEnumeration</p>
 * Enumeration��ʹ��
 * 1.�ж� hasMoreElements()
 * 2.��ȡnextElement()
 * 
 * Vector��element()����
 * 
 * @author zhengwei
 * @date 2017-5-6 ����10:41:52
 */
public class TestEnumeration {
	public static void main(String[] args) {
		Vector<String> vector=new Vector<String>();
		vector.add("javase");
		vector.add("html");
		vector.add("oracle");
		//������Vector
		Enumeration<String> en=vector.elements();
		while(en.hasMoreElements()){
			System.out.println(en.nextElement());
		}
	}
}
