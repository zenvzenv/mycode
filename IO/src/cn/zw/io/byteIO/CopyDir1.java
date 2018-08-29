package cn.zw.io.byteIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CopyDir1 {
	public static void main(String[] args) {
		String srcPath="c:/JavaTest";
		String destPath="c:/tmp";
		copyDir(srcPath, destPath);
	}
	/**
	 * 给出路径
	 * @param srcPath
	 * @param destPath
	 */
	public static void copyDir(String srcPath,String destPath){
		File src=new File(srcPath);
		File dest=new File(destPath);
		copyDir(src,dest);
	}
	
	/**
	 * 文件夹复制
	 * @param src
	 * @param dest
	 */
	public static void copyDir(File src,File dest){
		if (src.isDirectory()) {
			dest=new File(dest,src.getName());
		}
		copyDirDetails(src, dest);
	}
	
	/**
	 * 文件夹细节复制
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
