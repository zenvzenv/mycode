package cn.zw.TestException;

public class Test01 {
	public static void main(String[] args) {
		//int i=1/0;//uncheckedexception
		try {
			Thread.sleep(3000);//checkedexception
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally{
			System.out.println("zw");
		}
	}
}
