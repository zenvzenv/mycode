package cn.zw.net.ip;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 
 * <p>Title:Demo01</p>
 * ���������̵�һЩ��������
 * InetAddress��װIP��DNS����s
 * 
 * @author zhengwei
 * @date 2017-5-12 ����2:19:17
 */
public class InetAddressDemo01 {
	public static void main(String[] args) throws UnknownHostException {
		//ʹ��getLocalHost��������InetAddress����
		InetAddress addr=InetAddress.getLocalHost();
		System.out.println(addr.getHostAddress());//���ر���������ַ
		System.out.println(addr.getHostName());//���ر���������
		//���������õ�InetAddress����
		addr=InetAddress.getByName("www.baidu.com");
		System.out.println(addr.getHostAddress());//���ذٶȵĵ�ַ
		System.out.println(addr.getHostName());//����������
		//����IP�õ�InetAddress����
		addr=InetAddress.getByName("192.168.3.20");
		System.out.println(addr.getHostAddress());
		System.out.println(addr.getHostName());
		
	}
}
