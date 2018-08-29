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
 * <p>Description:������</p>
 * @author zhengwei
 * @date 2017-5-28 ����7:19:13
 */
public class StudentService {
	
	public static void selectStu(Student student) throws DocumentException{
		/*
		 * 1.����������
		 * 2.��ȡdocument
		 * 3.�������id��ʹ��xpath��//id������list����
		 * 4.����list����
		 * 5���ж�list�����е�id�ʹ�������id���бȽ�
		 * 6.����򷵻���Ϣ
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
				System.out.println("ѧ����"+id.getText());
				System.out.println("������"+name.getText());
				System.out.println("������"+age.getText());
			}
		}
	}
	
	/**
	 * ɾ��һ��ѧ����Ϣ
	 * @param id
	 * @throws DocumentException
	 * @throws IOException
	 */
	public static void delStu(String id) throws DocumentException, IOException{
		/*
		 * 1.����������
		 * 2.���document
		 * 3.������е�id	ʹ��xpath��//id������list����
		 * 4.����list����
		 * 5.�жϼ����е�id�ʹ��ݵ�id�Ƿ���ͬ
		 * 6.�����ͬ����id���ڵ�stuɾ��
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
	 * ���һ��ѧ������Ϣ
	 * @param student
	 * @throws DocumentException
	 * @throws IOException
	 */
	public static void addStu(Student student) throws DocumentException, IOException{
		/*
		 * 1.����������
		 * 2.����document
		 * 3.��ø��ڵ�
		 * 4.�ڸ��ڵ��������һ��stu��ǩ
		 * 5.��stu����һ�����id  name  age 
		 * 6.��id  name  age��һ�����ֵ
		 * 
		 * 7.��дxml�ļ�
		 */
		//����������
		SAXReader saxReader=new SAXReader();
		//����document
		Document document=saxReader.read("src/student.xml");
		//��ø��ڵ�
		Element root=document.getRootElement();
		//�ڸ��ڵ������һ��stu��ǩ
		Element stu3=root.addElement("stu");
		//��stu���������id  name  age
		Element id=stu3.addElement("id");
		Element name=stu3.addElement("name");
		Element age=stu3.addElement("age");
		//��id  name age ���������ֵ
		id.setText(student.getId());
		name.setText(student.getName());
		age.setText(student.getAge());
		//��дxml
		OutputFormat format=OutputFormat.createPrettyPrint();
		XMLWriter xmlWriter=new XMLWriter(new FileOutputStream("src/student.xml"), format);
		xmlWriter.write(document);
		xmlWriter.close();
	}
}
