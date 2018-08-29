package cn.zw.net.chartroom;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 创建服务器
 * 
 * @author zhengwei
 * @date 2017-5-12 下午11:10:29
 */
public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket server=new ServerSocket(9999);
		Socket socket=server.accept();
		//写出数据，输入流
		DataInputStream dis=new DataInputStream(socket.getInputStream());
		String msg=dis.readUTF();
		System.out.println("服务器受到了");
		//输出流
		DataOutputStream dos=new DataOutputStream(socket.getOutputStream());
		dos.writeUTF("服务器--->"+msg);
		dos.flush();
	}
}
