package cn.zsw.schema;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class TestSax {
	public static void main(String[] args) throws Exception, SAXException {
		/*
		 * 1.��������������
		 * 2.����������
		 * 3.ִ��parse����
		 * 
		 * 4.�Լ�����һ���࣬�̳�DefaultHandler
		 * 5.��д������ķ���
		 */
		//��������������
		SAXParserFactory saxParserFactory=SAXParserFactory.newInstance();
		//����������
		SAXParser saxParser=saxParserFactory.newSAXParser();
		saxParser.parse("src/p1.xml", new MyDefault2());
	}
}
class MyDefault2 extends DefaultHandler{
	boolean flag=false;
	int index=1;
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		if("name".equals(qName)&&index==1){
			flag=true;
		}
	}

	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		//��flagֵ��trueʱ����ʾ��������nameԪ��
		if(flag){
			System.out.println(new String(ch,start,length));
		}
	}
	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		if("name".equals(qName)&&index==1){
			flag=false;
			index++;
		}
	}
}

class MyDefault extends DefaultHandler{

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		System.out.print("<"+qName+">");
	}
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		System.out.print("text"+new String(ch,start,length));
	}

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		System.out.print("</"+qName+">");
	}

	
}