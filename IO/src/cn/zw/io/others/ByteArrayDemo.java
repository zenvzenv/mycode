package cn.zw.io.others;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 
 * <p>Title:ByteArrayDemo</p>
 * <p>Description:字节数组 ，节点流</p>
 * 数组长度有限，读取不宜过大
 * 
 * 文件内容不用太大
 * 1.文件--程序---》字节数组
 * 2.字节数组---程序----》文件
 * @author zhengwei
 * @date 2017-5-10 下午2:03:53
 */
public class ByteArrayDemo {
	public static void main(String[] args) {
		try {
			read(writer());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 输出流，操作与文件输出流有些不同，有新增方法，不能使用多态。
	 * @throws IOException 
	 * 
	 */
	public static byte[] writer() throws IOException{
		//目的地
		byte[] dest;
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		String str="输出流，操作与文件输出一致";
		byte[] info=str.getBytes();
		bos.write(info, 0, info.length);
		dest=bos.toByteArray();
		bos.close();
		return dest;
	}
	
	/**
	 * 输入流，操作与文件输入流操作一致
	 * @throws IOException
	 */
	public static void read(byte[] src) throws IOException{
		
		//选择流
		InputStream is=new BufferedInputStream(new ByteArrayInputStream(src));
		//操作
		byte[] flush=new byte[1024];
		int len=0;
		while (-1!=(len=is.read(flush))) {
			System.out.println(new String(flush,0,len));
		}
		is.close();
	}
}
