package cn.zw.net.chartroom3;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * �����ͻ��ˣ��������ݼӽ�������
 * д�����ݣ������
 * �������ݣ�������
 * 
 * ��ȡ����
 * 
 * ���ڵ����⣺���������������ͬһ���߳��ڣ�Ӧ�ñ˴˶���
 * <p>Title:Client</p>
 * <p>Description:</p>
 * @author zhengwei
 * @date 2017-5-12 ����11:10:04
 */
public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("�������ǳ�");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name=br.readLine();
		if(name.equals("")){
			return;
		}
		
		Socket client=new Socket("127.0.0.1", 9999);
		//����̨����
		//BufferedReader console=new BufferedReader(new InputStreamReader(System.in));
		//DataOutputStream dos=new DataOutputStream(client.getOutputStream());
		new Thread(new Send(client,name)).start();
		new Thread(new Receive(client)).start();
		//DataInputStream dis=new DataInputStream(client.getInputStream());
		//while(true){
			//String info=console.readLine();
			//�����
			//dos.writeUTF(info);
			//dos.flush();
			//�����
			//String msg=dis.readUTF();
			//System.out.println(msg);
		//}
	}
}
