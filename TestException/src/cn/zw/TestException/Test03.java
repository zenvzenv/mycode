package cn.zw.TestException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * <p>Title:Test03</p>
 * <p>Description:�����쳣���Ⱥ�˳��</p>
 * finallyһ���ŵ��ǿ�����Դ�Ĺرշ���
 * @author zhengwei
 * @date 2017-4-18 ����10:56:08
 */
public class Test03 {
	public static void main(String[] args) {
		FileReader fr=null;
		try {
			fr=new FileReader("c:/a.txt");
			char c=(char) fr.read();
			System.out.println("�����������ǣ�"+c);
		} catch (FileNotFoundException e) {
			System.out.println("�ļ�û���ҵ�");
			e.printStackTrace();
		} catch(IOException e){
			System.out.println("�ļ���ȡ����");
			e.printStackTrace();
		} finally{
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
