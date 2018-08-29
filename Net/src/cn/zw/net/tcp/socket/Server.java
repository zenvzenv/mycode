package cn.zw.net.tcp.socket;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 
 * <p>Title:Server</p>
 * 创建服务器，并指定端口ServerSocket(int port)
 * 接受客户端的连接，阻塞式
 * 发送数据和接受数据
 * @author zhengwei
 * @date 2017-5-12 下午10:35:12
 */
public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket server=new ServerSocket(888);
		while(true){//死循环，一个accept一个客户端
			Socket socket=server.accept();
			System.out.println("一个客户端建立连接");
			//发送数据
			String msg="欢迎使用";
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			bw.write(msg);
			bw.newLine();
			bw.flush();
		}
	}
}
