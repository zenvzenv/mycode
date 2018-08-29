package cn.zw.dom4j;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import cn.zw.utils.Dom4jUtils;
/**
 * 
 * <p>Title:TestDom4j</p>
 * <p>Description:测试dom4j解析xml文件</p>
 * @author zhengwei
 * @date 2017-5-27 下午1:21:06
 */
public class TestDom4j {
	public static void main(String[] args) throws DocumentException, IOException {
		//selectName();
		//selectSin();
		//selectSecond();
		//addSex();
		//addSchoolBeforeAge();
		//modifyAge();
		//removeSchool();
		getValues();
	}
	/**
	 * 获得标签内的属性
	 */
	public static void getValues(){
		Document document=Dom4jUtils.getDocument(Dom4jUtils.PATH);
		Element root=document.getRootElement();
		Element p1=root.element("p1");
		String value=p1.attributeValue("id1");//获取属性值的方法
		System.out.println(value);
	}
	
	/**
	 * 删除节点的操作
	 */
	public static void removeSchool(){
		Document document=Dom4jUtils.getDocument(Dom4jUtils.PATH);
		Element root=document.getRootElement();
		Element p1=root.element("p1");
		Element school=p1.element("school");
		p1.remove(school);
		Dom4jUtils.xmlWrites(Dom4jUtils.PATH, document);
	}
	
	/**
	 * 修改元素的值
	 */
	public static void modifyAge(){
		Document document=Dom4jUtils.getDocument(Dom4jUtils.PATH);
		Element root=document.getRootElement();
		Element p1=root.element("p1");
		Element age=p1.element("age");
		age.setText("25");//修改标签里面的内容
		Dom4jUtils.xmlWrites(Dom4jUtils.PATH, document);
	}
	
	/**
	 * 在age标签之前添加<school>标签
	 * @throws DocumentException 
	 * @throws IOException 
	 */
	public static void addSchoolBeforeAge() throws DocumentException, IOException{
		SAXReader saxReader=new SAXReader();
		Document document=saxReader.read("src/p1.xml");
		Element root=document.getRootElement();
		Element p1=root.element("p1");
		List<Element> list=p1.elements();
		Element school=DocumentHelper.createElement("school");//创建school标签
		school.addText("sqc");
		list.add(1, school);
		//回写
		OutputFormat format=OutputFormat.createPrettyPrint();
		XMLWriter xmlWriter=new XMLWriter(new FileOutputStream("src/p1.xml"),format);
		xmlWriter.write(document);
		xmlWriter.close();
	}
	
	/**
	 * 在第一个p1标签末尾添加一个元素<sex>女</sex>
	 * @throws DocumentException 
	 * @throws IOException 
	 */
	public static void addSex() throws DocumentException, IOException{
		SAXReader saxReader=new SAXReader();
		Document document=saxReader.read("src/p1.xml");
		Element root=document.getRootElement();
		Element p1=root.element("p1");
		Element sex=p1.addElement("sex");
		sex.addText("男");
		//回写xml
		OutputFormat format=OutputFormat.createPrettyPrint();//漂亮的格式
		XMLWriter xmlWriter=new XMLWriter(new FileOutputStream("src/p1.xml"),format);
		xmlWriter.write(document);
		xmlWriter.close();
	}
	
	
	/**
	 * 获得第二个name的值
	 * @throws DocumentException 
	 */
	public static void selectSecond() throws DocumentException{
		SAXReader saxReader=new SAXReader();
		Document document=saxReader.read("src/p1.xml");
		Element root=document.getRootElement();
		List<Element> list=root.elements("p1");
		Element p1=list.get(1);
		Element name2=p1.element("name");
		String str=name2.getText();
		System.out.println(str);
	}
	
	/**
	 * 得到第一个name
	 * @throws DocumentException 
	 */
	public static void selectSin() throws DocumentException{
		SAXReader saxReader=new SAXReader();
		Document document=saxReader.read("src/p1.xml");
		Element root=document.getRootElement();
		Element p1=root.element("p1");
		Element name=p1.element("name");
		String str=name.getText();
		System.out.println(str);
	}
	
	/**
	 * 查询xml中所有name元素的值
	 * @throws DocumentException 
	 */
	public static void selectName() throws DocumentException{
		SAXReader saxReader=new SAXReader();
		Document document=saxReader.read("src/p1.xml");
		Element root=document.getRootElement();
		//得到p1
		List<Element> list=root.elements("p1");
		for (Element p1 : list) {
			Element name=p1.element("name");
			String str=name.getText();
			System.out.println(str);
		}
	}
}
