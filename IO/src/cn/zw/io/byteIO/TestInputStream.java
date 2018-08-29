package cn.zw.io.byteIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 
 * <p>Title:InputStream</p>
 * 文件的读取
 * @author zhengwei
 * @date 2017-5-9 下午8:07:18
 */
public class TestInputStream {
	public static void main(String[] args) {
		//1.建立联系，File对象
		File src=new File("c:/迅雷下载/a.txt");
		InputStream is=null;
		try {
			is=new FileInputStream(src);
			//缓冲数组
			byte[] car=new byte[10];
			int len=0;//实际读取的大小
			//循环读取
			while(-1!=(len=is.read(car))){
				//输出，字节转成字符串
				String info=new String(car,0,len);
				System.out.println(info);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("文件不存在");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("文件读取失败");
		}finally{
			if(null!=is){
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("关闭输入流失败");
				}
			}
		}
	}
}
