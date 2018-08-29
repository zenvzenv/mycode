package cn.zw.net.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * 
 * <p>Title:MyServer</p>
 * �����
 * 1.���������+�˿�
 * 2.׼����������
 * 3.��װ�ɰ�
 * 4.��������
 * 5.��������
 * 6.�ͷ���Դ
 * @author zhengwei
 * @date 2017-5-12 ����9:35:43
 */
public class MyServer {
	public static void main(String[] args) throws IOException {
		//1.����������+�˿ں�
		DatagramSocket server=new DatagramSocket(8888);
		//2.׼����������
		byte[] container=new byte[1024];
		//3.��װ�ɰ�DatagramPacket(byte[] buf,int length)
		DatagramPacket packet=new DatagramPacket(container,container.length);
		//4.��������
		server.receive(packet);
		//5.��������
		byte[] data=packet.getData();
		int len=packet.getLength();
		System.out.println(new String(data,0,len));
		//6.�ͷ���Դ
		server.close();
	}
}
