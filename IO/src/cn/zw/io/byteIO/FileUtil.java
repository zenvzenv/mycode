package cn.zw.io.byteIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/**
 * 
 * <p>Title:FileUtil</p>
 * 1.�ļ�����
 * 2.�ļ��и���
 * @author zhengwei
 * @date 2017-5-10 ����12:09:24
 */
public class FileUtil {
	/**
	 * �ļ�����
	 * @param srcPath	Դ�ļ�·��
	 * @param destPath	Ŀ���ʼ�·��
	 * @throws Exception
	 */
	public static void copyFile(String srcPath,String destPath) throws Exception{
		//1.������ϵ��File����Դ�ļ���һ��Ҫ���ڲ���Ϊ�ļ�����Ŀ�ĵ��ļ�����һ��Ҫ���ڣ�
		copyFile(new File(srcPath),new File(destPath));
	}
	/**
	 * �ļ�����
	 * @param src	Դ�ļ�
	 * @param dest	Ŀ���ļ�
	 * @throws Exception
	 */
	public static void copyFile(File src,File dest) throws FileNotFoundException, IOException,Exception{
		if (!src.isFile()) {
			System.out.println("ֻ�ܿ����ļ�");
			throw new Exception("ֻ�ܿ����ļ�");
		}
		if (dest.isDirectory()) {
			System.out.println(dest.getAbsolutePath()+"���ܽ���ͬ���ļ���");
			throw new Exception(dest.getAbsolutePath()+"���ܽ���ͬ���ļ���");
		}
		//ѡ����,���Ӵ�������ǿ����
		InputStream is=new BufferedInputStream(new FileInputStream(src));
		OutputStream os=new BufferedOutputStream(new FileOutputStream(dest));
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
	/**
	 * ����·��
	 * @param srcPath
	 * @param destPath
	 */
	public static void copyDir(String srcPath,String destPath){
		File src=new File(srcPath);
		File dest=new File(destPath);
		copyDir(src,dest);
	}
	
	/**
	 * �ļ��и���
	 * @param src
	 * @param dest
	 */
	public static void copyDir(File src,File dest){
		if (src.isDirectory()) {
			dest=new File(dest,src.getName());
			if (dest.getAbsolutePath().contains(src.getAbsolutePath())) {
				System.out.println("��Ŀ¼���ܿ�����������");
				return;
			}
		}
		copyDirDetails(src, dest);
	}
	
	/**
	 * �ļ���ϸ�ڸ���
	 * @param src
	 * @param dest
	 */
	public static void copyDirDetails(File src,File dest){
		if (src.isFile()) {
			try {
				FileUtil.copyFile(src, dest);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(src.isDirectory()){
			dest.mkdirs();
			for (File temp : src.listFiles()) {
				copyDirDetails(temp, new File(dest,temp.getName()));
			}
		}
	}
}
