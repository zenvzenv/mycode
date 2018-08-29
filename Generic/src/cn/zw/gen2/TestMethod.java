package cn.zw.gen2;

import java.io.Closeable;
import java.io.IOException;

/**
 * 
 * <p>Title:TestMethod</p>
 * <p>Description:���ͷ���<>��д�ڷ�������֮ǰ</p>
 * ֻ�ܷ��ʶ������Ϣ�������޸���Ϣ
 * @author zhengwei
 * @date 2017-5-3 ����10:01:28
 */
public class TestMethod {
	public static void main(String[] args) {
		test(123);//T-->Integer
	}
	public static <T> void test(T a){
		System.out.println(a);
	}
	//extends��ʾ<=
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
