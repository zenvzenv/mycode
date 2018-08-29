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
 * 数据类型（基本+String）处理流
 * 1.输入流	DataInputStream
 * 2.输出流	DataOutPutStream
 * @author zhengwei
 * @date 2017-5-10 下午3:18:13
 */
public class DataStream {
	public static void main(String[] args) {
		try {
			read("c:/迅雷下载/1.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 从文件中读取数据+类型
	 * @throws IOException 
	 */
	public static void read(String srcPath) throws IOException{
		//创建源
		File src=new File(srcPath);
		//选择流
		DataInputStream dis=new DataInputStream(new BufferedInputStream(new FileInputStream(src)));
		//读入的顺序要与写入的顺序一致
		double point=dis.readDouble();
		long num=dis.readLong();
		String str=dis.readUTF();
		dis.close();
		System.out.println(point);
	}
	
	/**
	 * 数据+类型输出到文件
	 * @throws IOException 
	 */
	public static void writer(String destPath) throws IOException{
		File dest=new File(destPath);
		double point=2.5;
		long num=100L;
		String str="数据类型";
		
		DataOutputStream dos=new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dest)));
		dos.writeDouble(point);
		dos.writeLong(num);
		dos.writeUTF(str);
		dos.flush();
		dos.close();
	}
}
