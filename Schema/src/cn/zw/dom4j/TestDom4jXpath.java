package cn.zw.dom4j;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.Node;

import cn.zw.utils.Dom4jUtils;

/**
 * 
 * <p>Title:TestDom4jXpath</p>
 * 1.第一种形式：    /AAA/BBB/CCC  表示的是一层一层的结构，AAA下面的BBB下面的CCC
 * 2.第二种形式：   //BBB  表示的是和这个名称相同的标签，不论层级
 * 3.第三种形式       /*  表示的得到所有标签
 * 4.第四种形式       BBB[1]   表示第一个BBB元素
 * 			  BBB[last()]  表示的是最后一个BBB元素
 * 5.第五种形式：   //BBB[@id]  表示只要BBB元素上有id属性，都可以得到
 * 6.第六种形式：   //BBB[@id='b1']  表示元素名是BBB，且BBB上面有id属性，并且id的属性值是b1
 * @author zhengwei
 * @date 2017-5-27 下午4:00:05
 */
public class TestDom4jXpath {
	public static void main(String[] args) {
		//test1();
		test2();
	}
	//使用xpath实现：获取第一个p1下面的name的值
	public static void test2(){
		Document document=Dom4jUtils.getDocument(Dom4jUtils.PATH);
		Node node=document.selectSingleNode("//p1[@id1='zw1']/name");
		String str=node.getText();
		System.out.println(str);
	}
	
	
	//获取所有name的值
	public static void test1(){
		//获得document
		Document document=Dom4jUtils.getDocument(Dom4jUtils.PATH);
		//执行xpath语句
		List<Node> list=document.selectNodes("//name");
		//遍历list得到name的值
		for (Node node : list) {
			String str=node.getText();
			System.out.println(str);
		}
	}
	
}
