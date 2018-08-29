package cn.zw.others.qoe;

public class MyStackApp {
	public static void main(String[] args) {
		MyStack<String> backHistory=new MyStack<String>(3);
		backHistory.push("www.baidu.com");
		backHistory.push("www.sina.com");
		backHistory.push("www.google.com");
		backHistory.push("www.zw.com");
		
		System.out.println("¥Û–°£∫"+backHistory.size());
		//±È¿˙
		String item=null;
		while(null!=(item=backHistory.pop())){
			System.out.println(item);
		}
	}
}
