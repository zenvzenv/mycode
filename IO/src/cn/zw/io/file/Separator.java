package cn.zw.io.file;

import java.io.File;

/**
 * 
 * <p>Title:Separator</p>
 * <p>Description:��������</p>
 * 1.·���ָ���
 * 2.�ļ��ָ���
 * ���·���;���·��������File
 * @author zhengwei
 * @date 2017-5-8 ����11:01:35
 */
public class Separator {
	public static void main(String[] args) {
		//System.out.println(File.pathSeparator);
		//System.out.println(File.separator);
		//·����ʾ
		//String path="c:"+File.separator+"Ѹ������";
		//System.out.println(path);
		
		String parentPath="c:/Ѹ������";
		String name="1.txt";
		File src=new File(parentPath,name);
		src=new File(new File(parentPath),name);
		System.out.println(src.getName());
		System.out.println(src.getPath());
		File file=new File("c:/Ѹ������/1.txt");
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
	}
}
