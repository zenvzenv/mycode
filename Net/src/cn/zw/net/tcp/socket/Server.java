package cn.zw.net.tcp.socket;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 
 * <p>Title:Server</p>
 * ��������������ָ���˿�ServerSocket(int port)
 * ���ܿͻ��˵����ӣ�����ʽ
 * �������ݺͽ�������
 * @author zhengwei
 * @date 2017-5-12 ����10:35:12
 */
public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket server=new ServerSocket(888);
		while(true){//��ѭ����һ��acceptһ���ͻ���
			Socket socket=server.accept();
			System.out.println("һ���ͻ��˽�������");
			//��������
			String msg="��ӭʹ��";
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			bw.write(msg);
			bw.newLine();
			bw.flush();
		}
	}
}
