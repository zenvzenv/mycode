package cn.zw.io.buffered;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import cn.zw.io.byteIO.FileUtil;

public class BufferedByteDemo {
	/**
	 * 文件拷贝
	 * @param srcPath	源文件路径
	 * @param destPath	目标问价路径
	 * @throws Exception
	 */
	public static void copyFile(String srcPath,String destPath) throws Exception{
		//1.建立联系，File对象，源文件（一定要存在并且为文件），目的地文件（不一定要存在）
		copyFile(new File(srcPath),new File(destPath));
	}
	/**
	 * 文件拷贝
	 * @param src	源文件
	 * @param dest	目标文件
	 * @throws Exception
	 */
	public static void copyFile(File src,File dest) throws FileNotFoundException, IOException,Exception{
		if (!src.isFile()) {
			System.out.println("只能拷贝文件");
			throw new Exception("只能拷贝文件");
		}
		if (dest.isDirectory()) {
			System.out.println(dest.getAbsolutePath()+"不能建立同名文件夹");
			throw new Exception(dest.getAbsolutePath()+"不能建立同名文件夹");
		}
		//选择流
		InputStream is=new BufferedInputStream(new FileInputStream(src));
		OutputStream os=new BufferedOutputStream(new FileOutputStream(dest));
		//操作
		//定义缓冲数组
		byte[] flush=new byte[1024];
		int len=0;
		while (-1!=(len=is.read(flush))) {
			os.write(flush, 0, len);
		}
		//释放资源，先打开的后关闭
		os.close();
		is.close();
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
