package cn.zw.io.buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedCharDemo {
	public static void main(String[] args) {
		//创建源
		File src=new File("c:/bookshop.sql");
		File dest=new File("c:/迅雷下载/bookshop.txt");
		//选择流
		BufferedReader reader=null;
		BufferedWriter writer=null;
		if (!src.isFile()) {
			return;
		}
		try {
			reader=new BufferedReader(new FileReader(src));
			writer=new BufferedWriter(new FileWriter(dest));
			//要是使用Buffered新增发方法，不能使用多态
			String str=null;
			while (null!=(str=reader.readLine())) {
				writer.write(str);
				writer.newLine();
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
