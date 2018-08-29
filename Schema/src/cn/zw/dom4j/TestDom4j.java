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
 * <p>Description:����dom4j����xml�ļ�</p>
 * @author zhengwei
 * @date 2017-5-27 ����1:21:06
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
	 * ��ñ�ǩ�ڵ�����
	 */
	public static void getValues(){
		Document document=Dom4jUtils.getDocument(Dom4jUtils.PATH);
		Element root=document.getRootElement();
		Element p1=root.element("p1");
		String value=p1.attributeValue("id1");//��ȡ����ֵ�ķ���
		System.out.println(value);
	}
	
	/**
	 * ɾ���ڵ�Ĳ���
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
	 * �޸�Ԫ�ص�ֵ
	 */
	public static void modifyAge(){
		Document document=Dom4jUtils.getDocument(Dom4jUtils.PATH);
		Element root=document.getRootElement();
		Element p1=root.element("p1");
		Element age=p1.element("age");
		age.setText("25");//�޸ı�ǩ���������
		Dom4jUtils.xmlWrites(Dom4jUtils.PATH, document);
	}
	
	/**
	 * ��age��ǩ֮ǰ���<school>��ǩ
	 * @throws DocumentException 
	 * @throws IOException 
	 */
	public static void addSchoolBeforeAge() throws DocumentException, IOException{
		SAXReader saxReader=new SAXReader();
		Document document=saxReader.read("src/p1.xml");
		Element root=document.getRootElement();
		Element p1=root.element("p1");
		List<Element> list=p1.elements();
		Element school=DocumentHelper.createElement("school");//����school��ǩ
		school.addText("sqc");
		list.add(1, school);
		//��д
		OutputFormat format=OutputFormat.createPrettyPrint();
		XMLWriter xmlWriter=new XMLWriter(new FileOutputStream("src/p1.xml"),format);
		xmlWriter.write(document);
		xmlWriter.close();
	}
	
	/**
	 * �ڵ�һ��p1��ǩĩβ���һ��Ԫ��<sex>Ů</sex>
	 * @throws DocumentException 
	 * @throws IOException 
	 */
	public static void addSex() throws DocumentException, IOException{
		SAXReader saxReader=new SAXReader();
		Document document=saxReader.read("src/p1.xml");
		Element root=document.getRootElement();
		Element p1=root.element("p1");
		Element sex=p1.addElement("sex");
		sex.addText("��");
		//��дxml
		OutputFormat format=OutputFormat.createPrettyPrint();//Ư���ĸ�ʽ
		XMLWriter xmlWriter=new XMLWriter(new FileOutputStream("src/p1.xml"),format);
		xmlWriter.write(document);
		xmlWriter.close();
	}
	
	
	/**
	 * ��õڶ���name��ֵ
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
	 * �õ���һ��name
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
	 * ��ѯxml������nameԪ�ص�ֵ
	 * @throws DocumentException 
	 */
	public static void selectName() throws DocumentException{
		SAXReader saxReader=new SAXReader();
		Document document=saxReader.read("src/p1.xml");
		Element root=document.getRootElement();
		//�õ�p1
		List<Element> list=root.elements("p1");
		for (Element p1 : list) {
			Element name=p1.element("name");
			String str=name.getText();
			System.out.println(str);
		}
	}
}
