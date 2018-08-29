package cn.zw.io.conver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * <p>Title:TestConver</p>
 * 转换流：字节流转字符流
 * 1.输出流 OutputStreamWriter  编码
 * 2.输入流 InputStreamWriter	解码
 * @author zhengwei
 * @date 2017-5-10 上午11:32:57
 */
public class TestConver {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(new File("c:/bookstore.sql")),"GBK"));
		String str=null;
		while (null!=(str=br.readLine())) {
			System.out.println(str);
		}
	}
	
}
