package cn.zw.TestException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * <p>Title:Test03</p>
 * <p>Description:测试异常的先后顺序</p>
 * finally一般存放的是开启资源的关闭方法
 * @author zhengwei
 * @date 2017-4-18 下午10:56:08
 */
public class Test03 {
	public static void main(String[] args) {
		FileReader fr=null;
		try {
			fr=new FileReader("c:/a.txt");
			char c=(char) fr.read();
			System.out.println("读出的内容是："+c);
		} catch (FileNotFoundException e) {
			System.out.println("文件没有找到");
			e.printStackTrace();
		} catch(IOException e){
			System.out.println("文件读取错误");
			e.printStackTrace();
		} finally{
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
