package cn.zw.TestException;

/**
 * 
 * <p>Title:MyException</p>
 * <p>Description:�Զ����쳣</p>
 * @author zhengwei
 * @date 2017-4-22 ����9:15:27
 */
public class MyException extends Exception {
	public MyException(){
		
	}
	public MyException(String message){
		super(message);
	}
}
class TestMyException{
	void Test() throws MyException{
		
	}
	public static void main(String[] args) {
		try {
			new TestMyException().Test();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}