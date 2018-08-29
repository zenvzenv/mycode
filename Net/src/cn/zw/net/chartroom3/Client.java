package cn.zw.net.chartroom3;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 创建客户端，发送数据加接受数据
 * 写出数据，输出流
 * 读入数据，输入流
 * 
 * 获取名称
 * 
 * 存在的问题：输入流与输出流在同一个线程内，应该彼此独立
 * <p>Title:Client</p>
 * <p>Description:</p>
 * @author zhengwei
 * @date 2017-5-12 下午11:10:04
 */
public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("请输入昵称");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name=br.readLine();
		if(name.equals("")){
			return;
		}
		
		Socket client=new Socket("127.0.0.1", 9999);
		//控制台输入
		//BufferedReader console=new BufferedReader(new InputStreamReader(System.in));
		//DataOutputStream dos=new DataOutputStream(client.getOutputStream());
		new Thread(new Send(client,name)).start();
		new Thread(new Receive(client)).start();
		//DataInputStream dis=new DataInputStream(client.getInputStream());
		//while(true){
			//String info=console.readLine();
			//输出流
			//dos.writeUTF(info);
			//dos.flush();
			//输出流
			//String msg=dis.readUTF();
			//System.out.println(msg);
		//}
	}
}
