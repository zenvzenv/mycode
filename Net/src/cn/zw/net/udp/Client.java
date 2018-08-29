package cn.zw.net.udp;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

/**
 * 
 * <p>Title:Client</p>
 * 1.�ͻ��ˣ�
 * a.�����ͻ���	DatagramSocket��+ָ���˿�
 * b.׼������	�ֽ�����	��double--->�ַ�����	�ֽ����������
 * c.���	DatagramPacket+��������ַ���˿�
 * d.����
 * f.�ͷ���Դ
 * @author zhengwei
 * @date 2017-5-12 ����9:54:30
 */
public class Client {
	public static void main(String[] args) throws IOException {
		//�����ͻ���
		DatagramSocket client=new DatagramSocket(666);
		//׼������
		double msg=66.6;
		byte[] data=conver(msg);
		//���
		DatagramPacket packet=new DatagramPacket(data, 0, data.length,new InetSocketAddress("127.0.0.1",888));
		//����
		client.send(packet);
		//�ͷ���Դ
		client.close();
	}
	/**
	 * �ֽ����飬����Դ+Data�����
	 * @param num
	 * @return
	 * @throws IOException 
	 */
	public static byte[] conver(double num) throws IOException{
		byte[] data=null;
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		DataOutputStream dos=new DataOutputStream(bos);
		dos.writeDouble(num);
		dos.flush();
		
		//��ȡ����
		data=bos.toByteArray();
		dos.close();
		
		return data;
	}
}
