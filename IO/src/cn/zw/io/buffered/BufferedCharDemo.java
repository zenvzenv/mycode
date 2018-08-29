package cn.zw.io.buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedCharDemo {
	public static void main(String[] args) {
		//����Դ
		File src=new File("c:/bookshop.sql");
		File dest=new File("c:/Ѹ������/bookshop.txt");
		//ѡ����
		BufferedReader reader=null;
		BufferedWriter writer=null;
		if (!src.isFile()) {
			return;
		}
		try {
			reader=new BufferedReader(new FileReader(src));
			writer=new BufferedWriter(new FileWriter(dest));
			//Ҫ��ʹ��Buffered����������������ʹ�ö�̬
			String str=null;
			while (null!=(str=reader.readLine())) {
				writer.write(str);
				writer.newLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("�ļ���ȡʧ��");
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(null!=writer){
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("���ر�ʧ��");
				}
			}
			if (null!=reader) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("���ر�ʧ��");
				}
			}
		}
	}
}
