package cn.zw.net.chartroom3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ����������
 * 
 * @author zhengwei
 * @date 2017-5-12 ����11:10:29
 */
public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket server=new ServerSocket(9999);
		Socket socket=server.accept();
		//д�����ݣ�������
		DataInputStream dis=new DataInputStream(socket.getInputStream());
		DataOutputStream dos=new DataOutputStream(socket.getOutputStream());
		while(true){
			String msg=dis.readUTF();
			System.out.println("�������յ���");
			//�����
			dos.writeUTF("������--->"+msg);
			dos.flush();
		}
	}
}
