package cn.zw.io.others;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 
 * <p>Title:ByteArrayDemo</p>
 * <p>Description:�ֽ����� ���ڵ���</p>
 * ���鳤�����ޣ���ȡ���˹���
 * 
 * �ļ����ݲ���̫��
 * 1.�ļ�--����---���ֽ�����
 * 2.�ֽ�����---����----���ļ�
 * @author zhengwei
 * @date 2017-5-10 ����2:03:53
 */
public class ByteArrayDemo {
	public static void main(String[] args) {
		try {
			read(writer());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * ��������������ļ��������Щ��ͬ������������������ʹ�ö�̬��
	 * @throws IOException 
	 * 
	 */
	public static byte[] writer() throws IOException{
		//Ŀ�ĵ�
		byte[] dest;
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		String str="��������������ļ����һ��";
		byte[] info=str.getBytes();
		bos.write(info, 0, info.length);
		dest=bos.toByteArray();
		bos.close();
		return dest;
	}
	
	/**
	 * ���������������ļ�����������һ��
	 * @throws IOException
	 */
	public static void read(byte[] src) throws IOException{
		
		//ѡ����
		InputStream is=new BufferedInputStream(new ByteArrayInputStream(src));
		//����
		byte[] flush=new byte[1024];
		int len=0;
		while (-1!=(len=is.read(flush))) {
			System.out.println(new String(flush,0,len));
		}
		is.close();
	}
}
