package cn.zw.net.tcp.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 
 * <p>Title:Client</p>
 * 客户端,必须指定服务器端加端口，此时就在连接
 * 接受数据加发送数据
 * @author zhengwei
 * @date 2017-5-12 下午10:42:24
 */
public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket client=new Socket("127.0.0.1",888);
		//接受数据
		BufferedReader br=new BufferedReader(new InputStreamReader(client.getInputStream()));
		String msg=br.readLine();
		System.out.println(msg);
	}
}
