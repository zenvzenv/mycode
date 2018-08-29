package cn.zw.server.demo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ������������������
 * <p>Title:Server</p>
 * <p>Description:</p>
 * @author zhengwei
 * @date 2017-5-13 ����2:43:45
 */
public class Server1 {
	private ServerSocket server;
	public static void main(String[] args) {
		Server1 server=new Server1();
		server.start();
	}
	/**
	 * ��������
	 */
	public void start() {
		try {
			server = new ServerSocket(8888);
			this.receive();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * ���ܿͻ�������
	 */
	private void receive(){
		try {
			String msg=null;//���ܿͻ��˵�������Ϣ
			Socket client=server.accept();
			byte[] data=new byte[20480];
			int len=client.getInputStream().read(data);
			
			//���ܿͻ��˵�������Ϣ
			String requestInfo=new String(data,0,len).trim();
			System.out.println(requestInfo.toString());
		} catch (IOException e) {
			//e.printStackTrace();
		}
	}
	public void stop(){
		
	}
}
