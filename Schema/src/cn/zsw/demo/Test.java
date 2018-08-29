package cn.zsw.demo;

import java.io.IOException;

import org.dom4j.DocumentException;

public class Test {
	public static void main(String[] args) throws DocumentException {
		Student student=new Student("103", "¿ÓÀºº—", "23");
//		try {
//			StudentService.addStu(student);
//		} catch (DocumentException | IOException e) {
//			e.printStackTrace();
//		}
//		try {
//			StudentService.delStu("103");
//		} catch (DocumentException | IOException e) {
//			e.printStackTrace();
//		}
		StudentService.selectStu(student);
	}
}
