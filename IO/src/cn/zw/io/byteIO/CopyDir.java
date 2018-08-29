package cn.zw.io.byteIO;

import java.io.File;

/**
 * 
 * <p>Title:CopyDir</p>
 * 文件夹的拷贝
 * 1.如果是文件直接复制
 * 2.如果是文件夹，创建文件夹
 * 3.递归查询子孙类
 * @author zhengwei
 * @date 2017-5-9 下午11:23:30
 */
public class CopyDir {
	public static void main(String[] args) {
		//源目录
		String srcPath="c:/JavaTest";
		File src=new File(srcPath);
		//目标目录
		String destPath="c:/tmp";
		File dest=null;
		if (src.isDirectory()) {	//是否为文件夹
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
		}else if(src.isDirectory()){//是否是文件夹
			//确保目标文件夹存在
			dest.mkdirs();
			//获取下一级目录
			for (File sub : src.listFiles()) {
				copyDirDetail(sub,new File(dest,sub.getName()));
			}
		}
	}
}
