package cn.zw.io.others;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 
 * <p>Title:ByteArrayDemo01</p>
 * һ���ļ�----����------���ֽ�����
 * 1.�ļ������
 * 2.�ֽ����������
 * 
 * �����ֽ�����-----����-------���ļ�
 * 1.�ֽ�����������
 * 2.�ļ������
 * @author zhengwei
 * @date 2017-5-10 ����2:38:34
 */
public class ByteArrayDemo01 {
	public static void main(String[] args) {
		try {
			byte[] data=getByteFromFile("c:/bookstore.sql");
			toFileFromByteArray(data, "c:/Ѹ������/bookstore.sql");
			System.out.println(new String(data));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * �����ֽ�����-----����-------���ļ�
	 * @param src
	 * @param destPath
	 * @throws IOException 
	 */
	public static void toFileFromByteArray(byte[] src,String destPath) throws IOException{
		//����Դ
		//Ŀ�ĵ�
		File dest=new File(destPath);
		//ѡ����
		ByteArrayInputStream bis=new ByteArrayInputStream(src);
		OutputStream os=new BufferedOutputStream(new FileOutputStream(dest));
		//���������϶�ȡ�ֽ�����
		byte[] flush=new byte[1024];
		int len=0;
		while (-1!=(len=bis.read(flush))) {
			os.write(flush, 0, len);
		}
		os.flush();
		os.close();
		bis.close();
	}
	
	/**
	 * 1.�ļ�-----����------���ֽ�����
	 * @param srcPath
	 * @return
	 * @throws IOException
	 */
	public static byte[] getByteFromFile(String srcPath) throws IOException{
		//�����ļ�Դ
		File src=new File(srcPath);
		//��������Ŀ�ĵ�
		byte[] dest;
		//ѡ����
		InputStream is=new BufferedInputStream(new FileInputStream(src));
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		//����
		byte[] flush=new byte[1024];
		int len=0;
		while (-1!=(len=is.read(flush))) {
			bos.write(flush,0,len);
		}
		bos.flush();
		//��ȡ����
		dest=bos.toByteArray();
		bos.close();
		is.close();
		return dest;
	}
}
