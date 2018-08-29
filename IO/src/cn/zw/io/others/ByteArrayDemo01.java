package cn.zw.io.others;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 
 * <p>Title:ByteArrayDemo01</p>
 * 一、文件----程序------》字节数组
 * 1.文件输出流
 * 2.字节数组输出流
 * 
 * 二、字节数组-----程序-------》文件
 * 1.字节数组输入流
 * 2.文件输出流
 * @author zhengwei
 * @date 2017-5-10 下午2:38:34
 */
public class ByteArrayDemo01 {
	public static void main(String[] args) {
		try {
			byte[] data=getByteFromFile("c:/bookstore.sql");
			toFileFromByteArray(data, "c:/迅雷下载/bookstore.sql");
			System.out.println(new String(data));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 二、字节数组-----程序-------》文件
	 * @param src
	 * @param destPath
	 * @throws IOException 
	 */
	public static void toFileFromByteArray(byte[] src,String destPath) throws IOException{
		//创建源
		//目的地
		File dest=new File(destPath);
		//选择流
		ByteArrayInputStream bis=new ByteArrayInputStream(src);
		OutputStream os=new BufferedOutputStream(new FileOutputStream(dest));
		//操作，不断读取字节数组
		byte[] flush=new byte[1024];
		int len=0;
		while (-1!=(len=bis.read(flush))) {
			os.write(flush, 0, len);
		}
		os.flush();
		os.close();
		bis.close();
	}
	
	/**
	 * 1.文件-----程序------》字节数组
	 * @param srcPath
	 * @return
	 * @throws IOException
	 */
	public static byte[] getByteFromFile(String srcPath) throws IOException{
		//创建文件源
		File src=new File(srcPath);
		//创建数组目的地
		byte[] dest;
		//选择流
		InputStream is=new BufferedInputStream(new FileInputStream(src));
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		//操作
		byte[] flush=new byte[1024];
		int len=0;
		while (-1!=(len=is.read(flush))) {
			bos.write(flush,0,len);
		}
		bos.flush();
		//获取数据
		dest=bos.toByteArray();
		bos.close();
		is.close();
		return dest;
	}
}
