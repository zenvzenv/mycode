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
 * 拷贝文件	
 * @author zhengwei
 * @date 2017-5-9 下午10:48:21
 */
public class TestCopyFile {
	public static void main(String[] args) throws Exception {
		copyFile("c:/IMG_2295.JPG", "c:/迅雷下载/2.jpg");
	}
	/**
	 * 文件的拷贝
	 * @param srcPath
	 * @param destPath
	 * @throws Exception
	 */
	public static void copyFile(String srcPath,String destPath) throws Exception{
		//1.建立联系，File对象，源文件（一定要存在并且为文件），目的地文件（不一定要存在）
		File src=new File(srcPath);
		File dest=new File(destPath);
		//选择流
		InputStream is=new FileInputStream(src);
		OutputStream os=new FileOutputStream(dest);
		if (!src.isFile()) {
			System.out.println("只能拷贝文件");
			throw new Exception("只能拷贝文件");
		}
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
}
