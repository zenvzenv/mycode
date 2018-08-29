package cn.zw.utils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class Dom4jUtils {
	public static String PATH="src/p1.xml";
	//返回document
	public static Document getDocument(String path){
		try {
			//1.创建解析器
			SAXReader saxReader=new SAXReader();
			//得到document
			Document document=saxReader.read(path);
			return document;
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		return null;
	}
	//回写
	public static void xmlWrites(String path,Document document){
		try {
			OutputFormat format=OutputFormat.createPrettyPrint();
			XMLWriter xmlWriter=new XMLWriter(new FileOutputStream(path), format);
			xmlWriter.write(document);
			xmlWriter.close();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
