package cn.zw.TestException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * 
 * <p>Title:Test02</p>
 * <p>Description:����try,catch,finally,return��ִ��˳��</p>
 * ��ִ��try,catch,������ֵ����ִ��finally��������reuturn�Ľ��
 * @author zhengwei
 * @date 2017-4-18 ����10:54:12
 */
public class Test02 {
	public static void main(String[] args) {
		String str=new Test02().openFile();
		System.out.println(str);
	}
	String openFile(){
		System.out.println("aaa");
		try {
			FileInputStream fis=new FileInputStream("c:/a.txt");
			int a=fis.read();
			System.out.println("bbb");
			return "step1";
		} catch (FileNotFoundException e) {
			System.out.println("catching!!");
			e.printStackTrace();
			return "step2";//��ȷ������ֵ��������ֱ�ӽ������������
		}catch(IOException e){
			e.printStackTrace();
			return "step3";
		}finally{
			System.out.println("finally!!");
		}
		
	}
}
