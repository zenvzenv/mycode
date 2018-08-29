package cn.zw.net.ip;

import java.net.InetAddress;
import java.net.InetSocketAddress;

/**
 * InetSocketAddresss��װ�˿ڣ���InetAddress��������Ӷ˿�
 * InetSocketAddress����IP��DNS��Port����
 * <p>Title:InetSocketDemo01</p>
 * <p>Description:</p>
 * @author zhengwei
 * @date 2017-5-12 ����2:28:02
 */
public class InetSocketDemo01 {
	public static void main(String[] args) {
		InetSocketAddress address=new InetSocketAddress("127.0.0.1", 9999);
		System.out.println(address.getHostName());
		System.out.println(address.getPort());
		InetAddress addr=address.getAddress();
		System.out.println(addr.getHostAddress());
		System.out.println(addr.getHostName());
	}
}
