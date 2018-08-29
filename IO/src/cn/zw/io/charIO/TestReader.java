package cn.zw.io.charIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * 
 * <p>Title:TestReader</p>
 * <p>Description:纯文本读取</p>
 * @author zhengwei
 * @date 2017-5-10 上午10:19:32
 */
public class TestReader {
	public static void main(String[] args) {
		//创建源
		File src=new File("c:/bookshop.sql");
		Reader reader=null;
		try {
			reader=new FileReader(src);
			char[] chuf=new char[1024];
			int len=0;
			while (-1!=(len=reader.read(chuf))) {
				//字符数组转字符串
				String str=new String(chuf,0,len);
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("文件不存在");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("文件读取失败");
		}finally{
			if(null!=reader){
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
