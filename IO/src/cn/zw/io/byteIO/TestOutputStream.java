package cn.zw.io.byteIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * <p>Title:TestOutputStream</p>
 * д���ļ�
 * @author zhengwei
 * @date 2017-5-9 ����8:18:31
 */
public class TestOutputStream {
	public static void main(String[] args) {
		//������ϵ��File����Ŀ���ļ�
		File src=new File("c:/Ѹ������/a.txt");
		//ѡ�������ļ������OutputStream FileOutputStream
		FileOutputStream os=null;
		//��׷�ӵ���ʽд���ļ���׷�ӱ���Ϊtrue����׷����Ϊfalse
		try {
			os=new FileOutputStream(src, true);
			String str="zw is very good";
			//�ַ���ת�ֽ�����
			byte[] data=str.getBytes();
			os.write(data,0,data.length);
			os.flush();//ǿ��ˢ�³�ȥ
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("�ļ�δ�ҵ�");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("�ļ�д��ʧ��");
		}finally{
			//�ͷ���Դ
			if (null!=os) {
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("�ر�ʧ��");
				}
			}
		}
		
	}
}
