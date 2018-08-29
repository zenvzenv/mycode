package cn.zw.io.byteIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 
 * <p>Title:TestCopyFile</p>
 * �����ļ�	
 * @author zhengwei
 * @date 2017-5-9 ����10:48:21
 */
public class TestCopyFile {
	public static void main(String[] args) throws Exception {
		copyFile("c:/IMG_2295.JPG", "c:/Ѹ������/2.jpg");
	}
	/**
	 * �ļ��Ŀ���
	 * @param srcPath
	 * @param destPath
	 * @throws Exception
	 */
	public static void copyFile(String srcPath,String destPath) throws Exception{
		//1.������ϵ��File����Դ�ļ���һ��Ҫ���ڲ���Ϊ�ļ�����Ŀ�ĵ��ļ�����һ��Ҫ���ڣ�
		File src=new File(srcPath);
		File dest=new File(destPath);
		//ѡ����
		InputStream is=new FileInputStream(src);
		OutputStream os=new FileOutputStream(dest);
		if (!src.isFile()) {
			System.out.println("ֻ�ܿ����ļ�");
			throw new Exception("ֻ�ܿ����ļ�");
		}
		//����
		//���建������
		byte[] flush=new byte[1024];
		int len=0;
		while (-1!=(len=is.read(flush))) {
			os.write(flush, 0, len);
		}
		//�ͷ���Դ���ȴ򿪵ĺ�ر�
		os.close();
		is.close();
	}
}
