package cn.zw.LoginServlet;

import java.util.UUID;

public class UUIDUtils {
	public static void main(String[] args) {
		UUID uuid=UUID.randomUUID();
		String str=uuid.toString().toUpperCase().replace("-","");
		System.out.println(str);
	}
}
