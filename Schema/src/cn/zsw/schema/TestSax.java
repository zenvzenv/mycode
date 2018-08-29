package cn.zsw.schema;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class TestSax {
	public static void main(String[] args) throws Exception, SAXException {
		/*
		 * 1.创建解析器工厂
		 * 2.创建解析器
		 * 3.执行parse方法
		 * 
		 * 4.自己创建一个类，继承DefaultHandler
		 * 5.重写类里面的方法
		 */
		//创建解析器工厂
		SAXParserFactory saxParserFactory=SAXParserFactory.newInstance();
		//创建解析器
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
		//当flag值是true时，表示解析到了name元素
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