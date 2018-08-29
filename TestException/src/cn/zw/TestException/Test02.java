package cn.zw.TestException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * 
 * <p>Title:Test02</p>
 * <p>Description:测试try,catch,finally,return的执行顺序</p>
 * 先执行try,catch,给返回值，后执行finally，最后给出reuturn的结果
 * @author zhengwei
 * @date 2017-4-18 下午10:54:12
 */
public class Test02 {
	public static void main(String[] args) {
		String str=new Test02().openFile();
		System.out.println(str);
	}
	String openFile(){
		System.out.println("aaa");
		try {
			FileInputStream fis=new FileInputStream("c:/a.txt");
			int a=fis.read();
			System.out.println("bbb");
			return "step1";
		} catch (FileNotFoundException e) {
			System.out.println("catching!!");
			e.printStackTrace();
			return "step2";//先确定返回值，并不会直接结束程序的运行
		}catch(IOException e){
			e.printStackTrace();
			return "step3";
		}finally{
			System.out.println("finally!!");
		}
		
	}
}
