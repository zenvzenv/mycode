package cn.zw.gen2;

import java.io.Closeable;
import java.io.IOException;

/**
 * 
 * <p>Title:TestMethod</p>
 * <p>Description:泛型方法<>，写在返回类型之前</p>
 * 只能访问对象的信息，不能修改信息
 * @author zhengwei
 * @date 2017-5-3 上午10:01:28
 */
public class TestMethod {
	public static void main(String[] args) {
		test(123);//T-->Integer
	}
	public static <T> void test(T a){
		System.out.println(a);
	}
	//extends表示<=
	public static <T extends Closeable> void test(T... a){
		for(T temp:a){
			try {
				if(null!=temp){
					temp.close();
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
