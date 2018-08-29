package cn.zw.io.charIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * 
 * <p>Title:TestReader</p>
 * <p>Description:���ı���ȡ</p>
 * @author zhengwei
 * @date 2017-5-10 ����10:19:32
 */
public class TestReader {
	public static void main(String[] args) {
		//����Դ
		File src=new File("c:/bookshop.sql");
		Reader reader=null;
		try {
			reader=new FileReader(src);
			char[] chuf=new char[1024];
			int len=0;
			while (-1!=(len=reader.read(chuf))) {
				//�ַ�����ת�ַ���
				String str=new String(chuf,0,len);
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("�ļ�������");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("�ļ���ȡʧ��");
		}finally{
			if(null!=reader){
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
