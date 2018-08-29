package cn.zw.io.others;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * <p>Title:DataStream</p>
 * �������ͣ�����+String��������
 * 1.������	DataInputStream
 * 2.�����	DataOutPutStream
 * @author zhengwei
 * @date 2017-5-10 ����3:18:13
 */
public class DataStream {
	public static void main(String[] args) {
		try {
			read("c:/Ѹ������/1.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * ���ļ��ж�ȡ����+����
	 * @throws IOException 
	 */
	public static void read(String srcPath) throws IOException{
		//����Դ
		File src=new File(srcPath);
		//ѡ����
		DataInputStream dis=new DataInputStream(new BufferedInputStream(new FileInputStream(src)));
		//�����˳��Ҫ��д���˳��һ��
		double point=dis.readDouble();
		long num=dis.readLong();
		String str=dis.readUTF();
		dis.close();
		System.out.println(point);
	}
	
	/**
	 * ����+����������ļ�
	 * @throws IOException 
	 */
	public static void writer(String destPath) throws IOException{
		File dest=new File(destPath);
		double point=2.5;
		long num=100L;
		String str="��������";
		
		DataOutputStream dos=new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dest)));
		dos.writeDouble(point);
		dos.writeLong(num);
		dos.writeUTF(str);
		dos.flush();
		dos.close();
	}
}
