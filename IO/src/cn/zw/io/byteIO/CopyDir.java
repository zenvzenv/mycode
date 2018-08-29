package cn.zw.io.byteIO;

import java.io.File;

/**
 * 
 * <p>Title:CopyDir</p>
 * �ļ��еĿ���
 * 1.������ļ�ֱ�Ӹ���
 * 2.������ļ��У������ļ���
 * 3.�ݹ��ѯ������
 * @author zhengwei
 * @date 2017-5-9 ����11:23:30
 */
public class CopyDir {
	public static void main(String[] args) {
		//ԴĿ¼
		String srcPath="c:/JavaTest";
		File src=new File(srcPath);
		//Ŀ��Ŀ¼
		String destPath="c:/tmp";
		File dest=null;
		if (src.isDirectory()) {	//�Ƿ�Ϊ�ļ���
			dest=new File(destPath,src.getName());
		}
		copyDirDetail(src,dest);
	}
	
	public static void copyDirDetail(File src,File dest){
		if (src.isFile()) {
			try {
				FileUtil.copyFile(src, dest);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(src.isDirectory()){//�Ƿ����ļ���
			//ȷ��Ŀ���ļ��д���
			dest.mkdirs();
			//��ȡ��һ��Ŀ¼
			for (File sub : src.listFiles()) {
				copyDirDetail(sub,new File(dest,sub.getName()));
			}
		}
	}
}
