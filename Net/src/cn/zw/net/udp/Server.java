package cn.zw.net.udp;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 
 * <p>Title:Server</p>
 * �����
 * 1.���������+�˿�
 * 2.׼����������
 * 3.��װ�ɰ�
 * 4.��������
 * 5.��������	�ַ�����--->double
 * 6.�ͷ���Դ
 * @author zhengwei
 * @date 2017-5-12 ����9:54:02
 */
public class Server {
	public static void main(String[] args) throws IOException {
		DatagramSocket server=new DatagramSocket(888);
		byte[] container=new byte[1024];
		DatagramPacket packet=new DatagramPacket(container,container.length);
		server.receive(packet);
		double data=conver(packet.getData());
		int len=packet.getLength();
		System.out.println(data);
		server.close();
	}
	/**
	 * �ֽ�����+Dat������
	 * @param data
	 * @return
	 * @throws IOException 
	 */
	public static double conver(byte[] data) throws IOException{
		DataInputStream dis=new DataInputStream(new ByteArrayInputStream(data));
		double num=dis.readDouble();
		dis.close();
		return num;
	}
}
