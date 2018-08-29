package cn.zw.io.byteIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 
 * <p>Title:InputStream</p>
 * �ļ��Ķ�ȡ
 * @author zhengwei
 * @date 2017-5-9 ����8:07:18
 */
public class TestInputStream {
	public static void main(String[] args) {
		//1.������ϵ��File����
		File src=new File("c:/Ѹ������/a.txt");
		InputStream is=null;
		try {
			is=new FileInputStream(src);
			//��������
			byte[] car=new byte[10];
			int len=0;//ʵ�ʶ�ȡ�Ĵ�С
			//ѭ����ȡ
			while(-1!=(len=is.read(car))){
				//������ֽ�ת���ַ���
				String info=new String(car,0,len);
				System.out.println(info);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("�ļ�������");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("�ļ���ȡʧ��");
		}finally{
			if(null!=is){
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("�ر�������ʧ��");
				}
			}
		}
	}
}
