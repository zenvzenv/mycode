package cn.zw.net.ip;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 
 * <p>Title:Demo01</p>
 * 测试网络编程的一些基本方法
 * InetAddress封装IP和DNS解析s
 * 
 * @author zhengwei
 * @date 2017-5-12 下午2:19:17
 */
public class InetAddressDemo01 {
	public static void main(String[] args) throws UnknownHostException {
		//使用getLocalHost方法创建InetAddress对象
		InetAddress addr=InetAddress.getLocalHost();
		System.out.println(addr.getHostAddress());//返回本地主机地址
		System.out.println(addr.getHostName());//返回本地主机名
		//根据域名得到InetAddress对象
		addr=InetAddress.getByName("www.baidu.com");
		System.out.println(addr.getHostAddress());//返回百度的地址
		System.out.println(addr.getHostName());//返回主机名
		//根据IP得到InetAddress对象
		addr=InetAddress.getByName("192.168.3.20");
		System.out.println(addr.getHostAddress());
		System.out.println(addr.getHostName());
		
	}
}
