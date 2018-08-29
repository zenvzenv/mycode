package cn.zw.io.byteIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * <p>Title:TestOutputStream</p>
 * 写出文件
 * @author zhengwei
 * @date 2017-5-9 下午8:18:31
 */
public class TestOutputStream {
	public static void main(String[] args) {
		//建立联系，File对象，目标文件
		File src=new File("c:/迅雷下载/a.txt");
		//选择流，文件输出流OutputStream FileOutputStream
		FileOutputStream os=null;
		//以追加的形式写出文件，追加必须为true，不追加则为false
		try {
			os=new FileOutputStream(src, true);
			String str="zw is very good";
			//字符串转字节数组
			byte[] data=str.getBytes();
			os.write(data,0,data.length);
			os.flush();//强制刷新出去
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("文件未找到");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("文件写出失败");
		}finally{
			//释放资源
			if (null!=os) {
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("关闭失败");
				}
			}
		}
		
	}
}
