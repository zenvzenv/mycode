package cn.zsw.demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.management.openmbean.OpenDataException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

/**
 * 
 * <p>Title:StudentService</p>
 * <p>Description:方法类</p>
 * @author zhengwei
 * @date 2017-5-28 下午7:19:13
 */
public class StudentService {
	
	public static void selectStu(Student student) throws DocumentException{
		/*
		 * 1.创建解析器
		 * 2.获取document
		 * 3.获得所有id，使用xpath。//id，返回list集合
		 * 4.遍历list集合
		 * 5，判断list集合中的id和传进来的id进行比较
		 * 6.相等则返回信息
		 */
		SAXReader saxReader=new SAXReader();
		Document document=saxReader.read("src/student.xml");
		List<Element> list=document.selectNodes("//id");
		for (Element ids : list) {
			String str=ids.getText();
			if (str.equals(student.getId())) {
				Element stu=ids.getParent();
				Element id=stu.element("id");
				Element name=stu.element("name");
				Element age=stu.element("age");
				System.out.println("学号是"+id.getText());
				System.out.println("姓名是"+name.getText());
				System.out.println("年龄是"+age.getText());
			}
		}
	}
	
	/**
	 * 删除一个学生信息
	 * @param id
	 * @throws DocumentException
	 * @throws IOException
	 */
	public static void delStu(String id) throws DocumentException, IOException{
		/*
		 * 1.创建解析器
		 * 2.获得document
		 * 3.获得所有的id	使用xpath，//id。返回list集合
		 * 4.遍历list集合
		 * 5.判断集合中的id和传递的id是否相同
		 * 6.如果相同，把id所在的stu删除
		 */
		SAXReader saxReader=new SAXReader();
		Document document=saxReader.read("src/student.xml");
		List<Element> list=document.selectNodes("//id");
		for (Element ids : list) {
			String str=ids.getText();
			if (str.equals(ids)) {
				Element stu=ids.getParent();
				Element student=stu.getParent();
				student.remove(stu);
			}
		}
		OutputFormat format=OutputFormat.createPrettyPrint();
		XMLWriter xmlWriter=new XMLWriter(new FileOutputStream("src/student.xml"), format);
		xmlWriter.write(document);
		xmlWriter.close();
	}
	
	/**
	 * 添加一个学生的信息
	 * @param student
	 * @throws DocumentException
	 * @throws IOException
	 */
	public static void addStu(Student student) throws DocumentException, IOException{
		/*
		 * 1.创建解析器
		 * 2.创建document
		 * 3.获得根节点
		 * 4.在根节点上面添加一个stu标签
		 * 5.在stu上面一次添加id  name  age 
		 * 6.在id  name  age上一次添加值
		 * 
		 * 7.回写xml文件
		 */
		//创建解析器
		SAXReader saxReader=new SAXReader();
		//创建document
		Document document=saxReader.read("src/student.xml");
		//获得根节点
		Element root=document.getRootElement();
		//在根节点上添加一个stu标签
		Element stu3=root.addElement("stu");
		//在stu上依次添加id  name  age
		Element id=stu3.addElement("id");
		Element name=stu3.addElement("name");
		Element age=stu3.addElement("age");
		//在id  name age 上添加属性值
		id.setText(student.getId());
		name.setText(student.getName());
		age.setText(student.getAge());
		//回写xml
		OutputFormat format=OutputFormat.createPrettyPrint();
		XMLWriter xmlWriter=new XMLWriter(new FileOutputStream("src/student.xml"), format);
		xmlWriter.write(document);
		xmlWriter.close();
	}
}
