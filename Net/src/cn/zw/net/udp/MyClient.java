package cn.zw.net.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

/**
 * 
 * <p>Title:MyClient</p>
 * UDP:������Ϊ���ģ��������ӣ�����ȫ�����ݿ��ܶ�ʧ��Ч�ʸ�
 * һ����DatagramSocket	DatagramPacket
 * 1.�ͻ��ˣ�
 * a.�����ͻ���	DatagramSocket��+ָ���˿�
 * b.׼������	�ֽ�����
 * c.���	DatagramPacket+��������ַ���˿�
 * d.����
 * f.�ͷ���Դ
 * 
 * ����������
 * a.����������DatagramSocket��+ָ���ӿ�
 * b.׼�������������ֽ����飬��װDatagramPacket
 * c.������������
 * d.��������
 * f.�ͷ���Դ
 * @author zhengwei
 * @date 2017-5-12 ����9:29:13
 */
public class MyClient {
	public static void main(String[] args) throws IOException {
		//1.�����ͻ���+ָ���˿�
		DatagramSocket client=new DatagramSocket(6666);
		//2.׼������
		String msg="zw";
		
		byte[] data=msg.getBytes();
		//���
		DatagramPacket packet=new DatagramPacket(data,data.length,new InetSocketAddress("127.0.0.1",8888));
		//��������
		client.send(packet);
		client.close();
	}
}
