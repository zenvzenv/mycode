package cn.zw.io.others;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * 
 * <p>Title:PrintStream</p>
 * <p>Description:��ӡ��</p>
 * PrintStream ��ӡ��-->������
 * @author zhengwei
 * @date 2017-5-10 ����5:13:16
 */
public class PrintStream {
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("test");
		java.io.PrintStream ps=System.out;
		ps.println(false);
		
		//������ļ�
		File src=new File("c:/Ѹ������/1.txt");
		ps=new java.io.PrintStream(new BufferedOutputStream(new FileOutputStream(src)));
		ps.println("io is so nan");
		ps.flush();
		ps.close();
	}
}
