package cn.zw.io.charIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 
 * <p>Title:TestWriter</p>
 * <p>Description:�ļ���д��</p>
 * @author zhengwei
 * @date 2017-5-10 ����10:25:58
 */
public class TestWriter {
	public static void main(String[] args) {
		File dest=new File("c:/Ѹ������/bs.txt");
		Writer writer=null;
		try {
			//true��ʾ��׷���ļ�
			writer=new FileWriter(dest,true);
			String str="�����յ��磬���κ�������˭֪���вͣ��������ҿ�";
			writer.write(str);
			writer.append("֣ΰ�����Ľ���");
			writer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if (null!=writer) {
				try {
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
