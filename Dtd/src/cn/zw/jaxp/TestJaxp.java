package cn.zw.jaxp;

import java.io.IOException;

import javax.print.attribute.standard.DocumentName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

/**
 * 
 * <p>Title:TestJaxp</p>
 * <p>Description:实现jaxp操作xml文件</p>
 * @author zhengwei
 * @date 2017-5-25 下午10:38:06
 */
public class TestJaxp {
	public static void main(String[] args) throws Exception {
		//selectAll();
		//selectSin();
		//addSex();
		//modifySex();
		//delSex();
		listElement();
	}
	//遍历节点
	private static void listElement() throws Exception{
		DocumentBuilderFactory builderFactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder=builderFactory.newDocumentBuilder();
		Document document=builder.parse("src/person.xml");
		list(document);
	}
	private static void list(Node node) {
		if (node.getNodeType()==Node.ELEMENT_NODE) {
			System.out.println(node.getNodeName());
		}
		NodeList list=node.getChildNodes();
		for (int i = 0; i < list.getLength(); i++) {
			Node tempnode=list.item(i);
			list(tempnode);
		}
	}
	//删除节点元素
	private static void delSex() throws Exception{
		DocumentBuilderFactory builderFactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder=builderFactory.newDocumentBuilder();
		Document document=builder.parse("src/person.xml");
		NodeList list=document.getElementsByTagName("p1");
		Node p1=list.item(0);
		NodeList list2=document.getElementsByTagName("sex");
		Node sex=list2.item(0);
		p1.removeChild(sex);
		TransformerFactory transFactorry=TransformerFactory.newInstance();
		Transformer transformer=transFactorry.newTransformer();
		transformer.transform(new DOMSource(document), new StreamResult("src/person.xml"));
	}
	//修改元素里面的内容
	private static void modifySex() throws Exception{
		DocumentBuilderFactory builderFactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder=builderFactory.newDocumentBuilder();
		Document document=builder.parse("src/person.xml");
		Node sex=document.getElementsByTagName("sex").item(0);
		sex.setTextContent("女");
		TransformerFactory transFactory=TransformerFactory.newInstance();
		Transformer transformer=transFactory.newTransformer();
		transformer.transform(new DOMSource(document), new StreamResult("src/person.xml"));
	}
	//添加一个元素
	private static void addSex() throws ParserConfigurationException, SAXException, IOException, TransformerException{
		/*
		 * 1.创建解析器工厂
		 * 2.根据解析器工厂创建解析器
		 * 3.解析xml文件，返回document
		 * 4.得到p1，是item下标获得
		 * 5.创建sex标签，createElement方法
		 * 6.创建文本，createTextNode
		 * 7.把文本添加到sex下，appendChild
		 * 8.把sex放到p1下面
		 */
		DocumentBuilderFactory builderFactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder=builderFactory.newDocumentBuilder();
		Document document=builder.parse("src/person.xml");
		NodeList list=document.getElementsByTagName("p1");
		Node p1=list.item(0);
		Element sex=document.createElement("sex");
		Text text=document.createTextNode("男");
		sex.appendChild(text);
		p1.appendChild(sex);
		//回写xml
		TransformerFactory transFactory=TransformerFactory.newInstance();
		Transformer transformer=transFactory.newTransformer();
		transformer.transform(new DOMSource(document), new StreamResult("src/person.xml"));
	}
	//查询xml中第一个name元素的值
	private static void selectSin() throws ParserConfigurationException, SAXException, IOException{
		/*
		 * 1.创建解析器工厂
		 * 2.根据解析工厂创建解析器
		 * 3，解析xml文件，返回document
		 * 4.得到所有name元素
		 * 5.返回集合，调用item方法，根据下标获取具体的元素
		 * 6.的饿到具体的值，使用getTextContent方法获取元素里面的内容
		 */
		DocumentBuilderFactory documentFactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder=documentFactory.newDocumentBuilder();
		Document document=builder.parse("src/person.xml");
		NodeList list=document.getElementsByTagName("name");
		Node name1=list.item(0);
		String str=name1.getTextContent();
		System.out.println(str);
	}
	//查询所有name元素的值
	private static void selectAll() throws ParserConfigurationException,SAXException, IOException {
		//查询所有name的值
		/*
		 * 1.创建解析器工厂
		 * 2.根据解析器工厂创建解析器
		 * 3.解析xml返回document
		 * 4.获得元素为name的元素
		 * 5.返回的是集合，遍历集合，得到每一个name元素
		 */
		//创建解析工厂
		DocumentBuilderFactory builderFactory=DocumentBuilderFactory.newInstance();
		//创建解析器
		DocumentBuilder buikder=builderFactory.newDocumentBuilder();
		//解析xml返回document对象
		Document document=buikder.parse("src/person.xml");
		//得到name元素
		NodeList list=document.getElementsByTagName("name");
		//遍历集合
		for(int i=0;i<list.getLength();i++){
			Node node=list.item(i);
			String str=node.getTextContent();
			System.out.println(str);
		}
	}
}
