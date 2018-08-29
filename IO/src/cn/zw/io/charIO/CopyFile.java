package cn.zw.io.charIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * 
 * <p>Title:CopyFile</p>
 * <p>Description:纯文本的拷贝</p>
 * @author zhengwei
 * @date 2017-5-10 上午10:36:27
 */
public class CopyFile {
	public static void main(String[] args) {
		//创建源
		File src=new File("c:/bookshop.sql");
		File dest=new File("c:/迅雷下载/bookshop.txt");
		//选择流
		Reader reader=null;
		Writer writer=null;
		if (!src.isFile()) {
			return;
		}
		try {
			reader=new FileReader(src);
			writer=new FileWriter(dest);
			char[] chuf=new char[1024];
			int len=0;
			while (-1!=(len=reader.read(chuf))) {
				String str=new String(chuf,0,len);
				writer.write(str);
				writer.flush();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("文件读取失败");
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(null!=writer){
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("流关闭失败");
				}
			}
			if (null!=reader) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("流关闭失败");
				}
			}
		}
	}
}
