package cn.zw.dom4j;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.Node;

import cn.zw.utils.Dom4jUtils;

/**
 * 
 * <p>Title:TestDom4jXpath</p>
 * 1.��һ����ʽ��    /AAA/BBB/CCC  ��ʾ����һ��һ��Ľṹ��AAA�����BBB�����CCC
 * 2.�ڶ�����ʽ��   //BBB  ��ʾ���Ǻ����������ͬ�ı�ǩ�����۲㼶
 * 3.��������ʽ       /*  ��ʾ�ĵõ����б�ǩ
 * 4.��������ʽ       BBB[1]   ��ʾ��һ��BBBԪ��
 * 			  BBB[last()]  ��ʾ�������һ��BBBԪ��
 * 5.��������ʽ��   //BBB[@id]  ��ʾֻҪBBBԪ������id���ԣ������Եõ�
 * 6.��������ʽ��   //BBB[@id='b1']  ��ʾԪ������BBB����BBB������id���ԣ�����id������ֵ��b1
 * @author zhengwei
 * @date 2017-5-27 ����4:00:05
 */
public class TestDom4jXpath {
	public static void main(String[] args) {
		//test1();
		test2();
	}
	//ʹ��xpathʵ�֣���ȡ��һ��p1�����name��ֵ
	public static void test2(){
		Document document=Dom4jUtils.getDocument(Dom4jUtils.PATH);
		Node node=document.selectSingleNode("//p1[@id1='zw1']/name");
		String str=node.getText();
		System.out.println(str);
	}
	
	
	//��ȡ����name��ֵ
	public static void test1(){
		//���document
		Document document=Dom4jUtils.getDocument(Dom4jUtils.PATH);
		//ִ��xpath���
		List<Node> list=document.selectNodes("//name");
		//����list�õ�name��ֵ
		for (Node node : list) {
			String str=node.getText();
			System.out.println(str);
		}
	}
	
}
