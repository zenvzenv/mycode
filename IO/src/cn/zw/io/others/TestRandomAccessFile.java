package cn.zw.io.others;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

import cn.zw.io.util.FileUtil;
/**
 * 
 * <p>Title:TestRandomAccessFile</p>
 * �ļ��ķָ�
 * 1.�ָ�Ŀ���
 * 2.ÿһ��Ĵ�С
 * @author zhengwei
 * @date 2017-5-10 ����9:56:20
 */
public class TestRandomAccessFile {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf=new RandomAccessFile(new File("c:/bookstore.sql"), "r");
		raf.seek(10);
		//���ڻ�������
		byte[] flush=new byte[1024];
		int len=0;
		while(-1!=(len=raf.read(flush))){
			if (len>=200) {
				System.out.println(new String(flush,0,200));
			}else{
				System.out.println(new String(flush,0,len));
			}
		}
		FileUtil.close(raf);
	}
}
